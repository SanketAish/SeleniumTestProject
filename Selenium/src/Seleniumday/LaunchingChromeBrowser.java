package Seleniumday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {

	public static void main(String[] args) {
		
		//Set the path of chromedriver.exe using setProperty() of System class
				// with Absolute path
		//System.setProperty("webdriver.chrome.driver", "F:\\Online Class\\Training Syllabus-20210816T050832Z-001\\Training Syllabus\\CoreJava Sessions\\SeleniumBasics\\drivers\\chromedriver.exe");
					//or with Relative path
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
					//or with Relative path
		System.setProperty("webdriver.chrome.driver", "executable\\chromedriver.exe");
		
		//create an object of ChromeDriver class to open Chrome browser	
		WebDriver ddriver=new ChromeDriver();
	}

}
