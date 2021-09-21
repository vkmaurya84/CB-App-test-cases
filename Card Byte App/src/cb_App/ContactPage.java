package cb_App;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactPage {

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
		Thread.sleep(8000);
		System.out.println("login success");

		// ==================== filter in contacts and next page ================
		
//		driver.findElement(By.xpath("//label[contains(text(),'K')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//label[contains(text(),'#')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div/button[@aria-label='Next page']")).click();

		// ==================== contacts =========================

		driver.findElement(By.cssSelector("[data-id='0']")).click();
		t1();
		driver.findElement(By.xpath("//div/button[@aria-label='block']")).click();
		driver.findElement(By.xpath("//div/button[@aria-label='report']")).click();
//		driver.findElement(By.xpath("//div/button[@aria-label='favourite']")).click();
//		driver.findElement(By.xpath("//div/button[@aria-label='tags']")).click();
//		t1();
//		driver.findElement(By.xpath("//span[contains(text(),'work')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
		driver.findElement(By.linkText("Scanned images")).click();
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
//		driver.findElement(By.xpath("//a/img[@alt='Phone call icon']")).click();
//		t1();
//		driver.findElement(By.xpath("//a/img[@alt='Mail icon']")).click();
//		t1();
//		driver.findElement(By.xpath("//a/img[@alt='Navigatio icon']")).click();
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
//		driver.findElement(By.xpath("//div/button[@aria-label='deep-link']")).click();
//		t1();
//		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
//		t1();
//		driver.findElement(By.xpath("//div/button[@aria-label='delete card']")).click();
////		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Remove')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
////		driver.findElement(By.xpath("//span[contains(text(),'No')]")).click();

	}
	public static void t1() throws InterruptedException
	{
		Thread.sleep(2000);
	}

}
