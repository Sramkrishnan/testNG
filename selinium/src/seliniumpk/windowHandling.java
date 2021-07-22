package seliniumpk;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) throws Exception {

		System.setProperty("window.chrome.driver", "D:\\Software Testing\\JAVA\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		String parentWindow = driver.getWindowHandle();

		WebElement button1 = driver.findElement(By.id("home"));
		button1.click();

		Set<String> childWindow = driver.getWindowHandles();

		for (String window : childWindow) {
			driver.switchTo().window(window);
		}
		
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		edit.click();
		
		for (String clsWind : childWindow) {
			if(!clsWind.equals(parentWindow)) {
				Thread.sleep(2000);
				driver.switchTo().window(clsWind);
				driver.close();
			}	
		}
		
		driver.switchTo().window(parentWindow);
		
		WebElement button2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		button2.click();
		
		Set<String> mulWin = driver.getWindowHandles();
		
		for (String mulwindows : mulWin) {
			if(!mulwindows.equals(parentWindow)) {
				Thread.sleep(2000);
				driver.switchTo().window(mulwindows);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.close();		

	}

}
