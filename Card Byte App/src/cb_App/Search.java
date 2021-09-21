package cb_App;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vineet kumar\\Downloads\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://web.cardbyte.ai/login");

		driver.findElement(By.name("email")).sendKeys("vkmaurya847@gmail.com", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("1234567");
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		Thread.sleep(10000);
		System.out.println("login success");
		
		
		driver.findElement(By.id("mui-component-select-search")).click();
		t1();
		driver.findElement(By.xpath("//ul/li[@data-value='CONTACTS']")).click();
		t1();
		driver.findElement(By.xpath("//div/input[@class='MuiInputBase-input']")).sendKeys("karan");
		t1();
		driver.findElement(By.xpath("//form/button[@aria-label='search']")).click();
		t2();
//		driver.findElement(By.xpath("//button/span[text()='contacts']")).click();
//		t2();
//		driver.findElement(By.xpath("//tbody/tr[1]")).click();
		
		///////////		Other test cases can get from contact page or from favorite page ///  
		
		driver.findElement(By.xpath("//button/span[text()='global']")).click();
		t2();
		driver.findElement(By.xpath("//button[@id='0']")).click();
	
		///////////////////// test case for tag can get from contact page //////////

//		driver.findElement(By.xpath("//h6[contains(text(),'Back')]")).click();
	}
	public static void t1() throws InterruptedException {
		Thread.sleep(1000);
	}
	public static void t2() throws InterruptedException {
		Thread.sleep(4000);
	}
}
