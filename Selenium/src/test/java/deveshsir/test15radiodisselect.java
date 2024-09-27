package deveshsir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test15radiodisselect {
	public static void main(String[] args) throws Exception {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> allRadioButtonAndCheckBoxElements = 
				driver.findElements(By.xpath("(//input[@type='radio']) | "
						+ "(//input[@type='checkbox'])"));
		System.out.println("All RadioButton and CheckBox Element in Websites = "+allRadioButtonAndCheckBoxElements.size());
		
		int numberOfVisibleRadioAndCheckboxElement = 0;
		int numberOfHiddenRadioAndCheckboxElement = 0;
		
		for(WebElement elements : allRadioButtonAndCheckBoxElements )
		{
			if (elements.isDisplayed()) {
				
				numberOfVisibleRadioAndCheckboxElement++;
				
				if (numberOfVisibleRadioAndCheckboxElement == 3) {
					if (!elements.isSelected()) {
						elements.click();
					}
				}
				
			}
			else
			{
				numberOfHiddenRadioAndCheckboxElement++;
			}
		}
		System.out.println("Visible element of RadioButtonAndCheckBoxElements = "+numberOfVisibleRadioAndCheckboxElement);
		System.out.println("Hidden element of RadioButtonAndCheckBoxElements = "+numberOfHiddenRadioAndCheckboxElement);
		
		
		
		
		int numberOfVisibleSelectAndDivElement = 0;
		int numberOfHiddenSelectAndDivElement = 0;

		
		List<WebElement> allDivAndSelectElements = 
				driver.findElements(By.xpath("(//div) | (//select)"));
		
		System.out.println("All Div and Select tag Element in Websites = "+allDivAndSelectElements.size());
		
		for(WebElement elements : allDivAndSelectElements )
		{
			if (elements.isDisplayed()) {
				
				numberOfVisibleSelectAndDivElement++;
			}
			else
			{
				numberOfHiddenSelectAndDivElement++;
			}
		}
		System.out.println("Visible element of SelectTagAndDivTag = "+numberOfVisibleSelectAndDivElement);
		System.out.println("Hidden element of SelectTagAndDivTag = "+numberOfHiddenSelectAndDivElement);

		driver.close();

	}
}


