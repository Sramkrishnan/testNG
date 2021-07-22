package seliniumpk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thread {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.navigate().to("http://www.brm.tremplintech.in/web_pages/login.aspx");
		Thread.sleep(5000);
		d.manage().window().maximize();

	}

}
