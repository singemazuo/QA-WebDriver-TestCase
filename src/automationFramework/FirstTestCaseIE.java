package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/***
 * 
 * @author Yinbin Zuo
 * @date Mar 9th, 2019
 * 
 */
public class FirstTestCaseIE {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// setting system property path for webdriver
		System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
		
		// instantiate a specific driver for webdriver
		WebDriver driver = new InternetExplorerDriver();
		
		// enter a website address for opening
		driver.get("http://www.store.demoqa.com");
		
		// output an appropriate message
		System.out.println("Successfully opened the website www.Store.Demoqa.com");
		
		// thread sleeps 5000 milliseconds
		Thread.sleep(5000);
		
		// quit driver and close procedure
		driver.quit();
	}
}
