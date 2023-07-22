package labsheet;

import java.util.Scanner;

public class Insertionsort {
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
		Insertion_sort(arr);
		System.out.println();
		}
		private static void Insertion_sort(int[] arr) {
			for (int i = 1; i <arr.length ; i++) {
				int key = arr[i];
				int j = i-1;
				while(j>=0 && arr[j] > key){
				arr[j+1]=arr[j];
				j = j-1;
				}
				arr[j+1] = key;
				}
				System.out.println("Sorted array:");
				for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
				}
				}


		

	

	}


