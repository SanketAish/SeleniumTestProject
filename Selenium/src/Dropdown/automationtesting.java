package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automationtesting {

	public static void main(String[] args) throws InterruptedException {
		//Step1: open browser
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\executable\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("http://demo.automationtesting.in/Register.html");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Skilldropdown = driver.findElement(By.id("Skills"));
		
		Select skillselect= new Select(Skilldropdown);
		System.out.println("Options are multiselect or not: "+ skillselect.isMultiple());
		
		skillselect.getOptions().size();
		for(int i =0; i<skillselect.getOptions().size();i++) {
			
			System.out.println(skillselect.getOptions().get(i).getText());
			
			
			skillselect.selectByIndex(1);
			System.out.println("Selected option: "+ skillselect.getFirstSelectedOption().getText());
			Thread.sleep(2000);
			skillselect.selectByValue("Adobe Photoshop");
			System.out.println("Selected option: "+ skillselect.getFirstSelectedOption().getText());
			Thread.sleep(2000);
			skillselect.selectByVisibleText("APIs");
			System.out.println("Selected option: "+ skillselect.getFirstSelectedOption().getText());
			
		
			
			
			
			
			
		}
		
			
		}
		
		

}
