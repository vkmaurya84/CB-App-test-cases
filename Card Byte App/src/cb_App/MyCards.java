package cb_App;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MyCards {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vineet kumar\\Downloads\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://web.cardbyte.ai/login");
		
		driver.findElement(By.name("email")).sendKeys("vkmaurya847@gmail.com", Keys.ENTER);
		t1();
		driver.findElement(By.name("email")).sendKeys("1234567");
	
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();

		System.out.println("login success");
		
		t2();
		driver.findElement(By.xpath("//div[contains(text(),'My Cards')]")).click();
		t1();
//		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]/span[1]")).click();
//		t1();
//		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		
			//==========edit card ================
		
//		driver.findElement(By.xpath("//div/span[@aria-label='edit-card']")).click();
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//		driver.findElement(By.xpath("//div[@id='2']")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click(); 
//		driver.findElement(By.xpath("//span[contains(text(),'Looks Good!')]")).click();
		
		   	 //============ view card ================
		
//		driver.findElement(By.xpath("//div/span[@aria-label='view-card']")).click();
//		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")).click();	 
//		driver.findElement(By.xpath("//div/span[@aria-label='delete-card']")).click();	
//		t1();
//		driver.findElement(By.xpath("//span[contains(text(),'No')]")).click();
		

		
		//================new card ==================
		
		
		driver.findElement(By.xpath("//h3[contains(text(),'Add a new card')]")).click();	
		
		driver.findElement(By.xpath("//div[contains(text(),'Prefix')]")).click();

		
		driver.findElement(By.cssSelector("#react-select-3-option-3")).click();
		//driver.findElement(By.id("react-select-3-option-2")).click();
		
		
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.clear();
		fname.sendKeys("vineet");
		t1();
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.clear();
		lname.sendKeys("kumar");
	 t1();
		
		//  Business name
		 driver.findElement(By.xpath("//div/div[text()='Business name*']")).click();
//		 t1();
		 driver.findElement(By.cssSelector("#react-select-4-option-5")).click();
		 
		 //  designation
		 driver.findElement(By.xpath("//div/div[text()='Designation*']")).click();
//		 t1();
		 driver.findElement(By.cssSelector("#react-select-5-option-2")).click();

		
		driver.findElement(By.name("addressLine1")).sendKeys("Ghaziabad NCR");
	 
		driver.findElement(By.name("pincode")).sendKeys("587467");
	 
		driver.findElement(By.name("mobileNumber")).sendKeys("+918978978978");
		
//		WebElement mail = driver.findElement(By.name("email"));
//		mail.clear();
//		t2();
	 
		driver.findElement(By.name("facebook")).sendKeys("https://facebook.com/");
		
		driver.findElement(By.xpath("//div/div[text()='Profession']")).click();
		driver.findElement(By.cssSelector("#react-select-6-option-1")).click();
		
		driver.findElement(By.xpath("//div/div[text()='Industry*']")).click();
		driver.findElement(By.cssSelector("#react-select-7-option-1")).click();
		
		driver.findElement(By.xpath("//div/div[text()='Experience Level']")).click();
		driver.findElement(By.cssSelector("#react-select-8-option-1")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//		t1();
//		driver.findElement(By.xpath("//div[@id='1']")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//		t1();
//		driver.findElement(By.xpath("//span[contains(text(),'Looks Good!')]")).click();
		
	}
	
	public static void t1() throws InterruptedException {
		Thread.sleep(2000);
	}
	public static void t2() throws InterruptedException {
		Thread.sleep(8000);
	}

}
