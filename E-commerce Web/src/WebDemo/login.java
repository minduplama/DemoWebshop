package WebDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class login {
	public static void infologin() throws InterruptedException {
		String url="https://demowebshop.tricentis.com/login";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver login=new ChromeDriver();
		login.get(url);
		login.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login.manage().window().maximize();
		
		login.findElement(By.id("Email")).sendKeys("lamamindup32@gmail.com");
		Thread.sleep(5000);
		login.findElement(By.id("Password")).sendKeys("demo11");
		login.findElement(By.id("RememberMe")).click();
		login.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")).click();
		
			WebDriverWait wait = new WebDriverWait(login,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("small-searchterms")));
		
			login.close();
	}

}
