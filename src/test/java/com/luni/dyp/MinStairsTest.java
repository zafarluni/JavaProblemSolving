package com.luni.dyp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import com.luni.dyp.MinStairs;

public class MinStairsTest {

	@DisplayName("Should calculate the minium number of steps")
  @ParameterizedTest(name = "{index} => steps={0}, Stairs={2}")
	@MethodSource("minStepsToStairs")	
	void testMinSteps(int minSteps, int[] stairs) {				
		Assertions.assertEquals(minSteps, MinStairs.getMinSteps(stairs));
	}

	private static Stream<Arguments> minStepsToStairs() {
    return Stream.of(
            Arguments.of(29, new int[]{10, 15, 30, 5, 2, 4, 10, 5}),
            Arguments.of(31, new int[]{16, 19, 10, 12, 18}),
            Arguments.of(9, new int[]{2, 5, 3, 1, 7, 3, 4})
    );
}
}