package JP;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class first {
WebDriver driver;

public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "/Users/sujathomson/Documents/Drviers/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.algaecal.com/product/algaecal-basic/");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,700)");
	
}

public void closebrowser() {
	
	driver.quit();
}
public void addtocart() throws InterruptedException {
	Thread.sleep(50000);
	
	//driver.findElement(By.("")).click();
	List<WebElement> objlinks = driver.findElements(By.tagName("a"));
	for (WebElement objcurr : objlinks) {
		 String strlinktext = objcurr.getText();
		 
		 
		 System.out.println(strlinktext);	 	 	
	}
	
	driver.findElement(By.xpath("//*[@id=\"cta-bundle\"]/div/div/div/div[2]/div/div/div[3]/button"));
	
}
	public static void main(String[] args) throws InterruptedException {
	
		
		first obj = new first();
		obj.launchbrowser();
		obj.addtocart();
		//obj.closebrowser();
		

	}

}
