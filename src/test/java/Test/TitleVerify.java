package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TitleVerify {
  @Test
  public void verifyTitle() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.stackoverflow.com/");
	  String title = driver.getTitle();
	  System.out.println("Title is: " + title);
  }
}
