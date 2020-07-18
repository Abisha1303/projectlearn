
package org.pract;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	static Actions a;
	static Robot r;
	static Select s;
	
	
	public static void launch() {
		// to launch the browser
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		driver=new ChromeDriver();
	}
	
	public static void loadUrl(String url) {
		// To load the url in the bowser and maxiz
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void getUrl() {
		// TO fetch the url from the bowser
		driver.getCurrentUrl();
	}
	public static  void close() {
		driver.close();
	}
	public static void insert(WebElement e, String txt) {
	e.sendKeys(txt);	
	}
	public static void click(WebElement e) {
		e.click();
	}
	public static String getTxt(WebElement e) {
		// TO get the text from the WebElement
		System.out.println(e.getText());
		return null;
	}
	public static void doubleClick(WebElement e) {
		a=new Actions(driver);
		a.doubleClick(e).perform();	
	}
	public static void contextClick(WebElement e) {
		a=new Actions(driver);
		a.contextClick(e).perform();

	}
	public static void keyUp(WebElement target, CharSequence key) {
		a=new Actions(driver);
		a.keyUp(target, key);
	}
	public static void promptAlert(String e) {
		Alert alrt=driver.switchTo().alert();
		alrt.sendKeys(e);
			
	}
	
	public static void dismiss() {
			Alert alrt=driver.switchTo().alert();
			alrt.dismiss();
	}
	public static void accept() {
		Alert alrt=driver.switchTo().alert();
		alrt.accept();
	}
	public static void keyPress(int key) throws Throwable {
		r=new Robot ();
		r.keyPress(key);

	}
	public static void keyRelease(int key) throws Throwable {
		r=new Robot ();
		r.keyRelease(key);

	}
	public static void frameSwitch(String index) {
		driver.switchTo().frame(index);
	}
	public static void switchToParent() {
		driver.switchTo().parentFrame();
	}
	public static void switchToDefault() {
		driver.switchTo().defaultContent();
	}
	public static void getParWindowId() {
		driver.getWindowHandle();
	}
	public static void getAllWinId() {
		driver.getWindowHandles();
	}
	public static void select1Option(WebElement e, int index) {
		s=new Select(e);
		s.selectByIndex(index);
	}
	public static void select1OptionValue(WebElement e, String value) {
		s=new Select(e);
		s.selectByValue(value);
	}
	public static void select1Option(WebElement e, String text) {
		s=new Select(e);
		s.selectByVisibleText(text);
	}
	public static void selectAllOption(WebElement e, int index) {
		s=new Select(e);
		List<WebElement> op = s.getOptions();
		for(int i=0;i<op.size();i++) {
			op.get(i);
			s.selectByIndex(index);
		}
	}
	
	
	
	
	public static  void implicitWait() {
		// TODO Auto-generated method stub
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);

	}
	
	public static void windowHandling(String url) {
		
		driver.switchTo().window(url);
	}

	public static void actKeyDown(CharSequence key) {
		a= new Actions(driver);	
		a.keyDown(key);
		
	}
}
