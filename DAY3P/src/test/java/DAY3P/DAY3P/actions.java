package DAY3P.DAY3P;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class actions {
  @Test
 
	  
	  public static WebDriver getDriver(String br) 
	  {
		  if (br.equals("abc")) 
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe\\");
				return new ChromeDriver();
				
			}
			
			else if(br.equals("IEE"))
			{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
			}
			else if(br.equals("uv"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\geckodriver.exe");
				return new FirefoxDriver();
			}
			else 
				return null;
	  }


  }

