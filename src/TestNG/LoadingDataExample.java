package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class LoadingDataExample {
@Test
public void data() throws IOException{
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\mithi\\eclipse-workspace\\TestNGTutorial\\data.properties");
	prop.load(fis);
	String str = prop.getProperty("Browser");
	System.out.println(str);
	}
}
