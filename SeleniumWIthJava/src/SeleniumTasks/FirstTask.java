package SeleniumTasks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTask {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aequalis\\eclipse-workspace\\SeleniumBatch\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.lambdatest.com/");

		driver.manage().window().maximize();
	
		WebElement login=driver.findElement(By.xpath("//a[@href='https://accounts.lambdatest.com/login']"));
		
		login.click();
		
		driver.close();

	}

}
