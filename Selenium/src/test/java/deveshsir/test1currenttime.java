package deveshsir;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1currenttime {


	public static void m1() throws Exception
	{
		// Loading the browser driver s/w is optional from SWD 4.6 v
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.google.co.in");
				Thread.sleep(3000);
				FirefoxDriver driver2 = new FirefoxDriver();
				driver2.get("https://www.gmail.com");
				Thread.sleep(3000);
				driver2.close();
				Thread.sleep(3000);
				driver.close();
	}
	
	public static void m2() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		long startsTime = System.currentTimeMillis();
		
		driver.get("https://www.google.co.in");

		long completeTime = System.currentTimeMillis();
		
		System.out.println(completeTime-startsTime);
		driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		m2();
		
	}

}
