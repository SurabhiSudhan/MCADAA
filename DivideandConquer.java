package labsheet;

public class DivideandConquer {
	public static boolean findIndex(int[] arr) {

		int low = 0;

		int high = arr.length - 1;

		while (low <= high) {

		int mid = (low + high) / 2;

		if (arr[mid] == mid) {

		return true;

		} else if (arr[mid] > mid) {

		high = mid - 1;

		} else {

		low = mid + 1;

		}

		}

		return false;

		}

		public static void main(String[] args) {

		int[] arr = { -2, 0, 2, 3, 6, 7, 9 };

		boolean found = findIndex(arr);

		System.out.println("Index found? " + found);

		}

		

	}


