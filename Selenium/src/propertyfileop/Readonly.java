package propertyfileop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readonly {

	public static void main(String[] args) throws IOException {
	
		FileInputStream str = new FileInputStream("D:\\Selenium\\Testdata\\appdata.properties");
		
		Properties prop = new Properties();
		
		prop.load(str);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("loginpagetitle"));
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("http://demo.automationtesting.in/Register.html");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
	}

}
