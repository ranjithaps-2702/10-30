package lg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class L1 {

	static Logger log= LogManager.getLogger(L1.class);
	
	@Test(groups="one")
	public void t1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.google.com");
		log.info("visited Website");
		System.out.println(ob.getTitle());
		log.info("got title");
		log.info("goint to quit" );
		ob.quit();
		
		
	}
}
