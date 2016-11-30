package topguntest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.ios.IOSDriver;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.List;


import org.junit.Test;

public class TopGunSyllabusLaunchesTests 
{
	@Test
	public static void applicationLaunchesTest(String[] args) throws Exception {
		 
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("platformName", "iOS");
	    capabilities.setCapability("deviceName", "iPhone 6s");
	    capabilities.setCapability("platformVersion", "10.1");
	    capabilities.setCapability("app", "/Users/mkonkolowicz-/Documents/Apps/TopGunSyllabusiPhone.app");
	    capabilities.setCapability("deviceOrientation", "portrait");
	    capabilities.setCapability("appiumVersion", "1.6.0");
	    
	    WebDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	    WebDriverWait wait = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("UIPhases")));
	    WebElement phasesLink = driver.findElement(By.id("UIPhases"));
	    phasesLink.click();	      
	    List<WebElement> phases = driver.findElements(By.id("UIPhase"));
	    boolean isPhasesTableEnabled = phases.get(0).isEnabled();
	    assertEquals(isPhasesTableEnabled,true);
	    driver.quit();
	}	
}