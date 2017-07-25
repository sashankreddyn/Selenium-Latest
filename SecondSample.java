import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SecondSample {

	public static void main(String[] args) {
				System.setProperty("webdriver.edge.driver","D:\\Selenium\\MicrosoftWebDriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.get("http://www.google.com");
				System.out.println(driver.getTitle());
				driver.close();
				driver.quit();

	}

}
