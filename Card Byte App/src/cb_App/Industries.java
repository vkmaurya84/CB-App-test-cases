package cb_App;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Industries {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vineet kumar\\Downloads\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.cardbyte.ai/login");

		driver.findElement(By.name("email")).sendKeys("vkmaurya847@gmail.com", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("1234567");
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		Thread.sleep(8000);
		System.out.println("login success");
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Industries')]")).click();
		
	//  Implementation of  filter from contact page // 
		
		driver.findElement(By.xpath("//h6[contains(text(),'Automotive')]")).click();
		t1();
		driver.findElement(By.cssSelector("[data-id='1']")).click();

//		//////  Other test cases can get from contact page or from favorite page //////////////
		
//		driver.findElement(By.xpath("//h6[contains(text(),'Back')]")).click();
	}
	public static void t1() throws InterruptedException
	{
		Thread.sleep(2000);
	}
}
