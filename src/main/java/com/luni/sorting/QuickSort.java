package com.luni.sorting;

public final class QuickSort {
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	private void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int partition = partition(arr, low, high);
			quickSort(arr, partition + 1, high);
			quickSort(arr, low, partition - 1);
		}
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				swap(arr, i, j);
				i++;
			}
		}

		swap(arr, i, high);
		return i;
	}
}