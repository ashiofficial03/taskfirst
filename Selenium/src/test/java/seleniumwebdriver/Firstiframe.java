package seleniumwebdriver;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstiframe {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("ENTER TO THE TESTING WEBSITE")).click();
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div/div[3]/ul/li/a/figure/img")).click();
		
		/*Set win=driver.getWindowHandles();
		List<String> l1=new ArrayList(win);
		Iterator it=l1.iterator();
		firstwindow=it.next(); */
		
		
		

	}

}
