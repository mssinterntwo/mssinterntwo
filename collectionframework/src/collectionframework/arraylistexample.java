package collectionframework;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylistexample {
	public static void main(String[] args)
	{
		ArrayList alist=new ArrayList();
		alist.add(1);
		alist.add("vennela");
		alist.add("dasari");
		alist.add("anupama");
		alist.add("176C1A0521");
		alist.add("176C1A0512");
		System.out.println("elements in the array list are:");
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
		int location=alist.indexOf("anupama");
		System.out.println("location of anupama is"+location);
		System.out.println("last index of dasari is"+alist.lastIndexOf("dasari"));
        System.out.println("Is alist is empty"+alist.isEmpty());
        alist.remove("176C1A0512");
        System.out.println("array list elements before remove all"+alist);
        alist.clear();
        System.out.println("array list elemnts after remove all"+alist);
        
	}

}
