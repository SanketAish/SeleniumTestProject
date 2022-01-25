package Assignment;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	

	

	public static void main(String[] args) {
	
     
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\executable\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http:\\www.facebook.com");
		
		String homepagetitle= driver.getTitle();
		System.out.println("getpagesource:"+ driver.getTitle());
		String expectedtitle= "Facebook – log in or sign up";
		
		if(homepagetitle.equals(expectedtitle)) 
			System.out.println("this title is match");
			else   
				System.out.println("This title does not match");
		
		
		}
		
		
	}
	


