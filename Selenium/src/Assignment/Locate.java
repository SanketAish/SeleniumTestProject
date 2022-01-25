package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate {


	public class LocateElements {

		public void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\executable\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			/** enter required URL */
			driver.get("https://demo.actitime.com/login.do");
			
			/**
			 * By is predefined class in selenium and all its method are static which are also known as "locator"
			 * Selenium support following locator:
			 * id , name, linkText, partialLinkText, className, tagName, cssSelector, xpath
			 * 
			 * Action: all the below actions will be performed on the webelement
			 * 			type--> sendKeys("");
			 * 		   click---> click();
			 * 		   clearing existing value from the field ---> clear();
			 */
			/** locate username field */
			WebElement userNameInputField=driver.findElement(By.id("username"));
			/** enter username in the username input field*/
			userNameInputField.sendKeys("admin");
			
			/** locate password field */
			WebElement passwordInputField=driver.findElement(By.name("pwd"));
			/** enter password in the password input field*/
			passwordInputField.sendKeys("manager");
			
			/** locate login button */
			WebElement loginButton=driver.findElement(By.id("loginButton"));
			/** click in login button */
			loginButton.click();
		}
	}
}