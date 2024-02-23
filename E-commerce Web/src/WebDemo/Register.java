package WebDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Register{
		 public static void registration() throws InterruptedException {
			 WebDriverManager.chromedriver().setup();
			 ChromeDriver register=new ChromeDriver();
			 register.get("https://demowebshop.tricentis.com/register");
			 
			 register.findElement(By.id("gender-male")).click();
			 //register.findElement(By.id("gender-female")).click();
			 
			 register.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("mindup");
			 register.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Tamang");
			 register.findElement(By.xpath("//input[@id='Email']")).sendKeys("tamangmindup75@gmail.com");
			 Thread.sleep(2000);
			 register.findElement(By.id("Password")).sendKeys("demo11");
			 register.findElement(By.id("ConfirmPassword")).sendKeys("demo11");
			 register.findElement(By.id("register-button")).click();
			 register.findElement(By.xpath("//input[@value='Continue']")).click();
			 register.close();
		 }

}
