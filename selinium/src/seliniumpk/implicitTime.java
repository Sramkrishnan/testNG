package seliniumpk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitTime {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.manage().window().maximize();

	}

}
