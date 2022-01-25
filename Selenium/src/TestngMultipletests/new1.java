package TestngMultipletests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utlities.SeleniumUtils;

public class new1 extends SeleniumUtils
{
	static WebDriver driver;
	@Test
	public void testwindow() throws InterruptedException {
		driver=setUp("chrome","https://etrain.info/in");
		System.out.println("home windows url"+driver.getCurrentUrl());
		String homewinid = driver.getWindowHandle();
		System.out.println("get homewinid:"+homewinid);
		driver.findElement(By.xpath("//a[@href='http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=reservation_Rules.html&locale=en']")).click();
		Set<String> allwinid = driver.getWindowHandles();
		System.out.println("get allwinid:"+allwinid);

		allwinid.remove(homewinid);
		System.out.println("all win ids after removing homewinnid:"+allwinid);
		String childWinId=allwinid.iterator().next();
		driver.switchTo().window(childWinId);
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Services']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='SMS Service']")).click();
		
	}
}
