package com.bl;

public class Stack<K> {
	public final MyLinkedList<K> myLinkedList;

	public Stack() {
		myLinkedList = new MyLinkedList<>();
	}

	public void push(INode<K> element) {
		myLinkedList.addNode(element);
	}

	public INode<K> peak() {
		return myLinkedList.head;
	}

	public INode<K> pop() {
		return myLinkedList.pop();
	}

	public void printStack() {
		myLinkedList.display();
	}
}