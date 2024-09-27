package deveshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test6underlinecss {

	public static void main(String[] args) throws Exception {
		
		
		long startAsmita = System.currentTimeMillis();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		WebElement element1 = driver.findElement(By.linkText("Gmail"));
		
		String x1 =  element1.getCssValue("text-decoration");
		String x2 =  element1.getCssValue("color");
		String x3 =  element1.getCssValue("opacity");

		System.out.println("Before Focus");
		System.out.println(x1+"..."+"..."+x2+"..."+x3);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element1).perform();
		
		String x4 =  element1.getCssValue("text-decoration");
		String x5 =  element1.getCssValue("color");
		String x6 =  element1.getCssValue("opacity");

		System.out.println("After Focus");
		System.out.println(x4+"..."+"..."+x5+"..."+x6);
		
		if (x4.contains("underline")) {
			System.out.println("Element text is underlined after getting focus");
		}
		else
			System.out.println("Element text was not underline after getting focus");
			
		
		float opacity = Float.parseFloat(x6);
		
		if (opacity == 1) {
			System.out.println("Element color was shaded after getting focus");
		}
		else
			System.out.println("Element color was not shade after getting focus");		
		
		driver.close();
		
		long completeTime= System.currentTimeMillis();
		System.out.println("Total time taken for Automating Website = "+(completeTime-startAsmita)/1000);
	 
	}

}
