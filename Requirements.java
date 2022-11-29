import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Requirements {
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
	public void Business() {
		driver.findElement(By.xpath("//*[@id=\"annualIndividualCustomersFinanced\"]")).sendKeys("5000000");
		driver.findElement(By.id("annualIndividualCustomersFinanced")).sendKeys("1000000");

		driver.findElement(By.xpath("//*[@id=\"annualIndividualCustomersFinanced\"]")).sendKeys("9000000");
		driver.findElement(By.className("form-control ng-untouched ng-pristine ng-invalid")).sendKeys("5000000");

		driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-business-requirements-form/form/div[5]/div/input")).sendKeys("1000000");

		driver.findElement(By.xpath("//*[@id=\"annualIndividualCustomersFinanced\"]")).sendKeys("9000000");
		driver.findElement(By.className("//*[@id=\"annualIndividualCustomersFinanced\"]")).sendKeys("5000000");
        driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-business-requirements-form/div/button")).click();	
	}
	@Test
	public void Compliance() {
		
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div/div[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"typerOfCustomers\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div/div[4]/div/div[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div/div[5]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div/div[7]/div/div[2]/label")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-compliance-requirements-form/div/button")).click();
	}
	
	@Test
	public void Operation_Risk() {
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[1]/div[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[1]/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"typerOfCustomers\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[1]/div[5]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[2]/div[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"typerOfCustomers\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-operations-risk-form/div/button")).click();
		
	}
	@Test
	public void IT() {
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div/div[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"typerOfCustomers\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div/div[3]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div/div[4]/div/div[2]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/section/app-member-info/div/main/div/div[2]/div/app-it-form/div/button")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
