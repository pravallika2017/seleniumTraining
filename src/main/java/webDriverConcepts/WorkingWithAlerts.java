package webDriverConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Click on submit button.  Alert is an interface
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		System.out.println("Text Captured from Alert is :" +alertText);
		Thread.sleep(1000);
		//clicking on ok button
		alert.accept(); //OR WE CAN USE ALERT DISMISS
		
	
		

	}

}
