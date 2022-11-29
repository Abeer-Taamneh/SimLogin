import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Completed_som {
	public WebDriver driver;
    @BeforeTest
    public void Login() {
    	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://c01k8s01t-pe-sim.uksouth.cloudapp.azure.com:30063/member/pages/member-application");
		driver.manage().window().maximize();

    }
    @Test
	public void competed() {
    	
    	
    	
    }
	
	
	
	
	
	
	
	
	
  }
