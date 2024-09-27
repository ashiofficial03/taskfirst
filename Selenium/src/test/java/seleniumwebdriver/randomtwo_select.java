package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class randomtwo_select {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://tizag.com/htmlT/htmlcheckboxes.php");
			//click all checkboxes
	List<WebElement> checkboxes=	 driver.findElements(By.xpath("(//td[@class='mainIn']/div[6])/input"));
	
	for(WebElement checkbox:checkboxes) {
		if (!checkbox.isSelected()) {
            checkbox.click();
        }
	}
	//click at least two checkboxes
	Thread.sleep(5000);
	  // Generate two random indices to click two checkboxes
    int randomIndex1 = (int) (Math.random() * checkboxes.size());
    int randomIndex2;
    do {
        randomIndex2 = (int) (Math.random() * checkboxes.size());
    } while (randomIndex2 == randomIndex1);

    // Click the checkboxes at the random indices
    checkboxes.get(randomIndex1).click();
    checkboxes.get(randomIndex2).click();

	}

}


