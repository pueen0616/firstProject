package com.yedam.generic;

public class Container<T, M> {
	private T key;
	private M value;
	
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public M getValue() {
		return value;
	}
	public void setValue(M value) {
		this.value = value;
	}
}
