package seliniumpk;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver s = new ChromeDriver();
		s.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		s.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		s.manage().window().maximize();
		s.findElement(By.id("txt_unam")).sendKeys("sylix");
		s.findElement(By.id("txt_pass")).sendKeys("admin");
		s.findElement(By.id("Button3")).click();
		s.findElement(By.linkText("Customermanagement")).click();
		Select state = new Select(s.findElement(By.id("ContentPlaceHolder1_ddl_state")));
		state.selectByValue("Tamil Nadu");
		
		JavascriptExecutor js = (JavascriptExecutor) s;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
		
		File ss = ((TakesScreenshot)s).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("D://sample.jpg"));

	}

}
