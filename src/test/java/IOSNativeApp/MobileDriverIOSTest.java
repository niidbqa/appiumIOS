package IOSNativeApp;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileDriverIOSTest {

	  
	private AppiumDriver driver;
	  private List<Integer> values;

	    private static final int MINIMUM = 0;
	    private static final int MAXIMUM = 10;
	    
	    private static Point getCenter(WebElement element) {

		      Point upperLeft = element.getLocation();
		      Dimension dimensions = element.getSize();
		      return new Point(upperLeft.getX() + dimensions.getWidth()/2, upperLeft.getY() + dimensions.getHeight()/2);
		    }

	  @Before
	  public void setup() throws Exception {
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "iOS");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
	   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
	    
	    //capabilities.setCapability("app", "io.appium.WebViewApp");
	    capabilities.setCapability("automationName", "Appium");
	    
	    capabilities.setCapability("udid","c0b18afder3jkq10");

	    capabilities.setCapability(MobileCapabilityType.APP, "/Users/bd/Downloads/TestApp.app");
	    System.out.println("test previous");
	    driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   // System.out.println("test");
	  }

	  @After
	  public void tearDown() throws Exception {
	   driver.quit();
	  }

	  @Test
	  public void resetTest() {
		//  driver.findElement(By.name("TextField1")).sendKeys("7");
          WebElement slider = driver.findElement(By.xpath("//UIASlider[1]"));
       //   assertEquals("50%", slider.getAttribute("value"));
          Point sliderLocation = getCenter(slider);
          System.out.println(sliderLocation);
          driver.swipe(sliderLocation.getX(), sliderLocation.getY(), sliderLocation.getX()+100, sliderLocation.getY(), 1000);
          System.out.println(sliderLocation);
	  }

	 
	  }
	
