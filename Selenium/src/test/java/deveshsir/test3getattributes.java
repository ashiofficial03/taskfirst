package deveshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test3getattributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		WebElement element =  driver.findElement(By.name("q"));
		
		String s1 =  element.getAttribute("maxlength");// 2048
		System.out.println("Max Length = "+s1);
		
		String s2 =  element.getAttribute("data-ved");
		System.out.println("data-ved = "+s2);
		
		String color =  element.getCssValue("color");
		System.out.println("Color = "+color);
		
		String word_wrap =  element.getCssValue("word-wrap");
		System.out.println("word-wrap = "+word_wrap);
			
		String writing_mode =  element.getCssValue("writing-mode");
		System.out.println("writing-mode= "+writing_mode);
		
		driver.close();

	}

}
