package WebDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class MyAccount {
	public static void customerinfo() throws InterruptedException {
				
		WebDriverManager.chromedriver().setup();
		ChromeDriver account=new ChromeDriver();
		account.get("https://demowebshop.tricentis.com/login");
        account.manage().window().maximize();
        
		account.findElement(By.id("Email")).sendKeys("tamangmindup75@gmail.com");
		account.findElement(By.id("Password")).sendKeys("demo11");
		account.findElement(By.xpath("//input[@value='Log in']")).click();
		account.get("https://demowebshop.tricentis.com/customer/info");
		account.findElement(By.xpath("//a[contains(text(),'tamangmindup75@gmail.com')]")).click();
		account.findElement(By.xpath("//a[contains(text(),'Customer info')]")).click();
		account.findElement(By.xpath("//input[@value='Save']")).click();
		account.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		account.findElement(By.xpath("//a[contains(text(),'Change password')]")).click();
		account.findElement(By.xpath("//input[@id='OldPassword']")).sendKeys("demo11");
		account.findElement(By.xpath("//input[@id='NewPassword']")).sendKeys("demo24");
		account.findElement(By.xpath("//input[@id='ConfirmNewPassword']")).sendKeys("demo24");
		account.findElement(By.xpath("//input[@value='Change password']")).click();
		Thread.sleep(5000);
		account.close();
		
		}
	


}
