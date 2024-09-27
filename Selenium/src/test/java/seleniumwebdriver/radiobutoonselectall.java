package seleniumwebdriver;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class radiobutoonselectall {
	
	
	public static void main(String[] args) throws Exception {
		RemoteWebDriver driver=new ChromeDriver();
		Properties paper=new Properties();
		FileInputStream fist=new FileInputStream("./src/test/resources/properties/htmlradiobutton.properties");
		paper.load(fist);
		System.out.println(paper.getProperty("testurl_id"));
		driver.get((String) paper.get("testurl_id"));
		List<WebElement> dew=driver.findElements(By.xpath(paper.getProperty("radio_id")));
		System.out.println(dew.size());
		for(WebElement d:dew) {
			
			d.click();
			
			if(d.equals("hrf")) {
				System.out.println("gotit");
				
			}
		}
	}

}
