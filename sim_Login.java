import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sim_Login {
	public WebDriver driver;
	@BeforeTest
	public void Login() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://c01k8s01t-pe-sim.uksouth.cloudapp.azure.com:30064/backoffice/authorization/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("bdofficer1@simah.com");
		 driver.findElement(By.xpath("/html/body/app-root/app-authorization/main/section/div/div/app-bo-login/section/form/div[2]/input")).sendKeys("bdofficer1");
		 driver.findElement(By.xpath("/html/body/app-root/app-authorization/main/section/div/div/app-bo-login/section/form/button")).click();
		 Thread.sleep(3000);
	}
	@Test
	public void Login_in() throws InterruptedException {
	driver.findElement(By.xpath("//a[normalize-space()='10000377']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[1]/div/div[13]/div/label[1]")).click();
	 Select company_activities = new Select(driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[1]/div/div[15]/select")));
	   company_activities.selectByIndex(1);
		
	   Select company_activities_2 = new Select(driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[1]/div/div[16]/select")));
	   company_activities_2.selectByIndex(7);
	   
	   Select company_activities_3 = new Select(driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[1]/div/div[17]/select")));
	   company_activities_3.selectByIndex(5);
	   
	   Select company_activities_4 = new Select(driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[1]/div/div[18]/select")));
	   company_activities_4.selectByIndex(1);
	   
	   Select company_activities_5 = new Select(driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[1]/div/div[19]/select")));
	   company_activities_5.selectByIndex(9);
	   
	   Select company_activities_6= new Select(driver.findElement(By.xpath("//*[@id=\"ngForm\"]/div[1]/div/div[20]/select")));
	   company_activities_6.selectByIndex(9);
	   
	   driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/div/div/section/app-member-info/div/div[2]/main/div/div/app-basic-info/div/div/button[1]")).click();
	   driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/div/div/section/app-member-info/div/div[2]/main/div/div/app-contact-info/div/div[6]/button[1]")).click();
	   driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/div/div/section/app-member-info/div/div[2]/main/div/div/app-requirements-info/div/div[2]/div[11]/button[1]")).click();
	   driver.findElement(By.xpath("//*[@id=\"main\"]/div/button[1]")).click();
	   
	   driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/div/div/section/app-member-info/div/div[2]/main/div/div/app-supporting-details-info/app-request-change-modal/div/div/div[1]/button")).click();
	   
	   
	   Select Draft= new Select(driver.findElement(By.xpath("//*[@id=\"ngForm\"]/select")));
	   Draft.selectByIndex(3);
	   driver.findElement(By.xpath("//*[@id=\"ngForm\"]/button")).click();
	   driver.findElement(By.xpath("/html/body/app-root/app-authorized/main/div/div/section/app-member-info/div/div[2]/main/div/div/app-draft-membership-agreement/app-approve-return-reject-modal/div/div[1]/button[1]")).click();
	   
	   
	   
	}
	
}
