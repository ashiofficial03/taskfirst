package seleniumwebdriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class propertiescompare {
	
		
	
	

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver=null;
		FileInputStream fis;
		Properties prop=new Properties();
		fis=new FileInputStream("./src/test/resources/properties/or.propeerties");
		prop.load(fis);
		Properties config=new Properties();
		fis=new FileInputStream("./src/test/resources/properties/config.properties");
		config.load(fis);
		
		System.out.println(config.getProperty("browser"));
		
		if(config.getProperty("browser").equals("chrome")){
			driver=new ChromeDriver();
			
		}
		
		driver.get((String) config.get("link1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
		driver.findElement(By.xpath(config.getProperty("fnameid"))).sendKeys(prop.getProperty("fname"));
		driver.findElement(By.xpath(config.getProperty("emailid"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(config.getProperty("phoneid"))).sendKeys(prop.getProperty("number"));
		driver.findElement(By.xpath(config.getProperty("cityid"))).sendKeys(prop.getProperty("cityname"));
		driver.findElement(By.xpath(config.getProperty("userid"))).sendKeys(prop.getProperty("emailn"));
		driver.findElement(By.xpath(config.getProperty("pdxpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(config.getProperty("button1xpath"))).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit"))));
		WebElement result=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(config.getProperty("successxpath"))));
		System.out.println(result.getText());
		
		try {
			Thread.sleep(2000);
			System.out.println("Success");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		}
}	




