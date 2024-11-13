/**
 * This code is part of the lab exercises for the Data Structures course at Harokopio
 * University of Athens, Dept. of Informatics and Telematics.
 */
package org.hua.stack;

import java.io.IOException;

public class App {

	public static void main(String args[]) throws IOException {

		int ch, top;
		boolean correct = true;
		Stack<Integer> s = new ArrayStack<>();

		while ((ch = System.in.read()) != -1) {
			if (ch == '(' || ch == '{') {
				s.push(ch);
			} else if (ch == ')') {
				if (s.isEmpty()) {
					correct = false;
					break;
				}
				top = s.top();
				s.pop();
				if (top != '(') {
					correct = false;
					break;
				}
			} else if (ch == '}') {
				if (s.isEmpty()) {
					correct = false;
					break;
				}
				top = s.top();
				s.pop();
				if (top != '{') {
					correct = false;
					break;
				}
			}
		}
		
		if (!s.isEmpty()) { 
			correct = false;
		}
		
		if (correct) { 
			System.out.println("OK");
		} else { 
			System.out.println("ERROR");
		}

	}

}
