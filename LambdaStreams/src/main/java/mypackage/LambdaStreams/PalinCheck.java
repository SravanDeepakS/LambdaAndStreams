package mypackage.LambdaStreams;

import java.util.*;
import java.util.function.Predicate;

public class PalinCheck 
{
	public static List<String> palindrome(List<String> s){
		Predicate<String> predicate = PalinCheck::checking;
		List<String> finalStrings=new ArrayList<String>();
		for(String i:s) {
			if(predicate.test(i))
				finalStrings.add(i);
		}
		return finalStrings;	
	}	
	public static boolean checking(String s) 
	{
		int len=s.length();
		for(int i=0;i<len/2;i++)
			if(s.charAt(i)!=s.charAt(len-i-1))
				return false;
		return true;
	}
}
