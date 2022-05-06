package week2.day1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// To reverse the even position words
		String str = "I am a software tester";
		String[] n = str.split(" ");
		String newstr = "";
		for (int i = 0; i < n.length; i++)
		{
			if (i % 2 == 1)
				newstr = newstr + new StringBuilder(n[i]).reverse().toString() + " ";
					else
					newstr = newstr + n[i] + " ";
		}
System.out.println(newstr);
	}

}
