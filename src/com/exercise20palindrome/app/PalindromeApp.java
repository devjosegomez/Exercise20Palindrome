package com.exercise20palindrome.app;
import com.exercise20palindrome.model.StringApplications;
public class PalindromeApp {

	public static void main(String[] args) {
		String cadPalindrome1 = "Anita lava la tina."; //true
		String cadPalindrome2 = "Was it a cat I saw?"; //true
		String cadPalindrome3 = "No lemon, no melone?"; //false
		
		System.out.println(StringApplications.isPalindrome(cadPalindrome1));
		System.out.println(StringApplications.isPalindrome(cadPalindrome2));
		System.out.println(StringApplications.isPalindrome(cadPalindrome3));
		
	}

}
