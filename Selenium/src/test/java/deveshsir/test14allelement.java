package deveshsir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test14allelement {
	public static void main(String[] args) throws Exception {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> allHyperlinkElements = driver.findElements(By.tagName("a"));
		System.out.println("All Element in Amazon with TagName = "+allHyperlinkElements.size());

		
		List<WebElement> allHyperLinkElementsXpath = driver.findElements(By.xpath("//a"));
		System.out.println("All Element in Amazon with Xpath = "+allHyperLinkElementsXpath.size());

		List<WebElement> allElementsXpath = driver.findElements(By.xpath("//*"));
		System.out.println("All Element in Amazon with Xpath = "+allElementsXpath.size());
		
		List<WebElement> allHyperlinkElementsWithTagName= driver.findElements(By.tagName("*"));
		System.out.println("All Element in Amazon with TagName = "+allHyperlinkElementsWithTagName.size());

		
		driver.close();

	}
}


