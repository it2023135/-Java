/**
 * This code is part of the lab exercises for the Data Structures course at Harokopio
 * University of Athens, Dept. of Informatics and Telematics.
 */
package org.hua.stack;

import static org.junit.Assert.*;

import org.hua.stack.ArrayStack;
import org.hua.stack.LinkedStack;
import org.hua.stack.Stack;
import org.junit.Test;

public class StackTest {

	@Test
	public void testArrayStack() {
		checkStack(new ArrayStack<>());
	}

	@Test
	public void testLinkedStack() {
		checkStack(new LinkedStack<>());
	}

	private void checkStack(Stack<Integer> s) {
		s.clear();

		int count = 100000;

		for (int i = 0; i < count; i++) {
			s.push(i);
			assertTrue(s.size() == i + 1);
			assertTrue(s.top() == i);
		}

		int current = count - 1;
		while (!s.isEmpty()) {
			assertTrue(s.top() == current);
			s.pop();
			current--;
		}
		assertTrue(s.isEmpty());
	}

}
