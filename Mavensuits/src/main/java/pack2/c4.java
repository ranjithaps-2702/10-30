package pack2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class c4 {

	@Test
	public void pr() throws IOException, InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver ob=new ChromeDriver();
	ob.get("http://www.google.com");
	
	ob.findElementByLinkText("Images").click();
	Thread.sleep(3000);
	File f = ob.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\Admin\\eclipse-workspace\\Mavensuits\\src\\main\\java\\pack2\\a2.png"));
	ob.quit();
	
	
	
	}
	
}
