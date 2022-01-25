package TestngMultipletests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Beforetestprogram {


		WebDriver driver;
		@BeforeTest
		public void openBrowser() {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("opening browser");
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Before Test....");
		
		}
		
		
		@Test
		public void testGoogleLandingPage() {
			String expectedTitle = "Google";
			String actualTitle = driver.getTitle();
			// Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals("expected url will not print", expectedTitle, actualTitle);
		System.out.println("TC1: TestGoogleLandingPage is finished");
		}
		
		@Test
		public void testSearch() {
			WebElement searchInputField = driver.findElement(By.name("q"));
			Assert.assertTrue(searchInputField.isDisplayed());
			Assert.assertTrue(searchInputField.isEnabled());
			searchInputField.sendKeys("Sqlquestions", Keys.ENTER);
			System.out.println(""+ driver.getTitle() );
			System.out.println("TC2: TestSearch is finished");
		}
		@AfterTest
		public void cleanup() {
			driver.close();
			System.out.println("After Test....");
		}
			
		
		
		}
			
			

	


		
	

