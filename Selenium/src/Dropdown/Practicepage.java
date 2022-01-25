package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practicepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\executable\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("http://courses.letscodit.com/");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	/*	
		WebElement Skilldropdown = driver.findElement(By.id("Skills"));
		
		Select skillselect= new Select(Skilldropdown);
		System.out.println("Options are multiselect or not: "+ skillselect.isMultiple());
		
		skillselect.getOptions().size();
		for(int i =0; i<skillselect.getOptions().size();i++) {
			
			System.out.println(skillselect.getOptions().get(i).getText());
			*/
	}

}

