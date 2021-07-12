package practical_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class Practical_2_Part_A_And_B {
	String path = ".\\datas\\dataconfig.properties";//this is my path for property file.

	public static void main(String[] args) throws FileNotFoundException {
		doesFileExist(".\\datas\\dataconfig.properties");

	}

	public static void doesFileExist(String path) {
		try {
			Properties pro = new Properties();
			FileInputStream fi = new FileInputStream(path);
			pro.load(fi);

			String[] firstword = pro.getProperty("Apples").split(",");
			
			System.out.println("Apple:");
			System.out.println("1st meaning of apple:  " + firstword[0]);
			System.out.println("2st meaning of apple:  " + firstword[1]);
			String[] secondword = pro.getProperty("smoothies").split(",");
			System.out.println("");// just to have a nice look in console.
			System.out.println("smoothie:");
			System.out.println("1st meaning of smoothie:  " + secondword[0]);
			System.out.println("2st meaning of smoothie:  " + secondword[1]);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Excepted file was not found in path..");
			e.printStackTrace();
		}

	}

}
