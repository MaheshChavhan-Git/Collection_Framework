package collection.properties.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo0 {
	public static void main(String args[]) throws IOException {

		Properties writer = new Properties();
		writer.setProperty("fname", "Mahesh");
		writer.setProperty("age", "26");

		writer.store(new FileWriter("C:\\Users\\MAHESH\\Desktop\\PCB\\myprop"), "1stPropertyFile");
		System.out.println("Properties Added !");

	}

}
