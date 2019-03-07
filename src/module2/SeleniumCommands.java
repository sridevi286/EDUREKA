package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
	
		
 System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sride\\Selenium\\InstallationStuff\\ExeFiles\\chromedriver.exe" );
 WebDriver driver = new ChromeDriver();
		
   System.setProperty("webdriver.gecko.driver", "C:\\Users\\sride\\Selenium\\InstallationStuff\\ExeFiles\\geckodriver.exe");
   WebDriver driver1 = new FirefoxDriver();
	}

}
