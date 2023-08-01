package com.string;

public class Reversesentence {

	public static void main(String[] args) {
	String input="java Code";
	String output ="";
	String[] Words =input.split(" ");
	for(String word : Words) {
	String revword=" ";
	for(int i= word.length()-1;i>=0;i--) {
		revword = revword + word.charAt(i);
		
	}
	output=output+revword+" ";
	System.out.println(output);

	}

}
}
