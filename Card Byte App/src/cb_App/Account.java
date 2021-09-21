package cb_App;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account {

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
		
		driver.findElement(By.xpath("//div/button[@aria-label='account of current user']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
		
	
		
		/////////////// profile details //////////////
//		driver.findElement(By.xpath("//div[@id='setting-sidebar']/ul[1]/li[1]")).click();
//		t1();
////		driver.findElement(By.xpath("//div/span[@class='edit_icon_center']")).click();
//		WebElement fname = driver.findElement(By.name("firstName"));
//		fname.clear();
//		fname.sendKeys("Vineet" , Keys.TAB);
//		WebElement lname = driver.findElement(By.name("lastName"));
//		lname.clear();
//		lname.sendKeys("Kumar");
//		
//		WebElement mobile = driver.findElement(By.name("mobile"));
//		mobile.clear();
//		mobile.sendKeys("+918896993158");
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		
		
//		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
//		t1();
//		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'No')]")).click();
		
		
		////////////////// Privacy ////////////////
//		driver.findElement(By.xpath("//span[contains(text(),'Privacy')]")).click();
//		t1();
////		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[1]/span[1]/button[1]")).click();     // back button
////		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[1]/span[3]/button[1]")).click();     //cancel button
//		
//		////////  who can add you ? ////////////////
//		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[2]/div[2]/div[1]/div[2]/span[1]")).click();  /// 1
//		t1();
//		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[2]/div[3]/div[1]/div[2]/span[1]")).click();  /// 2
//		t1();
//		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[2]/div[4]/div[1]/div[2]/span[1]")).click();  /// 3
//		t1();
//		////////who can add you ? ////////////////
//		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[3]/div[2]/div[2]/span[1]")).click();  /// 1
//		t1();
//		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[3]/div[4]/div[2]/span[1]")).click();  /// 2
		
		
		////////// Notifications  /////////////////
//		driver.findElement(By.xpath("//span[contains(text(),'Notifications')]")).click();
//		t1();
////		driver.findElement(By.xpath("//div[@id='notofication']/span[1]/button[1]")).click();		// back button
////		driver.findElement(By.xpath("//div[@id='notofication']/span[3]/button[1]")).click();		//cancel button
//		
//			/////////////// Get Latest Updates ////////////
//		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[1]/div[2]/div[1]/div[2]/span[1]")).click();
//		t1();
//		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[1]/div[3]/div[1]/div[2]/span[1]")).click();
//		
//		/////////////////  Your network - Recommend contacts?  ///////////////////
//		t1();
//		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[2]/div[2]/div[2]/span[1]")).click();
//		t1();
//		driver.findElement(By.xpath("//div[@id='privacy-sidebar']/div[2]/div[4]/div[2]/span[1]")).click();
		
		
		/////////////////////////  My Plan /////////////////////
//		driver.findElement(By.xpath("//span[contains(text(),'My Plan')]")).click();
//		t1();
////		driver.findElement(By.xpath("//div[@id='plan-container']/div[1]/span[1]/button[1]")).click();		// back button
////		driver.findElement(By.xpath("//div[@id='plan-container']/div[1]/span[3]/button[1]")).click();		//cancel button
//		
//		driver.findElement(By.xpath("//p[contains(text(),'Gold')]")).click();
//		t1();
//		driver.findElement(By.xpath("//button[contains(text(),'Pay & Subscribe')]")).click();
//		
////		driver.findElement(By.xpath("//div/div[@class='plan-container']/div[2]/div[1]/input[1]")).sendKeys("abcdef");	///promo code ?
////		t1();
////		driver.findElement(By.xpath("//a[contains(text(),'Apply')]")).click();
		
		/////////////////  R&E page ////////////////
//		driver.findElement(By.xpath("//span[contains(text(),'Refer And Earn')]")).click();
		
		/////////////// Help page ///////////////
//		driver.findElement(By.xpath("//span[contains(text(),'Help')]")).click();
		
		//////////////////  feedback /////////////////
//		driver.findElement(By.xpath("//span[contains(text(),'Feedback')]")).click();
//		
////		driver.findElement(By.xpath("//div[contains(text(),'Choose category')]")).click();
////		driver.findElement(By.cssSelector("#react-select-9-option-3")).click();
////		driver.findElement(By.id("comments")).sendKeys("fdsfdsfdsfdfssdfs");
////		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
//		t1();
////		driver.findElement(By.xpath("//div[@id='CommentBox']/div[1]/span[1]/button[1]")).click();		// back button
//		driver.findElement(By.xpath("//div[@id='CommentBox']/div[1]/span[3]/button[1]")).click();		//cancel button
		
		////////////////// About //////////////
		driver.findElement(By.xpath("//span[contains(text(),'About')]")).click();
	}
	public static void t1() throws InterruptedException
	{
		Thread.sleep(1000);
	}

}
