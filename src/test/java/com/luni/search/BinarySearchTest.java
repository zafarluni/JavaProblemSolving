package com.luni.search;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

public class BinarySearchTest {

	@DisplayName("Should return true when item  is found in array.")
	@ParameterizedTest
	@MethodSource("arrayToItemFound")
	void testBinarySearchItemFound(int[] inputArray, int item) {
		BinarySearch bSearch = new BinarySearch();
		Assertions.assertTrue(bSearch.search(inputArray, item));
	}

	@DisplayName("Should return false when item not found in array.")
	@ParameterizedTest
	@MethodSource("arrayToItemNotFound")
	void testBinarySearchItemNotFound(int[] inputArray, int item) {
		BinarySearch bSearch = new BinarySearch();
		Assertions.assertFalse(bSearch.search(inputArray, item));
	}

	private static Stream<Arguments> arrayToItemFound() {
		return Stream.of(Arguments.of(new int[] { 100 }, 100),

				Arguments.of(new int[] { 1, 2 }, 2),

				Arguments.of(new int[] { 1, 2, 3 }, 2),

				Arguments.of(new int[] { 1, 2, 3 }, 1),

				Arguments.of(new int[] { -100, -1, 0, 100, 200, 500 }, 100),

				Arguments.of(new int[] { -100, -1, 0, 100, 200, 500 }, -100),

				Arguments.of(new int[] { 75, 85, 95, 105, 221, 500 }, 221));
	}

	private static Stream<Arguments> arrayToItemNotFound() {
		return Stream.of(Arguments.of(new int[] {}, 100),

				Arguments.of(new int[] { 1, 2 }, 5),

				Arguments.of(new int[] { 1, 2, 3 }, 20),

				Arguments.of(new int[] { 75, 85, 95, 105, 221, 500 }, 222));
	}

}