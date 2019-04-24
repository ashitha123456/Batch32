package pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class scenario7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\new\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
        driver.findElement(By.name("submit_search")).click();
        Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//section[@id='Delivery Time-form']/span[@class='title style-fill i-right']"));
	    act.moveToElement(ele).build().perform();
	    driver.findElement(By.xpath("//div[@class='form-item ']/span[@data-tagcategory='Delivery Time']")).click();
	    List<WebElement> ele1=driver.findElements(By.xpath("//ul[@id='product_list_ui']/li"));
	    System.out.println(ele1.size());
	    

	}

}
