package com.hashtable;

public class MyLinkedList<K,V> {
	MyMapNode<K,V> head;
	MyMapNode<K,V> tail;
	
	/**
	 * Method to append the new node
	 * @param newNode
	 */
	public void append(MyMapNode<K,V> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	/**
	 * Method to search the key from the available nodes
	 * @param key
	 * @return
	 */
	public MyMapNode<K,V> search(K key){
		MyMapNode<K,V> temp = head;
		while(temp != null && temp.getNext() != null) {
			if(temp.getKey().equals(key)) {
				return temp;
			}
			temp = (MyMapNode<K, V>) temp.getNext();
		}
		return null;
	}
	
	public String printNodes() {
		return "My Node[ " + head + " ]";
	}

	@Override
	public String toString() {
		return "My Node[ " + head + " ]";
	}
	
	
}
