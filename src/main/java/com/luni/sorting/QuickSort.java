package com.luni.sorting;

public class QuickSort {
	public void sort(int[] arr) {
		 partition(arr, 0, arr.length -1);
	}

	private void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public void partition(int[] arr, int low, int high) {

		if (low < high) {			
				int pivot = arr[high];

				int i = low;
				for (int j = low ; j < high; j++) {
					if (arr[j] < pivot) {
						swap(arr, i, j);
						i++;
					}
				}
				swap(arr, i, high);

				partition(arr, i + 1, high);
				partition(arr, low, i-1);
			}
	}
}