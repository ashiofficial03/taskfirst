package deveshsir;

import org.openqa.selenium.chrome.ChromeDriver;

public class clickexception {
	/*
	 * click - 
	 * 
	 * 		-> InvalidSelectorException
	 * 		-> NoSuchElementException
	 * 		-> StaleElementReferenceException
	 * 		-> ElementClickInterceptedException
	 * 		   --------------------------------
	 * 				-> your element is not allowing to click, instead some other
	 * 				   element is allowing to click.		
	 * 				   You target one element to click, but click effect of other
	 * 				   element, so your element is not clickable.
	 * 
	 * 					Element visible in source code and also element visible in page, 
	 * 					but not allow to click event. 
	 * 					To solve it we need to click on clickable element.
	 * 
	 * 		-> ElementNotInteractableException / ElementIsNotClickableException
	 * 		   -----------------------------------------------------------------
	 * 						SWD-4						SWD-3
	 * 
	 * 				-> Element visible in source code but not visible in page.
	 * 				   If you are trying to click those element which is visible 
	 * 				   in source code, then it will raise ElementNotInteractableException.
	 * 
	 */

	public static void main(String []args) throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
	}
	

}

