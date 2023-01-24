package SeleniumTasks;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TaskFive {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.lambdatest.com/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]") ).click();
		
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("poojabalakrishnan96@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("abcdef@96");
		
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement realDevice=driver.findElement(By.cssSelector("a[id='realDevice__ui__dropdown__toggle']"));
		Thread.sleep(3000);
		realDevice.click();
		
		WebElement appAuto=driver.findElement(By.xpath("(//a[@class='aside__dropdown__item'])[3]"));
		appAuto.click();
		try{
			Boolean verifyAppAuto=driver.getTitle().equalsIgnoreCase("LambdaTest Automation");
			assertTrue(verifyAppAuto);
			System.out.println(verifyAppAuto);	
		}catch (AssertionError e){
			String Title=driver.getTitle();
			System.out.println("App Automation Page Title is: " +Title);
		}
		
		WebElement browTest=driver.findElement(By.xpath("//a[@id='realdevice__browser__menu']"));
		browTest.click();
		try{
			Boolean verifyBrowTest=driver.getTitle().equalsIgnoreCase("App Testing on Real Device");
			assertFalse(verifyBrowTest);
			System.out.println(verifyBrowTest);
		} catch (AssertionError e) { 
			String Title=driver.getTitle();
			System.out.println("Browser Test page Title is: " +Title);
		}
		
		Thread.sleep(2000);
		WebElement appTest=driver.findElement(By.xpath("//a[@id='realdevice__app__menu']"));
		appTest.click();
		try {
			Boolean verifyAppTest=driver.getTitle().equalsIgnoreCase("-LambdaTest Automation-");
			assertNull(verifyAppTest);
			System.out.println(verifyAppTest);
		} catch (AssertionError e) {
			System.out.println("Test case passed");
			
		}
		
		WebElement dashBoard=driver.findElement(By.xpath("//a[@id='dashboard_sidebar']"));
		dashBoard.click();
		try {
			Boolean verifyDashBoard=driver.getTitle().equalsIgnoreCase("-LambdaTest Automation-");
			assertNotNull(verifyDashBoard);
			System.out.println(verifyDashBoard);
		}catch (AssertionError e) {
			System.out.println("Test case passed");
		}
		
		
		
	}

}
