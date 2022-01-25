package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Acttime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\executable\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://demo.actitime.com");
		int currentpagetitle = driver.getTitle().length();
		System.out.println("get title:"+ driver.getTitle().length());
		//get page url
		
		 System.out.println("get currenturl:"+ driver.getCurrentUrl());
	    
	    //get page source
	    System.out.println("get pagesource:"+ driver.getPageSource());
	    //get pagesourcelegth
	    int pageSourceLength= driver.getPageSource().length();
	    System.out.println("geting length:"+ driver.getPageSource().length());
	   
	    
	    
	    driver.close();
	    
	    
	    
	    
	    
	}

}
