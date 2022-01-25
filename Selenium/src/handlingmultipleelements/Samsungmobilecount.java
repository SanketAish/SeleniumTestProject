package handlingmultipleelements;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samsungmobilecount {

	public static void main(String[] args) {
		//Step1: open browser
				System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\executable\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//full screen browser 
				driver.manage().window().maximize();
				/**Step2: enter required URL */
				driver.get("https://www.gsmarena.com");
				//implicit wait: Interface->Interface->Interface->abstract method*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//List<WebElement> mobiles= driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>u1>li>a"));
				List<WebElement> mobiles=driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li>a"));
				System.out.println("Options count: "+mobiles.size());
				for(int i=0;i<mobiles.size();i++) {
					WebElement option=mobiles.get(i);
					System.out.println(option.getText());				}
				
				
	}

}
