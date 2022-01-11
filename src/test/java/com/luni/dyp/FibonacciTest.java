package com.luni.dyp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.luni.dyp.Fibonacci;

public class FibonacciTest {

	@DisplayName("Should calculate the correct Fibonacci")
  @ParameterizedTest(name = "{index} => number={0}, Fibonacci={2}")
	@CsvSource({
		"0, 0",
		"1, 1",
		"2, 1",
		"10, 55",
		"17, 1597",
		"22, 17711",
		"37, 24157817",
		"49, 7778742049",
	})
	void testFibonacci(int number, long fibonacci) {				
		Assertions.assertEquals(fibonacci, Fibonacci.fibonacci(number));
	}
}