package week2.day1.assignments;

public class FindTypes {

	public static void main(String[] args) {
		// To find the count of each
		
		String str = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, num = 0, space = 0, specialchar = 0;
		
		char[] charArr = str.toCharArray();
		
		for (int i = 0; i < charArr.length; i++)
		{
			if (Character.isLetter(charArr[i]))
				letter++;
			else if (Character.isDigit(charArr[i]))
				num++;
			else if (Character.isSpaceChar(charArr[i]))
				space++;
			else
				specialchar++;
		}
System.out.println("Letter: " + letter);
System.out.println("Space: " + space);
System.out.println("Number: " + num);
System.out.println("Special Character: " + specialchar);

		}
	}