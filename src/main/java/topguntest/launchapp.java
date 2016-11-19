package topguntest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import java.net.URL;

public class launchapp 
{
	public static void main(String[] args) throws Exception {
		 
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("platformName", "iOS");
	    capabilities.setCapability("deviceName", "iPhone 6s");
	    capabilities.setCapability("platformVersion", "10.1");
	    capabilities.setCapability("app", "/Users/mkonkolowicz-/Documents/Apps/TopGunSyllabusiPhone.app");
	    capabilities.setCapability("deviceOrientation", "portrait");
	    capabilities.setCapability("appiumVersion", "1.6.0");
	    
	    WebDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	    WebElement phasesLink = driver.findElement(By.id("UIPhases"));
	    phasesLink.click();
	    driver.wait(5);
	    WebElement phases = driver.findElement(By.id("UIPhase"));
	    boolean isPhasesTableEnabled = phases.isEnabled();
	    driver.quit();
	}	
}