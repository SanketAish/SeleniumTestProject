package Seleniumday;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefoxBrowser {

	public static void main(String[] args) {
		
		//Set the path of Geckodriver.exe using setProperty() of System class
				// with Absolute path
		//System.setProperty("webdriver.gecko.driver", "F:\\Online Class\\Training Syllabus-20210816T050832Z-001\\Training Syllabus\\CoreJava Sessions\\SeleniumBasics\\drivers\\geckodriver.exe");
					//or with Relative path
		//System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
					//or with Relative path
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\executable\\geckodriver.exe");
		//create an object of FirefoxDriver class to open firefox browser		
		FirefoxDriver fdriver=new FirefoxDriver();
	}
}
