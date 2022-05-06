package week2.day1.assignments;

public class CharOccurance {
public static void main(String[] args) {
	//To check number of occurrences of a char (eg 'e') in a String
	String str = "welcome to chennai";
	char[] charArr = str.toCharArray();
	int count = 0;
	for (int i = 0; i < charArr.length; i++)
	{
		if (charArr[i] == 'e')
		{
		count++;
		}
		}
	System.out.println("No. of occurrences of a character 'e' " + " is " + count);
}
}
