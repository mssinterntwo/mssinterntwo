
import java.util.Scanner;
public class first_into_upper {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str=sc.nextLine();
		System.out.printf("%c",Character.toUpperCase(str.charAt(0)));
	    for(int i=1;i<str.length();i++)
	    {
	    	if(str.charAt(i)==' ')
	    	{
	    		System.out.printf(" %c",Character.toUpperCase(str.charAt(i+1)));
	    		i++;
	    	}else {
	    		System.out.printf("%c",str.charAt(i));
	    	}
	    	
	    }
	}

}
