package labsheet;

import java.util.Scanner;

public class Selectionsort {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr =new int[n];
		System.out.println("Enter the array elements:");
		for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
		}
		sc.close();
		Selection_Sort(arr);
		System.out.println();
		}
		private static void Selection_Sort(int[] arr) {
		int j,ind;
		for(int i = 0; i <arr.length ; i++) {
		ind=0;
		for(j = 1; j <arr.length - i ; j++) {
		if(arr[j]>arr[ind]){
		ind=j;
		}
		}
		int temp = arr[arr.length-i-1];
		;
		arr[arr.length-i-1]= arr[ind];
		arr[ind] = temp;
		}
		System.out.println("Sorted array:");
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		}
		}


	

	


