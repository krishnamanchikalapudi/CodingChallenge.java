package solutions.hackerrank.interview.arrays.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import solutions.hackerrank.interview.arrays.NewYearChaos;

/**
 * 
 * Problem:
 */
class NewYearChaosTests {
	private final NewYearChaos tests = new NewYearChaos();

	@Test
	void test1() {
		List<Integer> q = Arrays.asList(2, 1, 5, 3, 4);
        String actual = tests.solution(q);
        String expect = "3";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
    }

	@Test
	void test2() {
		List<Integer> q = Arrays.asList(2, 5, 1, 3, 4);
        String actual = tests.solution(q);
        String expect = "Too chaotic";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
	}

	@Test
	void test3() {
		List<Integer> q = Arrays.asList( 5, 1, 2, 3, 7, 8, 6, 4);
        String actual = tests.solution(q);
        String expect = "Too chaotic";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
	}
    @Test
	void test4() {
		List<Integer> q = Arrays.asList( 1, 2, 5, 3, 7, 8, 6, 4);
        String actual = tests.solution(q);
        String expect = "7";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
	}
    @Test
	void test5() {
		List<Integer> q = Arrays.asList( 1, 2, 5, 3, 4, 7, 8, 6);
        String actual = tests.solution(q);
        String expect = "4";
        System.out.println("Actual: "+ actual +"; Expect: "+ expect);
        assertEquals(expect, actual);
	}

}
