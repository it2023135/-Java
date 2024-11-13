/**
 * This code is part of the lab exercises for the Data Structures course at Harokopio
 * University of Athens, Dept. of Informatics and Telematics.
 */
package org.hua.stack;

/**
 * A stack
 *
 * @param <E> the element type
 */
public interface Stack<E> {

	/**
	 * Push a new element into the stack
	 * 
	 * @param elem the element
	 */
	void push(E elem);
	
	/**
	 * Pop an element from the stack
	 */
	E pop();
	
	/**
	 * Return the top of the stack 
	 * @return the top of the stack
	 */
	E top();
	
	/**
	 * Check if a stack is empty
	 * 
	 * @return true if empty, false otherwise
	 */
	boolean isEmpty();
	
	/**
	 * Get the size of the stack
	 * 
	 * @return the size of the stack
	 */
	int size();
	
	/**
	 * Clear the stack
	 */
	void clear();
	
}
