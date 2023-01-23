package SeleniumTasks;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TaskFour {

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
		
		//wait 10 Seconds for Loading time using IMPLICITLYWAIT
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement realTime= driver.findElement(By.xpath("(//div[@id='realTime__ui__dropdown'])[1]"));
		Thread.sleep(3000);
		realTime.click();
		
		//Browser Test Page Verification using assertNotEquals
		WebElement browTest=driver.findElement(By.xpath("(//a[@id='realtime__browser__menu'])[1]"));
		browTest.click();
		String ActualText;
		ActualText=driver.findElement(By.xpath("//a[@class='aside__dropdown__item has__spa active']")).getText();
		String ExpectedText= "BrowserTesting";
		Assert.assertNotEquals(ActualText,ExpectedText);
		System.out.println("Browser Test Page Name Verification passed");
		System.out.println("Page Name is:" +ActualText);
		System.out.println("-------------------------");
		
		//App Test Page Verification using assertEquals
		WebElement appTest=driver.findElement(By.xpath("//a[@id='realtime__app__menu']"));
		appTest.click();
		String ActualText1;
		ActualText1=driver.findElement(By.xpath("//a[@href='https://app.lambdatest.com/console/realtime/app']")).getText();
		String ExpectedText1="App Testing (virtual)";
		Assert.assertEquals(ActualText1, ExpectedText1);
		System.out.println("App Test Page Name Verification passed");
		System.out.println("Page Name is:" +ActualText1);
		
		WebElement dashBoard=driver.findElement(By.xpath("//a[@id='dashboard_sidebar']"));
		dashBoard.click();
		Thread.sleep(2000);
		WebElement profLogo=driver.findElement(By.xpath("//div[@id='profile__dropdown__parent']//following::a[@id='profile__dropdown']"));
		profLogo.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='Log out'])[1]")).click();
	
	}



}
