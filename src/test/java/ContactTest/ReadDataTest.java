package ContactTest;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataTest 
{
	@Test
	public void read()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println("browser----->"+BROWSER);
		
		WebDriver driver = null;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get("http://localhost:8888");
		
		
		String URL = System.getProperty("url");
		System.out.println(URL);
	}
}
