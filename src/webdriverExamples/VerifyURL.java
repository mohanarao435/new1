package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class VerifyURL {
	public static void main(String[] args) throws InterruptedException {
		String expectedTitle="Your store. Login";
		System.setProperty("webdriver.chrome.driver","D:\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title : "+actualTitle);
		Assert.assertEquals(actualTitle,expectedTitle);
		By adminLabelL=By.xpath("//*[@class='page login-page']//child::*[@class='page-title']//h1");
		WebElement adminLabel=driver.findElement(adminLabelL);
		String actualLabelData=adminLabel.getText();
		System.out.println(actualLabelData);
		Assert.assertEquals(actualLabelData,"Admin area demo","Test script Failed as label data does not match with expected label Data");
		By loginTitleL=By.xpath("//strong[text()='Welcome, please sign in!']");
		WebElement loginTitle=driver.findElement(loginTitleL);
		String title=loginTitle.getText();
		System.out.println(title);
		boolean status=loginTitle.isDisplayed();
		Assert.assertTrue(status,"Login title is not displayed");
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
