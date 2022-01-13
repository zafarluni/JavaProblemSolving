package com.luni.search;

public final class BinarySearch {
	public boolean search(int[] arr, int item) {
		return binarySearch(arr, item, 0, arr.length - 1);
	}

	private boolean binarySearch(int[] arr, int item, int low, int high) {
		if (low <= high) {
			int mid = (int) (high + low) / 2;

			if (item == arr[mid]) {
				return true;
			} else if (item > arr[mid]) {
				return binarySearch(arr, item, mid + 1, high);
			} else if (item < arr[mid]) {
				return binarySearch(arr, item, low, mid - 1);
			}
		}
		return false;
	}
}