package autowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\Webdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://html.com/input-type-file/");
	driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("D:\\Users\\Abhishek\\Documents\\activation.txt");
	}

}
