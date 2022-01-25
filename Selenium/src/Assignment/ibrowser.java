package Assignment;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ibrowser {

	public static void main(String[] args) {
       System.setProperty("webdriver.ie.driver", "D:\\Selenium\\executable\\IEDriverServer.exe");
		
		//create an object of InternetExplorerDriver class to open IE browser	
		InternetExplorerDriver idriver=new InternetExplorerDriver();
		idriver.get("http://www.google.com");
		
		 System.out.println("get currenturl:"+ idriver.getCurrentUrl());
		 
		 System.out.println("get pagesource:"+ idriver.getPageSource());
		
		
		
		
		
		

	}
}
