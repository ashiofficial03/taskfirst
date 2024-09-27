package Testrecorder;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import atu.testrecorder.ATUTestRecorder;

public class RecordTesting {

public static void main(String[] args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		Date date = new Date();
		String vp = "/target" + sdf.format(date);

		ATUTestRecorder recorder = new ATUTestRecorder(vp, false);
		recorder.start();

		// selenium script starts

		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		Thread.sleep(5000);

		try {
			// close the advertisement box
		} catch (Exception exception) {

		}

		WebElement carouselSlider = driver.findElement(By.className("swiper-wrapper"));
		List<WebElement> slides;
		int count = 0;

		String tagName = carouselSlider.getTagName();

		if (tagName.equals("div")) {
			slides = carouselSlider.findElements(By.xpath("child::div")); // 4 slides

			for (WebElement slide : slides) {
				try {

					if (slide.getAttribute("data-clone").equals("false")) {
						count = count + 1;
					}

				} catch (Exception exception) {
					count = count + 1;
				}
			}
		}

		else {
			slides = carouselSlider.findElements(By.xpath("child::li"));
			count = slides.size();
		}
		System.out.println("Total of all slides = " + slides.size());
		System.out.println("Count of all visible slides = " + count);

		String transformvalue = carouselSlider.getCssValue("transform");
		if (transformvalue.equals("none")) {
			transformvalue = carouselSlider.getCssValue("transform-style");
		}

		if (transformvalue.contains("3d")) {
			System.out.println("This all Slides is 3D slides");
		} else {
			System.out.println("This all Slides is 2D slides");
		}

		String movingSlides = carouselSlider.getCssValue("transform");
		if (movingSlides.equals("none")) {
			System.out.println("Not Moving Automatically");
		} else {
			System.out.println("Moving Automatically");

			String c = movingSlides.substring(7, movingSlides.length() - 1);

			String p[] = c.split(",");

			p[4] = p[4].trim();
			p[5] = p[5].trim();

			float x = Float.parseFloat(p[4]);
			float y = Float.parseFloat(p[5]);

			if (x < y && y == 0) {
				System.out.println("Slides are moving from Right to Left");
			}

			else if (x > 0 && y == 0) {
				System.out.println("Slides are moving from Left to Right");
			}

			else if (x == 0 && y < 0) {
				System.out.println("Slides are moving from Bottom to top");
			}

			else {
				System.out.println("Slides are moving from top to Bottom");
			}

		}
		System.out.println("Transform Attribute value = " + movingSlides);

		// check weather your slides slow or fast
		String transitionValue = carouselSlider.getCssValue("transition");
		System.out.println("Transition Value = " + transitionValue);

		String[] q = transitionValue.split(" ");

		if (q[2].equals("ease-in")) {
			System.out.println("Slow starts for each slides");
		} else if (q[2].equals("ease-out")) {
			System.out.println("Slow ends for each slides");

		}

		else {
			System.out.println("Slow starts and Slow ends for each slides");
		}

		// get duration of each slide
		System.out.println("Duration of each slide is = " + q[1]);

		// get delay between each slides

		System.out.println("delay between each slides is = " + q[3]);

		driver.close();

		recorder.stop();

	}

}
