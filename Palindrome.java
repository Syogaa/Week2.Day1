package week2.day1.assignments;

public class Palindrome {
public static void main(String[] args) 
{
	//To find the given string is Palindrome or not
	String str = "madam";
	String revStr = "";
	int strLen = str.length();
	for (int i = (strLen - 1); i>=0; --i)
	{
		revStr = revStr + str.charAt(i);
	}
	if (str.toLowerCase().equals(revStr.toLowerCase()))
	{
		System.out.println(str + " is a Palindrome String.");
	}
	else
	{
		System.out.println(str + " is not a Palindrome String.");
	}
}
}
