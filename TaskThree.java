package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThree {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.lambdatest.com/");

		String Title=driver.getTitle();

		System.out.println("Page Name: "+Title);

		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]") ).click();

		WebElement email =driver.findElement(By.id("email"));

		email.sendKeys("poojabalakrishnan96@gmail.com");

		WebElement password=driver.findElement(By.id("password"));

		password.sendKeys("abcdef@96");

		WebElement loginbtn=driver.findElement(By.id("login-button"));

		loginbtn.click();

		driver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement autoDropDown=driver.findElement(By.xpath("(//a[@id='automation__ui__dropdown__toggle'])[1]"));

		autoDropDown.click();

		Thread.sleep(5000);

		WebElement buildsDropDown=driver.findElement(By.xpath("//a[@id='automation_build_sidebar']"));

		Thread.sleep(3000);

		buildsDropDown.click();

		Thread.sleep(5000);

		WebElement dashBoard=driver.findElement(By.xpath("//a[@id='dashboard_sidebar']"));

		dashBoard.click();

		Thread.sleep(5000);

		try {

		WebElement TxtAuto=driver.findElement(By.xpath("(//a[@id='automation__ui__dropdown__toggle'])[1]"));

		if(TxtAuto.isDisplayed()) {

		String visibleTxt =TxtAuto.getAttribute("id");

		System.out.println("Welcome Text is : "+visibleTxt);

		}

		}catch(Exception e) {

		e.printStackTrace();

		}

		Thread.sleep(3000);

		WebElement profLogo=driver.findElement(By.xpath("//div[@id='profile__dropdown__parent']//following::a[@id='profile__dropdown']"));

		profLogo.click();

		Thread.sleep(5000);

		WebElement logOutbtn=driver.findElement(By.xpath("(//a[normalize-space()='Log out'])[1]"));

		logOutbtn.click();

		Thread.sleep(5000);
	}

}
