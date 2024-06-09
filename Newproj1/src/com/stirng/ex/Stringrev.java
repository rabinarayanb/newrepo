package com.stirng.ex;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdefgh";
		
		for(int i=str.length()-1; i>=0;i--) {
			//System.out.println("Reverse of the string is::");
			System.out.print(str.charAt(i));
			
		}
	}
}
