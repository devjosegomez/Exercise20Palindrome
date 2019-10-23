package com.exercise20palindrome.model;

public class StringApplications {
	
	public static boolean isPalindrome(String cad) {
		boolean isPal = true;
		String cadClean = cad.replace(" ", "");
		cadClean =  cadClean.replace(".", "");
		cadClean =  cadClean.replace("!", "");
		cadClean =  cadClean.replace("?", "");
		cadClean =  cadClean.replace(",", "");
		cadClean =  cadClean.toLowerCase();
		
		for(int i=0; i<cadClean.length(); i++) {
			if(cadClean.charAt(i) != (cadClean.charAt((cadClean.length()-1)-i))) {
				isPal=false;
			}
		}
		
		System.out.println("[" + cadClean + "] == [" + cad + "] ");
		return isPal;
	}
}
