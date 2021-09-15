package com.hashtable;

public class MyHashMap<K,V> {
	MyLinkedList<K,V> myLinkedList;
	
	MyHashMap(){
		myLinkedList = new MyLinkedList<>();
	}
	
	public void add(K key, V value) {
		MyMapNode<K,V> myMapNode = myLinkedList.search(key);
		if(myMapNode == null) {
			MyMapNode<K,V> newNode = new MyMapNode<>(key,value);
			myLinkedList.append(newNode);
		} else {
			myMapNode.setValue(value);
		}
	}
	
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
