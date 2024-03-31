package autowebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.get("http://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook – log in or sign up")) {
			System.out.println("Correct Tittle");
		}
		else {
			System.out.println("Incorrect Tittle");
		}
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.quit();

	}

}
