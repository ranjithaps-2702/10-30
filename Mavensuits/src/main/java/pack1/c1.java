package pack1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {

	@Test(groups="one")
	public void t1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.google.com");
		
		//create on object for point class
		//pass desired x and y value in it
		//apply it on window
		
		
		Point pt=new Point(200,300);
		ob.manage().window().setPosition(pt);
		Thread.sleep(3000);
		
		
	}
	
}
