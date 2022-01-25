package Webdrivermanagerday11;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newactitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//full screen browser 
				driver.manage().window().maximize();
				/**Step2: enter required URL */
				driver.get("https://demo.actitime.com/login.do");
				//implicit wait: Interface->Interface->Interface->abstract method*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("admin");
				
				WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
				pass.sendKeys("manager");
				
				WebElement login= driver.findElement(By.id("loginButton"));
				login.click();
				
				WebElement tasks = driver.findElement(By.id("container_tasks"));
				Thread.sleep(2000);
				tasks.click();
				String expectedurl = "https://demo.actitime.com/tasks/tasklist.do";
				String Actualurl = driver.getCurrentUrl();
				if(expectedurl.equals(Actualurl)) {
					System.out.println("the url is matched");}
					else {
					System.out.println("the url doesnt match");}
				
				WebElement addtasks = driver.findElement(By.xpath("//div[text()='Add New']"));
				addtasks.click();
				WebElement select=driver.findElement(By.xpath("//div[@class='item createNewTasks']"));
				select.click();
				
				WebElement Select2 =driver.findElement(By.cssSelector("div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer\']"));
				Select2.click();
				
				WebElement Select3 =driver.findElement(By.xpath("//div[@class=\'itemRow \']"));
				Select3.click();
				Thread.sleep(2000);
				
				WebElement Select4 =driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']"));
				Select4.sendKeys("aishwarya");
				
				WebElement Select5 =driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']"));
			    Select5.sendKeys("Android Testing");
			  
			    WebElement Select6 =driver.findElement(By.xpath("//input[@placeholder=\'Enter task name\']"));
			    Select6.sendKeys("Testing");
			    
				WebElement Select7=driver.findElement(By.xpath("//div[text()='Create Tasks']"));
			    Select7.click();
			    
			  
				}
				
	}


