package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aequalis\\eclipse-workspace\\SeleniumBatch\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.lambdatest.com/");

		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[2]")).click();

		driver.findElement(By.id("name")).sendKeys("Poojabalakrishnan");

		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys("poojabalakrishnan@gmail.com");

		Thread.sleep(3000);

		driver.findElement(By.id("userpassword")).sendKeys("xxxxxxxxxx");

		Thread.sleep(3000);

		driver.findElement(By.id("country_code")).sendKeys("+91");

		Thread.sleep(3000);

		driver.findElement(By.id("phone")).sendKeys("9876543210");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).click();

		Thread.sleep(3000);

		String y=driver.getCurrentUrl();

		if (y.equals("https://accounts.lambdatest.com/email/verify"))

		{

		System.out.println("Test Case Passed");

		}

		else

		{

		System.out.println("Test Case Failed because The mail id is already registered");

		}

		driver.close();

		}

	}


