package collection.properties.file;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Demo1 {
	public static void main(String args[]) throws IOException {
		
		FileReader reader = new FileReader("C:\\Users\\MAHESH\\Desktop\\PCB\\myprop");
		Properties prt = new Properties();
		prt.load(reader);
		String p1 = prt.getProperty("fname");
		System.out.println("FirstName : "+p1);
		String p2 = prt.getProperty("age");
		System.out.println("Age : "+p2);
	}
}
