package pack2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c3 {


	@Test(groups="two")
	public void t3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		
		//webelements: present inside a frame
				// switch ur control to that frame
				// id, index, name
				ob.switchTo().frame(0);
				
				Actions ac= new Actions(ob);
				WebElement ele1 = ob.findElementById("draggable");
				WebElement ele2 = ob.findElementById("droppable");
				ac.dragAndDrop(ele1, ele2).build().perform();
				Thread.sleep(3000);
				
				
				

	}
}
