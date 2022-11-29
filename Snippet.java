//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Snippet {
//	public static void main(String[] args) {
//		public WebDriver driver;
//
//		@BeforeTest
//		public void Login() throws InterruptedException  {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			driver.get("http://c01k8s01t-pe-sim.uksouth.cloudapp.azure.com:30063/member/home");
//			driver.manage().window().maximize();
//		
//		}
//	
//		@Test
//		public void information_Testing() {
//			driver.findElement(By.xpath("//*[@id=\"licenseNo\"]")).sendKeys("2148596547");
//			driver.findElement(By.xpath("//*[@id=\"expiryDate\"]")).sendKeys("2022-11-27");
//		driver.findElement(By.xpath("//*[@id=\"vatRegistrationNo\"]")).sendKeys("34254");
//		driver.findElement(By.xpath("button")).click();
//		
//		}
//}