import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DialANumber {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");

		dc.setCapability("appPackage", "com.google.android.dialer");

		dc.setCapability("appActivity", "com.google.android.apps.dialer.extensions.GoogleDialtactsActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(1000);
		
		driver.findElementById("com.google.android.dialer:id/floating_action_button").click();
		
		driver.findElementById("com.google.android.dialer:id/zero").click(); //0
		
		driver.findElementById("com.google.android.dialer:id/five").click(); //5
		
		driver.findElementById("com.google.android.dialer:id/five").click(); //5
		
		driver.findElementById("com.google.android.dialer:id/five").click(); //5
		
		driver.findElementById("com.google.android.dialer:id/one").click(); //1
		
		driver.findElementById("com.google.android.dialer:id/two").click(); //2

		driver.findElementById("com.google.android.dialer:id/three").click(); //3

		driver.findElementById("com.google.android.dialer:id/four").click(); //4

		driver.findElementById("com.google.android.dialer:id/six").click(); //6

		driver.findElementById("com.google.android.dialer:id/seven").click(); //7

		driver.findElementById("com.google.android.dialer:id/nine").click(); //9
		
		Thread.sleep(1000);
		
		driver.findElementById("com.google.android.dialer:id/dialpad_floating_action_button").click(); //call
		
		Thread.sleep(1000);
		
		driver.quit();

	}
	
}
