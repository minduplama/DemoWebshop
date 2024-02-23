package WebDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class logout {
		public static void funlogout() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver log= new ChromeDriver();
			log.get("https://demowebshop.tricentis.com/");
			log.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			log.manage().window().maximize();
			//login
			log.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
			log.findElement(By.id("Email")).sendKeys("lamamindup32@gmail.com");
			Thread.sleep(5000);
			log.findElement(By.id("Password")).sendKeys("demo11");
			log.findElement(By.xpath("//input[@value='Log in']")).click();
			//logout
			log.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
			Thread.sleep(5000);
			log.close();
		}

}
