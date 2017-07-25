import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSample {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.edge.driver","D:\\Selenium\\MicrosoftWebDriver.exe");
		//WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
	}

}
