package com.hashtable;

public class MyHashMap<K,V> {
	MyLinkedList<K,V> myLinkedList;
	
	MyHashMap(){
		myLinkedList = new MyLinkedList<>();
	}
	
	/**
	 * Method to add the node into the LinkedList
	 * @param key
	 * @param value
	 */
	public void add(K key, V value) {
		MyMapNode<K,V> myMapNode = myLinkedList.search(key);
		if(myMapNode == null) {
			MyMapNode<K,V> newNode = new MyMapNode<>(key,value);
			myLinkedList.append(newNode);
		} else {
			myMapNode.setValue(value);
		}
	}
	
	/**
	 * Method to get the key from the node
	 * @param key
	 * @return
	 */
	public V get(K key) {
		MyMapNode<K, V> myMapNode = myLinkedList.search(key);
		if (myMapNode == null) {
			return null;
		}
		return myMapNode.getValue();
	}
	
	public String toString() {
		return "MyHashMap [myLinkedList=" + myLinkedList.printNodes() + "]";
	}
	
}
