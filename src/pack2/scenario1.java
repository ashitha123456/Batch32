package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class scenario1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\new\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//li[@class='menuparent gold-coins']"));
	    act.moveToElement(ele).build().perform();
	   driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-20gms,m']")).click();
		 Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"20 gram 24 KT Gold Coin | BlueStone.com");
	}

}


