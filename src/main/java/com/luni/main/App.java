package com.luni.main;

import java.util.*;
import com.luni.sorting.*;

public class App {
	public static void main(String []args) {

		System.out.println("=============================");
		
		int[] arr = { 3, 6, 5, 1, 4, 2 };
		QuickSort sort = new QuickSort();

		System.out.println("Before => " + Arrays.toString(arr));

		sort.partition(arr, 0, arr.length -1);

		System.out.println("After => " + Arrays.toString(arr));
	}
}
