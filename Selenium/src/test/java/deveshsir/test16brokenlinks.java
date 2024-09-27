package deveshsir;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test16brokenlinks {
	     
	@Test
	public void test16()throws Exception {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Collect all the type of tag element in this page
		List<WebElement> list = driver.findElements(By.xpath("//*"));

		int correctWorkingLink = 0;
		int brokenLink = 0;
		int totalLink = 0;

		// goto each loop
		for (WebElement element : list) {
			try { // to handle any exception and to continue loop

				// test-case-1
				// weather that element has "href" attribute or not...
				// If an element is having "href" attribute, that element
				// is called Hyperlink

				if (element.getAttribute("href") != null) {
					String x = element.getAttribute("href");

					// test-case-2
					// check weather that "href" attribute value is url (address) or not
					// Some element "href" attribute value (not an url) - refer local page only.

					if (x.startsWith("https") || x.startsWith("http")) {
						// test-case-3 weather that url related server is responding or not

						totalLink++;

						URL u = new URL(x);
						HttpURLConnection connection = (HttpURLConnection) u.openConnection();
						connection.connect();

						String y = connection.getResponseMessage();
						int z = connection.getResponseCode();

						connection.disconnect();

						if (z >= 200 && z <= 299) {
							correctWorkingLink++;
						} else {
							brokenLink++;
							System.out.println(x + " send  " + y + " with " + z);
						}

					}

				}

			} catch (Exception exception) {
				System.out.println(exception.getMessage());
			}

		}// loop complete

		
		System.out.println("Total Links are = "+totalLink);
		System.out.println("Correctly working links are = "+correctWorkingLink);
		System.out.println("Broken links = "+brokenLink);
		
		try {
			System.out.println("");
		}
		finally {
			driver.close();
		}
	}
}


