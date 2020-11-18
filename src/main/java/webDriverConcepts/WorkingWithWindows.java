package webDriverConcepts;



import java.util.Iterator;
import java.util.Set;

import org.apache.http.cookie.SetCookie;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SetAlertText;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		/*
		 * Set<String>winIds = driver.getWindowHandles();
		 * System.out.println("Total no of windows opened :" + winIds.size());
		 */
		  
		String faceBookTitle = driver.getTitle();
		System.out.println("facebook Title is :" + faceBookTitle );
		
		//Clicking on create button
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Cookies Policy')]")).click();
		
		  Set<String>winIds = driver.getWindowHandles();
		  System.out.println("Total no of windows opened :" + winIds.size());
		  
		  Iterator<String> itr = winIds.iterator();
		  String facebookWindowId = itr.next();
		  String CookiespolicyWindow = itr.next();
		  
		  System.out.println(facebookWindowId +"-------------------------" + CookiespolicyWindow);
		  
		  driver.switchTo().window(CookiespolicyWindow);
		  
		
		System.out.println("Cookies Policy Title is:" + driver.getTitle());

		
		driver.switchTo().window(facebookWindowId);
		System.out.println(driver.getTitle());
		
		//driver.close
		driver.quit();
		
	} 
	
	

	
	}


