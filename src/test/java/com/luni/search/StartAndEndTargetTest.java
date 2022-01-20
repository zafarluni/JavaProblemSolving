package com.luni.search;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

@Disabled
public class StartAndEndTargetTest {

	@DisplayName("Should find start and end target.")
	@ParameterizedTest
	@MethodSource("arrayToItemFound")
	void testSearchItemFound(int[] inputArray, int item, int[] expected) {
		StartAndEndTarget startAndEndTarget = new StartAndEndTarget();
		Assertions.assertArrayEquals(startAndEndTarget.search(inputArray, item), expected);
	}

	@DisplayName("Should return [-1,-1] false when item not found in array.")
	@ParameterizedTest
	@MethodSource("arrayToItemNotFound")
	void testSearchItemNotFound(int[] inputArray, int item, int[] expected) {
		StartAndEndTarget startAndEndTarget = new StartAndEndTarget();
		Assertions.assertArrayEquals(startAndEndTarget.search(inputArray, item), expected);
	}

	private static Stream<Arguments> arrayToItemFound() {
		return Stream.of(
				Arguments.of(new int[] { 1 }, 1, new int[] { 0, 0 }),

				Arguments.of(new int[] { 1, 2 }, 2, new int[] { 1, 1 }),

				Arguments.of(new int[] { 1, 2, 3, 3, 4, 5 }, 3, new int[] { 2, 3 }),

				Arguments.of(new int[] { 1, 2, 3, 3, 3, 3, 5 }, 1, new int[] { 2, 5 }),

				Arguments.of(new int[] { -100, -1, 0, 100, 100, 200, 500 }, 100, new int[] { 3, 4 }));
	}

	private static Stream<Arguments> arrayToItemNotFound() {
		return Stream.of(
				Arguments.of(new int[] {}, 100, new int[] { -1, -1 }),

				Arguments.of(new int[] { 1 }, 5, new int[] { -1, -1 }),

				Arguments.of(new int[] { 1, 2, 3 }, 20, new int[] { -1, -1 }),

				Arguments.of(new int[] { 75, 85, 95, 105, 221, 500 }, 222, new int[] { -1, -1 }));
	}

}