import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class StoreProperties {
	public static void main(String...args) throws IOException{
		Properties p=new Properties();
		FileOutputStream fo=new FileOutputStream("credentials.properties");
		
		p.setProperty("uname", "Ramya");
		p.setProperty("pwd", "ashu@1234");
		p.store(fo,"User Credentials");
	}
}
