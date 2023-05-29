 package generic_files;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Freame_Constants {
	    
     public WebDriver driver;
     @BeforeMethod
     public void openAppln()
     {
    	 System.setProperty(Chrome_key, Chrome_value);
    	 driver = new ChromeDriver();
    	 driver.get(baseUrl);
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.manage().window().maximize();
     }
     @AfterMethod
     public void closeAppln(ITestResult res)throws IOException
     {
    	if(ITestResult.FAILURE==res.getStatus())
    	 {
    		 Generic_Scripts.getPhoto(driver); 
    	 }
    	 driver.close();
     }
}
