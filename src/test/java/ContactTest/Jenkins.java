package ContactTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Jenkins
{
  @Test
  public void jenkinswithmultiplebrowser()
  {
	  String Browser=System.getProperty("browser");
	  System.out.println(Browser);
	  WebDriver driver = null;
		if(Browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get("http://localhost:8888");
  }
}
