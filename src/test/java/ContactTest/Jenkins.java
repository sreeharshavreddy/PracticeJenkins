package ContactTest;

import org.testng.annotations.Test;

public class Jenkins
{
  @Test
  public void jenkinswithmultiplebrowser()
  {
	  String Browser=System.getProperty("browser");
	  System.out.println(Browser);
  }
}
