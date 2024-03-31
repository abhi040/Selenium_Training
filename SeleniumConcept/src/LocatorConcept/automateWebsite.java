package LocatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automateWebsite {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F%3Ftype%3D5%26campid%3D5335883136%26toolid%3D10001%26customid%3D%26mkevt%3D1%26mkcid%3D1%26mkrid%3D8971-56017-19255-0%26ufes_redirect%3Dtrue");
		driver.findElement(By.id("businessaccount-radio")).click();
		driver.findElement(By.xpath("//*[@id='businessName']")).sendKeys("Rahul Enterprises");
		driver.findElement(By.xpath("//*[@id='businessEmail']")).sendKeys("rahulvohra0012@gmail.com");
		driver.findElement(By.xpath("//*[@id='bizPassword']")).sendKeys("Password@123");
		
		Select select =new Select(driver.findElement(By.id("businessCountry")));
		select.selectByVisibleText("India");
		
		driver.findElement(By.id("bizOnlyToBuy")).click();
		
	}

}
