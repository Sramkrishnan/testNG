package seliniumpk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("http://demo.guru99.com/test/upload/");
		d.findElement(By.id("uploadfile_0")).sendKeys("D:\\Software Testing\\Testing_notes.pdf");

	}

}
