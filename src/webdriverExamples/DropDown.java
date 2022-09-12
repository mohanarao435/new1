package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	 
		System.setProperty("webdriver.chrome.driver","D:\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		By googlesearchBoxL=By.xpath("//*[@title='Search']");
		WebElement googlesearchBox=driver.findElement(googlesearchBoxL);
		googlesearchBox.sendKeys("Selenium");
		Thread.sleep(3000);
			for(int i=1;i<=3;i++)
		{
			googlesearchBox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			
		}
		googlesearchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}

}
