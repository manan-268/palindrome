package com.odx.test.model;

import net.bytebuddy.asm.Advice.This;

public class String {
	
	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public boolean isEmpty() {
		return true;
	}

	public int length() {
		return this.string.length();
	}

	public String substring(int i, int j) {
		return this.string.substring(i, j);
	}

	public Object charAt(int i) {
		// TODO Auto-generated method stub
		return this.string.charAt(i);
	}

}