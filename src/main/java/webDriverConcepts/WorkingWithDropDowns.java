package webDriverConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		String expMonth ="Dec";
		boolean  status = true;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
 
        //clicking on create an account 
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(5000);
		
		//1-method selecting value from month drop down----sendkeys can be used for inputs & dropdowns
		driver.findElement(By.id("month")).sendKeys("Feb");
		
		//2-method selecting using select class
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Feb");
		
		Thread.sleep(1000);
		
		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByIndex(10);
		
		Thread.sleep(1000);
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByValue("2017");
				
		/*
		 * //3.counting no of values in a drop down
		 * 
		 * List<WebElement> months = select.getOptions();
		 * System.out.println("Total no of values in month drop down is: " +
		 * months.size());
		 */
		/*
		 * //4.Print all the values from month drop down for (int i = 0; i <
		 * 
		 * months.size(); i++) { String monthValue = months.get(i).getText();
		 * System.out.println("Value in Month Drop Down is : " + monthValue);
		 * 
		 * if (monthValue.equalsIgnoreCase(expMonth)) { status = true; break; } else {
		 * status = false;
		 * 
		 * }}
		 * 
		 * if (status == true) { System.out.println("pass"); } else {
		 * System.out.println("fail");
		 * 
		 * }
		 */
	
       //5.Printing all the values in the dropdown without selecting the select class
		
		List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']/option"));
		
		for (int i = 0; i < months.size(); i++) {
			String monthName = months.get(i).getText();
			System.out.println(monthName);
		
	    //selecting june  from dropdown
		if (monthName.equals("Jun")) {
			months.get(i).click();
			break;	
		}}
	   
	}
	
	
	
}
