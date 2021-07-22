package seliniumpk;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws Exception {
		
		System.getProperty("window.chrome.driver", "D:\\Software Testing\\JAVA\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		WebElement login = driver.findElement(By.id("Button3"));
		login.click();
		
		Alert newAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		newAlert.accept();
		
		Thread.sleep(2000);
		driver.close();

	}

}
