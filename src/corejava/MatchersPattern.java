package corejava;

import java.util.regex.Pattern;

public class MatchersPattern {
	
	public static void main(String args[]){  
		System.out.println(Pattern.matches("[amn]", "am"));//false (Either only one character can be Present)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
		}}  


