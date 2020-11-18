package webDriverConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithLinks {

	public static void main(String[] args) throws InterruptedException {
		
		 String expLink ="Forgot username or password?";
		 boolean status = false;
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     Thread.sleep(2000);
	     driver.manage().window().maximize();
	     
driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu");
//1.click on the link

//driver.findElement(By.linkText("Log in with SSO")).click();

//2.Capture the link name

 System.out.println(driver.findElement(By.linkText("Log in with SSO")).getText());


//3.Count no of links
	
	  List<WebElement> links = driver.findElements(By.tagName("a")); int totalLinks
	  =links.size();
	  System.out.println("Total number of links on survey monkey login page is :" +
	  totalLinks);
	 

//4.Print all the link names-- for loop
 
 for (int i = 0; i < totalLinks; i++) {
	String linkName = links.get(i).getText();
	
	if(!(linkName.isEmpty())) {
		System.out.println("LinkName is:"+ linkName);
		
	} else {

	}
	
	
	//System.out.println("LinkName is:"+ linkName);
	/*if (linkName.equalsIgnoreCase(expLink)) {
		//System.out.println("pass -Link is available");
		status = true;
		break;
	} else {
		status = false;
       //System.out.println("Fail -- Link is not available");
*/	}}	}
    
 
/*
 * if (status ==true) { System.out.println("pass -Link is available");
 * 
 * } else { System.out.println("Fail -- Link is not available");
 */

 


 
 

//5.verify if some link is present
 

 


 
 
	


