package Webdrivermanagerday11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoblaze {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//full screen browser 
				driver.manage().window().maximize();
				/**Step2: enter required URL */
				driver.get("https://www.demoblaze.com/");
				//implicit wait: Interface->Interface->Interface->abstract method*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			List <WebElement> device = driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h4"));
			System.out.println("device element:"+ device.size());
			for(int i=0; i<device.size(); i++) {
				System.out.println(device.get(i).getText());
			}
				List <WebElement> nextdevice = driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h5"));
				System.out.println("device element cost:"+ device.size());
				for(int i=0; i<nextdevice.size(); i++) {
					System.out.println(nextdevice.get(i).getText());
				
				
			}
			
			 WebElement device1= driver.findElement(By.xpath("//button[@id='next2']"));
			 Thread.sleep(2000);
			 System.out.println("is displaying or not:"+ device1.isDisplayed());
			 device1.click();
			 Thread.sleep(5000);
			
				List <WebElement> newdevice = driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h4"));
				System.out.println("device element:"+ newdevice.size());
				for(int i=0; i<newdevice.size(); i++) {
					System.out.println(newdevice.get(i).getText());
				}
					List <WebElement> newdevice1 = driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h5"));
					System.out.println("device element:"+ newdevice1.size());
					for(int j=0; j<newdevice1.size(); j++) {
						System.out.println(newdevice1.get(j).getText());
	}
	
}
}
