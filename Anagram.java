package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	//To check whether two strings are anagrams of each other
	String str1 = "stops";
	String str2 = "potss";
	
	if (str1.length() == str2.length())
	{
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();

		boolean flag = false;
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		for (int i=0; i < charArr1.length; i++)
		{
			if (charArr1[i] == charArr2[i])
				flag = true;
			else
				break;
		}
		if (flag)
		{
			System.out.println(str1 + " and " + str2 + " are Anagram");
		}
		else 
		{
			System.out.println(str1 + " and " + str2 + " are not a Anagram");
		}
	}
	else
		System.out.println(str1 + " and " + str2 + " are not of equal length");		
		}
	}