package labsheet;

import java.util.Scanner;

public class Bubblesort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
		}
		sc.close();
		Bubble_Sort(arr);
		System.out.println();
		}
		private static void Bubble_Sort(int[] arr) {
			for (int i = 0; i < arr.length ; i++) {
				for (int j = 0; j < arr.length-1-i ; j++) {
				if (arr[j]>arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
				}
				}
				System.out.println("Sorted array:");
				for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
				}
				}
				}


	


