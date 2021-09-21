package cb_App;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vineet kumar\\Downloads\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.cardbyte.ai/login");
		
		driver.findElement(By.name("email")).sendKeys("vkmaurya847@gmail.com", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("1234567");
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		Thread.sleep(8000);
		System.out.println("login success");
		
		driver.findElement(By.xpath("//div/button[@aria-label='show 17 new notifications']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span/img[@alt='Delete Notification']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Card Added To Contacts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h6[contains(text(),'Add Card')]")).click();  
		
		driver.findElement(By.xpath("//span[contains(text(),'work')]")).click();
		
		driver.findElement(By.xpath("//button/span[contains(text(),'Add')]")).click();
		
//		driver.findElement(By.xpath("//h6[contains(text(),'Send Card')]")).click();
//		driver.findElement(By.xpath("//h6[contains(text(),'Block')]")).click();
//		driver.findElement(By.xpath("//h6[contains(text(),'Report')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]")).click();
	}
}
