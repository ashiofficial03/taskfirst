package deveshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test8gmailhiddenpass {

	public static void main(String[] args) throws Exception {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element1 =  driver.findElement(By.name("hiddenPassword"));
		
		if (element1.isDisplayed()) {
			System.out.println("Visible in page");
		}
		else
			System.out.println("Not visible in page");
		
		driver.close();
		 
	}

}
