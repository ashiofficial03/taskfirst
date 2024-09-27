package deveshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test9isselected_displayed_enabled {
	public static void main(String[] args) throws Exception {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element1 =  driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[1]"));
		
		if (element1.isDisplayed()) 
		{
			System.out.println("visible in page");
		}
		if (element1.isEnabled()) 
		{
			System.out.println("Element is enabled");
			
			if (element1.isSelected()) {
				System.out.println("Element is selected");
			}
			else
			{
				System.out.println("Element is not selected");
			}
		}
		else
		{
			System.out.println("Element is Hidden");
		}
	 
	}

}
