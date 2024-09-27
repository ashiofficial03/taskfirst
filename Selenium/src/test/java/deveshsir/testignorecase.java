package deveshsir;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class testignorecase {
public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Browser name = ");
		String browserName =  scanner.nextLine();
		
		RemoteWebDriver driver = null;
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("ChromeBrowser Open");
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			System.out.println("FirefoxBrowser Open");
		}
		
		else if (browserName.equalsIgnoreCase("edge")) {
			driver =  new EdgeDriver();
			System.out.println("Edge Browser Open");
		}
		
		else if(browserName.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
			System.out.println("InternetExplorer Browser Open");
		}
		else if(browserName.equals("safari")) {
			SafariDriver driver1 = new SafariDriver();
			System.out.println("Safari Browser Open");
		}
		
		else {
			System.out.println("Please check given Browser name");
			System.exit(0);
		}
		
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.close();
		 
		
	}

}
