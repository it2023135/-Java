/**
 * This code is part of the lab exercises for the Data Structures course at Harokopio
 * University of Athens, Dept. of Informatics and Telematics.
 */
package org.hua.stack;

/**
 * A stack implemented as a linked list
 *  
 * @param <E> the element type
 */
public class LinkedStack<E> implements Stack<E> {
        
        private Node<E> head;
	private int size;

        public LinkedStack(Node<E> head, int size) {
            this.head = null;
            this.size = 0;
        }
        
        
	
	@Override
	public void push(E elem) {
            Node<E> n = new Node<>();
            n.data = elem;
            n.next = head;
            head = n;
            size++;
		
	}

	@Override
	public E pop() {
            if (head == null) {
                throw new IllegalArgumentException("Cannot pop from empty stack");
            }
            
            E result = head.data;
            head = head.next;
            size--;
            return result;
	}

	@Override
	public E top() {
            if (head == null) {
                throw new IllegalArgumentException("Cannot pop from empty stack");
            }
            return head.data;
	}

	@Override
	public boolean isEmpty() {
            return head == null;
	}

	@Override
	public int size() {
            return size;
	}

	@Override
	public void clear() {
            head = null;
            size = 0;		
	}

	private static class Node<E> {
            public E data;
            public Node<E> next;      
        }
	
}
