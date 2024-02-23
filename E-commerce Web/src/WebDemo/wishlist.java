package WebDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class wishlist {
	public static void listdemo() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver list = new ChromeDriver();
		list.get("https://demowebshop.tricentis.com/");
		list.manage().window().maximize();
		
		list.findElement(By.id("small-searchterms")).sendKeys("3rd Album");
		list.findElement(By.xpath("//input[@type='submit']")).click();
		list.findElement(By.xpath("//a[contains(text(),'3rd Album')]")).click();
		list.findElement(By.id("addtocart_53_EnteredQuantity")).sendKeys("2");
		list.findElement(By.id("add-to-wishlist-button-53")).click();
		
		list.findElement(By.xpath("//span[contains(text(),'Wishlist')]")).click();
		Thread.sleep(5000);
		list.close();
		

	}

}
