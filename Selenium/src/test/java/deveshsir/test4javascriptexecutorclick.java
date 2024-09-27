package deveshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test4javascriptexecutorclick {

	public static void main(String[] args) throws Exception {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(2000);

		WebElement element1 = driver.findElement(By.xpath("(//div[@class='text'])[1]"));

		String text1 = element1.getText();
		System.out.println("Visible Element - " + text1);// File - Visible Element

		Thread.sleep(2000);

		WebElement element2 = driver.findElement
				(By.xpath("(//div[@class='text'])[1]/following::div[2]"));//New - Hidden element

		String text2 = element2.getText();
		System.out.println("Hidden Element - " + text2);
		
		String javascriptText2 = (String)driver.executeScript("return(arguments[0]).textContent", element2);
		
		System.out.println("Hidden Element by using Javascript = "+javascriptText2);

		driver.close();
		
		// getText() method can get the text of only Visible Element, but not Hidden Element.
		// For Hidden Element - getText() method will give blank value (null)
		// In order to get the text of hidden element we need to use Javascript.
		
		
	}

}
