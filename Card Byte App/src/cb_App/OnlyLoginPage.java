package cb_App;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vineet kumar\\Downloads\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://web.cardbyte.ai/login");

		// ==================== image link==============

//		 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[1]")).click();
//		 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/img[1]")).click();

		// ============= Login =====================
		

		driver.findElement(By.name("email")).sendKeys("vkmaur.ya847@gmail.com", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("1234567");
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
//		driver.findElement(By.linkText("Forgot password ?")).click();
		Thread.sleep(8000);
		System.out.println("login success");
		
		//============= Signup =================
		
//		driver.findElement(By.name("firstName")).sendKeys("vineet" , Keys.TAB);
//		driver.findElement(By.name("lastName")).sendKeys("kumar" , Keys.TAB);
//		driver.findElement(By.xpath("//div/button[@aria-label='back']")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		
		//=============== Other signup option =================
		
//		driver.findElement(By.xpath("//div/button[@aria-label='google']")).click();
//		driver.findElement(By.xpath("//div/button[@aria-label='twitter']")).click();
//		driver.findElement(By.xpath("//div/button[@aria-label='facebook']")).click();
//		driver.findElement(By.xpath("//div/button[@aria-label='apple']")).click();
//		driver.findElement(By.xpath("//div/button[@aria-label='microsoft']")).click();
	}

}
