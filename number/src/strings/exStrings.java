package strings;
import java.util.*;
public class exStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "hello";
		String st2 = "hello";
		String st3 =new String("HELLO");
		String st1=new String("hello");
		String st4=new String("hello");
		st.concat("sir"); // concat done but it doesn't reflect in o/p, st still refers to "hello"
		System.out.println(st);
		System.out.println(st==st1);//reference checking i.e same location or not; return type boolean
		System.out.println(st.equals(st1));//goes for content checking and returns boolean . 
		System.out.println(st.equals(st2));
		
		//st = st3;
		//System.out.println(st);
		
		System.out.println(st1.equalsIgnoreCase( st3));//ignores the case;
		//compreTO(),goes for content checking return type is an integer value
		System.out.println(st.compareTo(st2));
		System.out.println(st.compareTo(st1));
		System.out.println(st.compareTo(st3));
		System.out.println(st1.compareTo(st3));
	}

}
