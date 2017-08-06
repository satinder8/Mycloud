
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import warehouse.Bhandle;


public class test1 extends Bhandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaonair.com");
		driver.manage().window().maximize();

	driver.findElement(By.xpath("html/body/header/div/div/div[4]/div/ul/li[1]/a")).click();
	driver.findElement(By.xpath(".//*[@id='signin_form']/div[1]/input")).sendKeys("hello");
	driver.findElement(By.xpath("dfghjk")).sendKeys("dfghjk");
		
}
	
}

//hello
