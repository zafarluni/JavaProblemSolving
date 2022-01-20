package com.luni.trees.binaryTree;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

public class BinarySearchTreeTest {

	@DisplayName("Should build and parse Binary Tree in pre-order traversal.")
	@ParameterizedTest
	@MethodSource("arraysToPreOrderTreeParsing")
	void testPreOrderTreeTraversal(int[] inputArray, int[] expectedArray) {
		BinarySearchTree<Integer> intTree = new BinarySearchTree<>();
		fillTree(intTree, inputArray);

		int[] arr = intTree.getPreOrder().stream().mapToInt(i -> i).toArray();

		Assertions.assertArrayEquals(expectedArray, arr);
	}

	@DisplayName("Should build and parse Binary Tree in post-order traversal.")
	@ParameterizedTest
	@MethodSource("arraysToPostOrderTreeParsing")
	void testPostOrderTreeTraversal(int[] inputArray, int[] expectedArray) {
		BinarySearchTree<Integer> intTree = new BinarySearchTree<>();
		fillTree(intTree, inputArray);

		int[] arr = intTree.getPostOrder().stream().mapToInt(i -> i).toArray();

		Assertions.assertArrayEquals(expectedArray, arr);
	}

	@DisplayName("Should build and parse Binary Tree in in-order traversal.")
	@ParameterizedTest
	@MethodSource("arraysToInOrderTreeParsing")
	void testInOrderTreeTraversal(int[] inputArray, int[] expectedArray) {
		BinarySearchTree<Integer> intTree = new BinarySearchTree<>();
		fillTree(intTree, inputArray);

		int[] arr = intTree.getInOrder().stream().mapToInt(i -> i).toArray();

		Assertions.assertArrayEquals(expectedArray, arr);
	}

	private static void fillTree(BinarySearchTree<Integer> tree, int[] array) {
		for (int i : array) {
			tree.add(i);
		}
	}

	private static Stream<Arguments> arraysToInOrderTreeParsing() {
		return Stream.of(Arguments.of(new int[] {}, new int[] {}),

				Arguments.of(new int[] { 1 }, new int[] { 1 }),

				Arguments.of(new int[] { 2, 1 }, new int[] { 1, 2 }),

				Arguments.of(new int[] { 2, 1, 3 }, new int[] { 1, 2, 3 }),

				Arguments.of(new int[] { 5, 4, 3, 8, 2, 1 }, new int[] { 1, 2, 3, 4, 5, 8 }),

				Arguments.of(new int[] { 10, 20, 30, 80, 200, 70, 60, 50 }, new int[] { 10, 20, 30, 50, 60, 70, 80, 200 }),

				Arguments.of(new int[] { 10, 15, 30, 5, 2, 4, 10, 5 }, new int[] { 2, 4, 5, 5, 10, 10, 15, 30 }),

				Arguments.of(new int[] { 75, 85, 15, 5, 19, 21, 27 }, new int[] { 5, 15, 19, 21, 27, 75, 85 }),

				Arguments.of(new int[] { 75, 85, 15, 5, 19, 21, 27, 19 }, new int[] { 5, 15, 19, 19, 21, 27, 75, 85 }));
	}

	private static Stream<Arguments> arraysToPreOrderTreeParsing() {
		return Stream.of(Arguments.of(new int[] {}, new int[] {}),

				Arguments.of(new int[] { 1 }, new int[] { 1 }),

				Arguments.of(new int[] { 2, 1 }, new int[] { 2, 1 }),

				Arguments.of(new int[] { 2, 1, 3 }, new int[] { 2, 1, 3 }),

				Arguments.of(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }),

				Arguments.of(new int[] { 5, 4, 3, 8, 2, 1 }, new int[] { 5, 4, 3, 2, 1, 8 }),

				Arguments.of(new int[] { 10, 15, 30, 5, 2, 4, 10, 5 }, new int[] { 10, 5, 2, 4, 5, 15, 10, 30 }),

				Arguments.of(new int[] { 75, 85, 15, 5, 19, 21, 27, 19 }, new int[] { 75, 15, 5, 19, 21, 19, 27, 85 }));
	}

	private static Stream<Arguments> arraysToPostOrderTreeParsing() {
		return Stream.of(Arguments.of(new int[] {}, new int[] {}),

				Arguments.of(new int[] { 1 }, new int[] { 1 }),

				Arguments.of(new int[] { 2, 1 }, new int[] { 1, 2 }),

				Arguments.of(new int[] { 2, 1, 3 }, new int[] { 1, 3, 2 }),

				Arguments.of(new int[] { 5, 4, 3, 8, 2, 1 }, new int[] { 1, 2, 3, 4, 8, 5 }),

				Arguments.of(new int[] { 10, 15, 30, 5, 2, 4, 10, 5 }, new int[] { 4, 2, 5, 5, 10, 30, 15, 10}),

				Arguments.of(new int[] { 75, 85, 15, 5, 19, 21, 27, 19 }, new int[] { 5, 19, 27, 21, 19, 15, 85, 75 }));
	}
}