package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class godaddybase {

	public static WebDriver driver;
	public static WebDriver setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/SUVYADAV/Downloads/chromedriver_win32 (1)/chromedriver.exe/");
		driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/en-in");
	
			
		
			
		
		driver.manage().window().maximize();
		return driver;
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void getpagetitle(){
		String title =driver.getTitle();
		System.out.println(title);
		
			}
		
	public static void logoclick(WebElement element) {
		element.click();
	}
}
