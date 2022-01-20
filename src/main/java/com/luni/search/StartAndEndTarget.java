package com.luni.search;

public final class StartAndEndTarget {
	public int[] search(int[] arr, int item) {
		return new int[] {};
	}

	private int searchStartEnd(int[] arr, int item, int low, int high, Integer tempL, Integer tempR) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (item == arr[mid]) {
				

			} else if (item > arr[mid]) {

				return searchStartEnd(arr, item, mid + 1, high, tempL, tempR);

			} else if (item < arr[mid]) {

				return searchStartEnd(arr, item, low, mid - 1, tempL, tempR);
			}
		}
		return -1;
	}
}