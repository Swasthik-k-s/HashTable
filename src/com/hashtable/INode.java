package com.hashtable;

/**
 * Every node must have these methods to create the node
 * @author Swasthik
 * @param <K>
 */
public interface INode<K> {
	K getKey();
	
	public void setKey(K key);
	
	public void setNext(INode<K> next);
	
	public INode<K> getNext();
}
