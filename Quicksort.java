package labsheet;

import java.util.Scanner;

public class Quicksort {
	public static void quickSort(int[] arr, int p, int r) {
		if (p < r) {
		int pivot = partition(arr, p, r);
		quickSort(arr, p, pivot - 1);
		quickSort(arr, pivot + 1, r);
		}
		}
		private static int partition(int[] arr, int p, int r) {
		int pivot = arr[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
		if (arr[j] < pivot) {
		i++;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		return i + 1;
		}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
		}
		quickSort(arr,0,arr.length - 1);
		System.out.println("Sorted array:");
		for (int i = 0; i < n; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
		}
	}


