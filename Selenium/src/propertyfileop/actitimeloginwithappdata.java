package propertyfileop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeloginwithappdata {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("http://demo.actitime.com");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement username=driver.findElement(By.cssSelector(("table[id='demoCredentials']>tbody>tr:first-child>td:last-child")));
		
		String n1=username.getText().split(" ")[1];
		System.out.println("n1: "+n1);
	
		
		WebElement password=driver.findElement(By.cssSelector("table[id='demoCredentials']>tbody>tr:nth-of-type(2)>td"));
		String n2=password.getText().split(" ")[1];
		System.out.println("n2: "+n2);
	    
	}

}
