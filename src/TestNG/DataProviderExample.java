package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
@Test(dataProvider="getData")
public void loginPage(String uname,String password) {
	System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys(uname);
	driver.findElement(By.name("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();
}
@DataProvider
public Object[][] getData() {
	Object[][] data = new Object[3][2];
	data[0][0]="mmahendra310";
	data[0][1]="9492551635";
	data[1][0]="mithimahendra2";
	data[1][1]="955063101";
	data[2][0]="mahendra92";
	data[2][1]="8686848985";
	return data;
	
}
}
