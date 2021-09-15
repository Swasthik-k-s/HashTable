package com.hashtable;

public class MyMapNode<K,V> implements INode<K> {
	private K key;
	private V value;
	private MyMapNode<K,V> next;
	
	MyMapNode(K key, V value){
		this.key = key;
		this.value = value;
		next = null;
	}
	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = (MyMapNode<K, V>) next;
	}

	@Override
	public INode<K> getNext() {
		return this.next;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "key= ").append(key).append(", Value = ").append(value).append('}');
		if (next != null) {
			myMapNodeString.append("->").append(next);
		}
		return myMapNodeString.toString();
	}
}
