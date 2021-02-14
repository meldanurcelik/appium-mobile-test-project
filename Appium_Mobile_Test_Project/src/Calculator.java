import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");

		dc.setCapability("appPackage", "com.android.calculator2");

		dc.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(1000);

		WebElement seven = driver.findElementById("com.android.calculator2:id/digit_7"); // 7
		seven.click();

		driver.findElementById("com.android.calculator2:id/op_add").click(); // +

		WebElement three = driver.findElementById("com.android.calculator2:id/digit_3"); // 3
		three.click();

		driver.findElementById("com.android.calculator2:id/eq").click(); // =
		Thread.sleep(1000);

		String results = driver.findElementById("com.android.calculator2:id/result").getText();

		if (results.equals("10")) {
			System.out.println("Test Passed...");
		} else {
			System.out.println("Test Failed...");
		}

		Thread.sleep(500);
		driver.quit();
	}
}
