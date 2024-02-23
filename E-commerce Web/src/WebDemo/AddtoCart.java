package WebDemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class AddtoCart {
		public static void Additem() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver item=new ChromeDriver();
			  item.get("https://demowebshop.tricentis.com/");
			  item.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  item.manage().window().maximize();
			
			//WebElement searchBar=item.findElement(By.xpath("//input[@id='small-searchterms']"));
		    //searchBar.sendKeys("Blue Jeans"); 
		    item.findElement(By.id("small-searchterms")).sendKeys("Blue Jeans");
		    item.findElement(By.xpath("//input[@class=\"button-1 search-box-button\"]")).click();
		    item.findElement(By.xpath("//a[contains(text(),'Blue Jeans')]")).click();
		   
		    item.findElement(By.xpath("//input[@id='addtocart_36_EnteredQuantity']")).sendKeys("1");
		    item.findElement(By.xpath("//input[@id='add-to-cart-button-36']")).click();
		    Thread.sleep(5000);
		    item.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		    //button click
		    item.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		    //card coupon
		    item.findElement(By.xpath("//input[@name='discountcouponcode']")).sendKeys("coupon");
		    item.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[3]/input[2]")).click();
		    
		    item.findElement(By.id("termsofservice")).click();
		    item.findElement(By.id("checkout")).click();
		    //billing address
		   item.get("https://demowebshop.tricentis.com/onepagecheckout");
		   
		   item.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']")).sendKeys("mindup");
		   item.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']")).sendKeys("Tamang");
		   item.findElement(By.xpath("//input[@id='BillingNewAddress_Email']")).sendKeys("lamamindup32@gmail.com");
		   item.findElement(By.xpath("//input[@id='BillingNewAddress_Company']")).sendKeys("ABC.pvt.ltd");
		   
		   Select country= new Select(item.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
		   country.selectByVisibleText("Canada");
		   
		   Select pro = new Select(item.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']")));
		   pro.selectByVisibleText("Ontario");
		   
		  item.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("www");
		  item.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("112");
		  item.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']")).sendKeys("221");
		   
		   item.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("1122");
		   item.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("9842689910");
		   item.findElement(By.xpath("//input[@id='BillingNewAddress_FaxNumber']")).sendKeys("221");
		   item.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]")).click();
		 
		   item.findElement(By.xpath("//input[@id='PickUpInStore']")).click();
		   item.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[2]/div[2]/div[1]/input[1]")).click();
		   
		   item.findElement(By.xpath("//input[@value='Payments.PurchaseOrder']")).click();
		   item.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1]")).click();
		   
		   item.findElement(By.xpath("//div[@id='payment-method-buttons-container']")).click();
		   
		   item.findElement(By.xpath("//input[@id='PurchaseOrderNumber']")).sendKeys("981494748");
		   item.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/input[1]")).click();
		   Thread.sleep(5000);
		   item.findElement(By.xpath("//div[@id='checkout-step-confirm-order']")).click();
		   item.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[2]/input[1]")).click();
		   
		   item.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
		   
		   Thread.sleep(2000);
		}

}
