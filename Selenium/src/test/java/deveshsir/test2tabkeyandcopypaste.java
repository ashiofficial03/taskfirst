package deveshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test2tabkeyandcopypaste {
	
	
	
	
	
	public static void m3() throws Exception
	{
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://way2sms.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='qzups-phone-btn d-xl-block']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("javaselenium", 
														Keys.chord(Keys.CONTROL,"a"),
														Keys.chord(Keys.CONTROL,"c"),
														Keys.TAB,
														Keys.chord(Keys.CONTROL,"v"));
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//i[@class='fal fa-eye']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("m-check-input")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		m3();
	}

}
