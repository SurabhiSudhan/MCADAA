package labsheet;

import java.util.Scanner;

public class Mergesort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");

		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the array elements:");

		for (int i = 0; i < n; i++) {

		arr[i] = sc.nextInt();

		}

		MergeSortRec(arr, 0, arr.length - 1);

		System.out.println("Sorted array:");

		for (int i = 0; i < n; i++) {

		System.out.print(arr[i] + " ");

		}

		System.out.println();

		}

		public static void MergeSortRec(int arr[], int p, int r) {

		if (p < r) {

		int q = (int) Math.floor((p + r) / 2);

		MergeSortRec(arr, p, q);

		MergeSortRec(arr, q + 1, r);

		Merge(arr, p, q, r);

		}

		}

		private static void Merge(int[] arr, int p, int q, int r) {

		int n1 = q - p + 1;

		int n2 = r - q;

		int L[] = new int[n1];

		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {

		L[i] = arr[p + i];

		}

		for (int j = 0; j < n2; j++) {

		R[j] = arr[q + j + 1];

		}

		int i = 0, j = 0;

		for (int k = p; k <= r; k++) {

		if (i < n1 && (j >= n2 || L[i] <= R[j])) {

		arr[k] = L[i];

		i++;

		} else {

		arr[k] = R[j];

		j++;

		}

		}

		}


	




	

	}


