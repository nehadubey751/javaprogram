package com.string;

public class RemoveDupilcate {

	public static void main(String[] args) {
		String str ="Neeha";
		
		StringBuffer sf=new StringBuffer();
		str.chars().distinct().forEach(c->sf.append((char )c));
		System.out.println(sf);
	}

}
