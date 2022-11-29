import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sima_Register {
	public WebDriver driver;
	@BeforeTest
	public void Login() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://c01k8s01t-pe-sim.uksouth.cloudapp.azure.com:30063/member/home");
		driver.manage().window().maximize();
		  JavascriptExecutor js = (JavascriptExecutor)driver;	
          js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");			
          Thread.sleep(2000);
		System.out.println("=============Basic Info=======================");
	}
		
		
				
   @Test
   public void register_New() throws InterruptedException {
	   driver.findElement(By.xpath("/html/body/app-root/app-non-authorized/main/app-header/header/nav[1]/ul/li[4]/button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("eertaamneh73@gmail.com");
	   driver.findElement(By.xpath("/html/body/app-root/app-authorization/main/section/div/div/app-login-page/app-login/section/form/div[2]/input")).sendKeys("QQqq11!!");
	   driver.findElement(By.xpath("/html/body/app-root/app-authorization/main/section/div/div/app-login-page/app-login/section/form/div[3]/div/div[1]/button")).click();
    Thread.sleep(2000);
	   driver.findElement(By.xpath("//body[1]/app-root[1]/app-authorized[1]/main[1]/section[1]/app-main-dashboard[1]/app-kyc-stage[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/button[1]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.tagName("button")).click();
	   driver.navigate().back();
   }

   
   @Test
   public void Company_Details_2() {
	   
	   driver.findElement(By.xpath("//*[@id=\"licenseNo\"]")).sendKeys("2148596547");
	   driver.findElement(By.xpath("")).sendKeys("12/07/2022");
	   driver.findElement(By.xpath("//*[@id=\"vatRegistrationNo\"]")).sendKeys("34254245678653665");
	   driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-company-details-form/div/button")).click();
   }
   
   @Test
   public void National_Address() throws InterruptedException {
	   Select company_activities = new Select(driver.findElement(By.id("briefDescription")));
	   company_activities.selectByIndex(3);
		Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id=\"capital\"]")).sendKeys("123456789");
	   Thread.sleep(1000);
	   Select Legal_form = new Select(driver.findElement(By.id("briefDescription")));
	   Legal_form.selectByIndex(4);
	   driver.findElement(By.xpath("Legal_form")).click();
	   driver.findElement(By.xpath("//*[@id=\"dataSharing\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"website\"]")).sendKeys("https://www.facebook.com");
	   driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).sendKeys("58");
	   driver.findElement(By.xpath("//*[@id=\"memberLandline\"]")).sendKeys("0116567654");
	   driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-national-address-form/div/button")).click();
   
   }
   @Test 
   public void Credit_Product_Type() {
	   driver.findElement(By.xpath("//*[@id=\"customerType1\"]")).click();
	List <WebElement> product_offerd = driver.findElements(By.className("form-check-input mt-0 ng-untouched ng-pristine ng-valid"));
	   for(int i=0;i<product_offerd.size();i++) {
		   product_offerd.get(i).click();
	   }
	   driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-credit-product-form/div/button")).click();
	   
   }
 
   
   
   
   
   
   
   
   
   
   
   
   
   
}
