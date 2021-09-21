package cb_App;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Companies {

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
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Companies')]")).click();
		
		//  Implementation of  filter from contact page // 
		t1();
		driver.findElement(By.xpath("//h6[contains(text(),'Apple Inc')]")).click();
		t1();
		driver.findElement(By.cssSelector("[data-id='1']")).click();
		t1();
//		Other test cases can get from contact page or from favorite page ///   
		
		driver.findElement(By.xpath("//span[contains(text(),'Send my card')]")).click();
//		t1();
//		driver.findElement(By.xpath("//div[@id='send_card_component']/div[2]/div[1]/div[3]/button[1]/span[1]")).click(); // choose card to send
//		t1();
//		driver.findElement(By.xpath("//div[@id='send_card_component']/div[1]/div[2]/button[1]/span[1]")).click();  //cancel button
		
		
//		driver.findElement(By.xpath("//h6[contains(text(),'Back')]")).click();
	}
	public static void t1() throws InterruptedException
	{
		Thread.sleep(1000);
	}

}
