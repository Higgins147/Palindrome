
public class Palindrome {

	public static void main(String[] args) {
		
		String word = "ABOOBA";
		int check = word.length();
		Boolean record = true;
		
		for(int i = 0; i < check/2; i++)
		{
			if(word.charAt(i) != word.charAt(check -1 -i))
			{
				record = false;
				break;
			}
		}
		
		if(record)
		{
			System.out.println("This is a Palindrome");
		}
		else
		{
			System.out.println("This is NOT a Palindrome");
		}
	}
}