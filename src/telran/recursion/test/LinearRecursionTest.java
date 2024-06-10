package telran.recursion.test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.recursion.LinearRecursionMethods.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinearRecursionTest {
	
	int [] numbers;
	
	@BeforeEach
	void setUp() {
		numbers = new int [] {1,2,3,4,5};
	}
	
	@Test
	void factorialTest() {
		assertEquals(24, factorial(4)); 
		assertEquals(120, factorial(5));
	}
	
	@Test
	void xPowerY1Test() {
		assertEquals(100, xPowerY1(10,2)); 
		assertEquals(100, xPowerY1(-10,2));
		assertEquals(1000, xPowerY1(10,3));
		assertEquals(-1000, xPowerY1(-10,3));
		assertEquals(1, xPowerY1(1000,0));
		assertEquals(1, xPowerY1(-1000,0));
	}
	
	@Test
	void xPowerY2Test() {
		assertEquals(100, xPowerY2(10,2)); 
		assertEquals(100, xPowerY2(-10,2));
		assertEquals(1000, xPowerY2(10,3));
		assertEquals(-1000, xPowerY2(-10,3));
		assertEquals(1, xPowerY2(1000,0));
		assertEquals(1, xPowerY2(-1000,0));
	}
	
	@Test
	void displayArrayTest() {
		System.out.println("direct");
		displayArray(numbers);
		System.out.println();
	}
	
	@Test
	void displayArrayReversedTest() {
		System.out.println("reversed");
		displayArrayReversed(numbers);
		System.out.println();
	}
	
	@Test
	void sumTest() {
		assertEquals(15, sum(numbers));
	}
	
	@Test
	void reverseTest() {
		reverse(numbers);
		int [] expected = {5,4,3,2,1};
		assertArrayEquals(expected, numbers);
	}
	
	@Test
	void squareTest() {
		assertEquals(100, square(10));
		assertEquals(100, square(-10));
	}
	
	@Test
	void isSubstringTest() {
		String str = "blablablabladablbladdal";
		assertTrue(isSubstring(str,"blab"));
		assertTrue(isSubstring(str,"adda"));
		assertTrue(isSubstring(str,"ablabla"));
		assertTrue(isSubstring(str,"dd"));
		assertFalse(isSubstring(str,"blal"));
		assertFalse(isSubstring(str,"bladds"));
		assertFalse(isSubstring(str,"daba"));
	}
}
