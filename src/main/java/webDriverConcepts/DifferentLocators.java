package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//open chrome browser of selenium
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(5000);
        
		/*
		 * //ID driver.findElement(By.id("email")).sendKeys("aksharabattala@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("akshara");
		 * 
		 * //NAME
		 * driver.findElement(By.name("email")).sendKeys("aksharabattala@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("akshara");
		 */
        
        //xpath/xml path//extended path
        
        // driver.findElement(By.xpath("//*[@id='u_0_f']")).click();
        
        //CSS --Cascading style sheets
        
        driver.findElement(By.cssSelector("#u_0_b")).click();
        
        //Class Name
        // driver.findElement(By.className(className)
        
        
        // LinkText
        //driver.findElement(By.linkText("Forgot account?")).click();
        
       // Partial Link Text-- Not Recommended To Use
        //driver.findElement(By.partialLinkText("Forgot")).click();
        
        //
        
        
        
        
        
        
        
        
        
	}

}
