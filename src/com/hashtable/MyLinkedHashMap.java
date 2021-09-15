package com.hashtable;

import java.util.*;

public class MyLinkedHashMap<K,V> {
	private final int bucketSize;
	ArrayList<MyLinkedList<K,V>> bucketList;
	
	public MyLinkedHashMap() {
		bucketSize = 10;
		bucketList = new ArrayList<>(bucketSize);
		for(int i=0;i<bucketSize;i++) {
			bucketList.add(null);
		}
	}
	
	public int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index= hashCode % bucketSize;
		return index;
	}
	
	/**
	 * Method to add the Node into Linked List
	 * @param key
	 * @param value
	 */
	public void add(K key,V value) {
		int index=getBucketIndex(key);
		MyLinkedList<K,V> myLinkedList = bucketList.get(index);
		if(myLinkedList==null) {
			myLinkedList= new MyLinkedList<>();
			bucketList.set(index, myLinkedList);
		}
		MyMapNode<K,V> myMapNode = myLinkedList.search(key);
		if(myMapNode==null) {
			myMapNode= new MyMapNode<>(key,value);
			myLinkedList.append(myMapNode);
		}
		myMapNode.setValue(value);
	}
	
	/**
	 * Method to get the Key of the LinkedList
	 * @param key
	 * @return
	 */
	public V get(K key) {
		int index=getBucketIndex(key);
		MyLinkedList<K,V> myLinkedList = bucketList.get(index);
		if(myLinkedList==null) {
			return null;
		}
		MyMapNode<K,V> myMapNode = myLinkedList.search(key);
		if(myMapNode==null) {
			return null;
		}
		return myMapNode.getValue();
	}
	
	/**
	 *Method to print the content
	 */
	public String toString() {
		return "MyLinkedHashMap List{"+ bucketList + '}';
	}
}
