import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SupportingDocuments {
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
	public void documents() throws InterruptedException {
		List <WebElement> documents_list = driver.findElements(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-supporting-documents/div[1]/div/div[2]/div[1]/div[1]/div[3]/div/div/button"));
		   for(int i=0;i<documents_list.size();i++) {
			   documents_list.get(i).click();
		   }		
		driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-supporting-documents/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-member-package/section/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-verify-submission/div[10]/button")).click();
		

		
		
		
		
		
		
		
		
		
		
	}

}
