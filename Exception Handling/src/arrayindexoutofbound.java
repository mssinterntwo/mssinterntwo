import java.util.Scanner;
public class arrayindexoutofbound {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter array elements:");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter element you want to find:");
		int n=sc.nextInt();
		try {
			System.out.println("element is:"+a[n]);
			System.out.println(a[n]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("My name is vennela");
			
			System.out.println(e);
		}
	}

}
