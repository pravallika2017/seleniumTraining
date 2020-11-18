package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithInputsFields {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     Thread.sleep(2000);
     driver.manage().window().maximize();
     
     
     driver.get ("https://rahulshettyacademy.com/AutomationPractice/");
     
         WebElement acv =  driver.findElement(By.id("autocompleteVal"));
     
		String val = acv.getAttribute("value");
		  // 1.Entering value in the input field
		  acv.sendKeys("delhi");
		  Thread.sleep(1000);
		  
		  //Clear the value in the input field
		  acv.clear(); Thread.sleep(1000);
		  
		  //Entering the new value in the input field
		  acv.sendKeys("bombay");
		  Thread.sleep(1000);
		 
		 
	//Capture the value that is entered in input field
		  String autocompleteVal = driver.findElement(By.id("autocomplete")).getAttribute("value");
		  System.out.println("User Name entered is............" + autocompleteVal);
		  System.out.println("Is Empty value is : " + autocompleteVal.isEmpty());
		  
	   if (autocompleteVal.isEmpty()) {
		   System.out.println("value is not entered");
		
	} else {
		
		System.out.println("value is entered");
	}
			
		
		  
		  
		  
		  
		  
			/*
			 * //Capture the link value driver.findElement(By.linkText("")).getText();
			 * System.out.println(""); driver.findElement(By.id("")).getAttribute("");
			 */
     
	}}
