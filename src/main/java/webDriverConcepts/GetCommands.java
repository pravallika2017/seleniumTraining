package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//open chrome browser of selenium
        driver.manage().window().maximize();
        
        driver.get("https://www.google.ca/");//open app based on URL provided
        
        String appTitle = driver.getTitle();//capture the title
        System.out.println("Title of the application is :"+ appTitle);
        
		
		  if (appTitle.equalsIgnoreCase("google")) {//To compare the values we use if
		   System.out.println("google appplication is opened");
		  
		  } else { 
			  System.out.println("some other application is opened");
		  
		  }
		  String appUrl = driver.getCurrentUrl();
		  System.out.println("URL of application is:" + appUrl);
		  
			/*
			 * if (appUrl.contains("google")) { System.out.println("URL is correct");
			 * 
			 * } else { System.out.println("URL is wrong"); }
			 */
		  
    //2nd method
		
	
	  String updatedText = appUrl.substring(12, 18); 
	       System.out.println(updatedText);
	  
	  if (updatedText.equals("google"))  { 
		  System.out.println("pass");
	  
	  } else { 
		  System.out.println("fail"); 
	  }
	   System.out.println(driver.getPageSource());
	  
	  driver.close();
	  
	  }
	 

	
}
