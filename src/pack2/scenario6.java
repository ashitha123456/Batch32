package pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class scenario6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\new\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
        driver.findElement(By.name("submit_search")).click();
        Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//span[text()='Price']"));
	    act.moveToElement(ele).build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
	    List<WebElement>product=driver.findElements(By.xpath("//ul[@id='product_list_ui']/li"));
	    System.out.println(product.size());
	}

}
