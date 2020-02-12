package DAY3P.DAY3P;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotations {
  @Test
  public void login() {
	 System.out.println("5 lines of code"); 
  }
  
  @BeforeMethod
  public void launch() {
	  System.out.println("some 3 lines of code");
  }
  
  @Test
  public void registration() {
	  System.out.println("some 20 line sof code");
  }
  
  @AfterMethod
  public void close()
  {
	  System.out.println("close");
  }
  @BeforeClass
  public void browsercache()
  {
	  System.out.println("some 23 lines of code");
  }
  @AfterClass
  public void deletecookies()
  {
	  System.out.println("some 10 lines of code"); 
  }
  @BeforeClass
  public void browserconfig()
  {
	  System.out.println("some 2222 lines of code");
  }
  @AfterClass
  public void browser()
  {
	  System.out.println("some 100 lines of code"); 
  }
  @BeforeSuite
  public void connect() {
	  System.out.println("connection");
  }
  @AfterSuite
  public void disconnect()
  {
	  System.out.println("disconnect");
  }
  
  
}
