import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactDetails {
	public WebDriver driver;
	@BeforeTest
	public void Login() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://c01k8s01t-pe-sim.uksouth.cloudapp.azure.com:30063/member/home");
		driver.manage().window().maximize();
		 
	}
	  @Test
	  public void Contact_Details() throws InterruptedException {
		  driver.findElement(By.xpath("//*[@id=\"toggle-0-header\"]/button")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"contactName1\"]")).sendKeys("AbeerTaamneh");
		  driver.findElement(By.xpath("//*[@id=\"contactPhone1\"]")).sendKeys("567432567");
		  driver.findElement(By.xpath("//*[@id=\"contactEmail1\"]")).sendKeys("eertaamneh73@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"toggle-0\"]/div/button")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"contactName2\"]")).sendKeys("AbeerTaamneh");
		  driver.findElement(By.xpath("//*[@id=\"contactPhone2\"]")).sendKeys("567432567");
		  driver.findElement(By.xpath("//*[@id=\"contactEmail2\"]")).sendKeys("eertaamneh73@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"toggle-1\"]/div/button")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"contactName3\"]")).sendKeys("AbeerTaamneh");
		  driver.findElement(By.xpath("//*[@id=\"contactPhone3\"]")).sendKeys("567432567");
		  driver.findElement(By.xpath("//*[@id=\"contactEmail3\"]")).sendKeys("eertaamneh73@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"toggle-2\"]/div/button")).click();
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"contactName4\"]")).sendKeys("AbeerTaamneh");
		  driver.findElement(By.xpath("//*[@id=\"contactPhone4\"]")).sendKeys("567432567");
		  driver.findElement(By.xpath("//*[@id=\"contactEmail4\"]")).sendKeys("eertaamneh73@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"toggle-3\"]/div/button")).click();
		  

		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"contactName5\"]")).sendKeys("AbeerTaamneh");
		  driver.findElement(By.xpath("//*[@id=\"contactPhone5\"]")).sendKeys("567432567");
		  driver.findElement(By.xpath("//*[@id=\"contactEmail5\"]")).sendKeys("eertaamneh73@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"toggle-4\"]/div/button")).click();
		  driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-contact-details-form/div/button")).click();
		  
		  
	  }
}
