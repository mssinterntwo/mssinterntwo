
import java.util.Scanner;
public class vowels {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		int vowels=0,consonants=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='I'||str.charAt(i)=='U')
			{
				vowels=vowels+1;
				
			}
			else
			{
				consonants=consonants+1;
			}
				
		
		}
		System.out.println(vowels+" vowels");
		System.out.println(consonants+" consonants");
		
		
	}

}
