package SeleniumUdemyCourse.SeleniumUdemyCourse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxUI {
	public static void ain(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	
	driver.findElement(By.xpath("//a[normalize-space()='Bengaluru (BLR)']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	driver.findElement(By.cssSelector("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	
	
	
	
	}
}
