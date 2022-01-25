package handlingmultipleelements;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookcount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://www.flipkart.com/");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//List<WebElement> sizecounts=driver.findElements(By.cssSelector("div[class='InyRMC _3Il5oO'] "));
		
		//or
		List<WebElement> sizecounts=driver.findElements(By.cssSelector("div[class='InyRMC _3Il5oO'] div>div>a"));
		System.out.println("finding the size:");
		
		for(int i=0;i<sizecounts.size();i++) {
			System.out.println(sizecounts.get(i).getText());
		}
			
			
			
		}
		
}
