package seliniumpk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitTime {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Button3"))).click();
		

	}

}
