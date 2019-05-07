package com.fekade.JUnit;


public class StringManipulation {
		
	public String reverseString(String str) {
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		return reverse;
	}
	
	public int countLetter(String str) {//find the number of a particular letter,Eg 'a', in a string 
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='A') {
				count++;
			}
		}
		return count;
	}

}
