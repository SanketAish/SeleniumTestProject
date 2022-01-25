package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		 
		 String loginpagetitle= driver.getTitle();
		 System.out.println("login page title:"+ driver.getTitle());
		 
		 WebElement login=driver.findElement(By.id("username"));
		 login.clear();
		
		 login.sendKeys("admin");
		 
		 WebElement login1=driver.findElement(By.id("password"));
		 login1.clear();
		 
		 login1.sendKeys("Test@123");
		 
		driver.findElement(By.className("button")).click();
		
	  driver.findElement(By.className("userName")).click();
	  
	  driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	  
	  
	
		 
		 
		 
		 
	}

}
