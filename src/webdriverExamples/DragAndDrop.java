package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@class='ui-widget-content ui-draggable ui-draggable-handle']"))).moveToElement(driver.findElement(By.xpath("//*[@class='ui-widget-header ui-droppable']"))).release().build().perform();
		driver.close();

	}

}
