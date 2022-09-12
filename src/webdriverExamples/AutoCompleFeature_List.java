package webdriverExamples;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoCompleFeature_List {

	public static void main(String[] args) throws InterruptedException {
		List<String> suggestedListValues=new ArrayList<String>();
		System.setProperty("webdriver.chrome.driver","D:\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		By googlesearchBoxL=By.xpath("//*[@title='Search']");
		WebElement googlesearchBox=driver.findElement(googlesearchBoxL);
		googlesearchBox.sendKeys("selenium");
		Thread.sleep(3000);
	
		By suggestionListL=By.xpath("//*[contains(@class,'wM6W7d')]");
		List<WebElement> suggestionList=driver.findElements(suggestionListL);
		for (WebElement option : suggestionList) 
		{
			String data=option.getText();
			if(!data.isEmpty())
			suggestedListValues.add(data);
			
		}
		System.out.println(suggestedListValues);
		boolean status=true;
		for (String data : suggestedListValues)
		{
			if(!data.contains("selenium"))
			{
				status=false;
				break;
			}
			
		}
		Assert.assertTrue(status,"Suggested List does not contain Expected value");
		int pos=0;
		for(int i=0;i<suggestedListValues.size();i++)
		{
			String data=suggestedListValues.get(i);
			if(data.equals("selenium testing interview questions"))
			{
				pos=i;
				break;
			}
			
		}
		for(int i=0;i<=pos;i++)
		{
			googlesearchBox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			
		}
		googlesearchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		

	}

}
