package IOSNativeApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebDriverAgentTest {

	public static AppiumDriver<IOSElement> driver;
	
	public static void main(String[] args) throws MalformedURLException{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.1");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7 Plus");
		capabilities.setCapability("app", "usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent//Build/Products/Debug-iphonesimulator/IntegrationApp.app");
		capabilities.setCapability("udid", "8dhwbebveqw8923427");
		capabilities.setCapability("bundleId", "com.facebook.IntegrationApp");
		capabilities.setCapability("automationName", "XCUITest");
		
		  // For Browser (add below and note** app value has to change)
	  /*  capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		  capabilities.setCapability("app", "io.appium.SafariLauncher");
 
		  *Execute below interminal 
		  ios-webkit-debug-proxy -c eaddwlwj45k667rejer:27753 
		  *
		  *Add below to navigate to browser after alert command
		  *
		  *driver.get("http://google.com");
		  *
		  */
		
		driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities.)
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.name("Alert")).click();
		
	}
}
