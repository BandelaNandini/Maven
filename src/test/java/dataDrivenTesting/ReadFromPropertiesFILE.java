package dataDrivenTesting;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadFromPropertiesFILE {

	public static void main(String[] args) throws IOException {
		//step1:Convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		//throws exception
		
		//step2:Create an instance of properties class
		Properties property=new Properties();//java.util
		
		//step3:Load all key-value pairs into properties object
		property.load(fis);//This throws IO Exception
		
		//step4:Fetch data from properties object
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("timeouts"));
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("password"));

	}

}
