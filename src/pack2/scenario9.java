package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\DriverProject\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	    act.click(driver.findElement(By.xpath("//span[text()='More Filters']"))).build().perform();
		
	
		driver.findElement(By.xpath("//span[text()='Gold Purity']")).click();
		driver.findElement(By.xpath("//span[text()=' 22k ']")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		int count=driver.findElements(By.xpath("//ul[@class='product-grid search-box-result']/li")).size();
		System.out.println(count);
		driver.close();

  }

	}


