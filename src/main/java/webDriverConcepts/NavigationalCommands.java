package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//open chrome browser of selenium
        driver.manage().window().maximize();
        
       // Opening google application
        driver.get("http://www.google.ca");
        
        //Opening amazon application
        //driver.get("http://www.Amazon.ca");//driver.get will wait untill page is loaded completely
        driver.navigate().to("http://www.Amazon.ca");//Method Overloading ---it will wait only page is loaded
        
        //Switching back to google application
        driver.navigate().back();
        
        //Going back to amazon application
        driver.navigate().forward();
        
        //To press refresh button
        driver.navigate().refresh();

	}

}
