import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadCSV {
	public static void main(String...args) throws IOException{
		FileInputStream csvf=new FileInputStream("IEEE paper 171  (Finalized Manuscript).pdf");
		
		int i=csvf.read();
		do {
			if((char)i==',') {
				System.out.print("\t");
			}else {
				System.out.print((char)i);
			}
			i=csvf.read();
		}while(i!=-1);
	}
}
