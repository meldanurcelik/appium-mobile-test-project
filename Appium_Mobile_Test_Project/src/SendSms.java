
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SendSms {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");

		dc.setCapability("appPackage", "com.google.android.apps.messaging");

		dc.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(1000);
		
		driver.findElementById("com.google.android.apps.messaging:id/start_new_conversation_button").click();
		Thread.sleep(1000); 
		
		driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").sendKeys("05551234679");
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));		
		Thread.sleep(1000); 
		
		driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Hello, World!");
		
		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
