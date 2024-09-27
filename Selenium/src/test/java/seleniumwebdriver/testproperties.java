package seleniumwebdriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testproperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		RemoteWebDriver rwd;
		FileInputStream ff;
		rwd=new ChromeDriver();
		Properties pop=new Properties();
		ff=new FileInputStream("./src/test/resources/properties/or.propeerties");
	    pop.load(ff);
	    Properties config=new Properties();
	    ff=new FileInputStream("./src/test/resources/properties/config.properties");
	    config.load(ff);
	    System.out.println(pop.getProperty("username"));
	    System.out.println(config.get("link1"));
	    
	    rwd.get((String) config.get("link1"));
	    Thread.sleep(3000);
	    
	    
	    
	    
	    
	   rwd.close();
	}

}
