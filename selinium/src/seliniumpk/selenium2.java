package seliniumpk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\JAVA\\selenium\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.com/?gws_rd=ssl");
		w.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		w.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a"));
		
		WebDriverWait wait = new WebDriverWait(w, 20);
		

	}

}
