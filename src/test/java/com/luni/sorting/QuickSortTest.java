package com.luni.sorting;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

public class QuickSortTest {

	@DisplayName("Should sort item of array properly.")
	@ParameterizedTest
	@MethodSource("arraysToSort")
	void testMinSteps(int[] inputArray, int[] sortedArray) {

		QuickSort qsort = new QuickSort();
		qsort.sort(inputArray);

		Assertions.assertArrayEquals(inputArray, sortedArray);
	}

	private static Stream<Arguments> arraysToSort() {
		return Stream.of(Arguments.of(new int[] {}, new int[] {}),

				Arguments.of(new int[] { 1 }, new int[] { 1 }),

				Arguments.of(new int[] { 2, 1 }, new int[] { 1, 2 }),

				Arguments.of(new int[] { 2, 1, 3 }, new int[] { 1, 2, 3 }),

				Arguments.of(new int[] { 5, 4, 3, 8, 2, 1 }, new int[] { 1, 2, 3, 4, 5, 8 }),

				Arguments.of(new int[] { 10, 20, 30, 80, 200, 70, 60, 50 }, new int[] { 10, 20, 30, 50, 60, 70, 80, 200 }),

				Arguments.of(new int[] { 10, 15, 30, 5, 2, 4, 10, 5 }, new int[] { 2, 4, 5, 5, 10, 10, 15, 30 }),

				Arguments.of(new int[] { 75, 85, 15, 5, 19, 21, 27 }, new int[] { 5, 15, 19, 21, 27, 75, 85 }));
	}
}