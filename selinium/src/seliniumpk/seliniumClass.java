package seliniumpk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seliniumClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\JAVA\\selenium\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://en-gb.facebook.com/login/web/");
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.findElement(By.id("email"));
		System.out.println("TS001 Url checking Test case PASS");
		
		wd.findElement(By.id("loginbutton")).click();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.findElement(By.linkText("Find your account and log in."));
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("TS002 No input Test case PASS");
		
		wd.findElement(By.id("email")).sendKeys("9715040621");
		wd.findElement(By.id("loginbutton")).click();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.findElement(By.linkText("Forgotten password?"));
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("TS003 Valid Username, without password Test case PASS");
		
		wd.findElement(By.linkText("Forgotten password?")).click();
		wd.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/a"));
		System.out.println("TS004 Forgotten password Test case PASS");
		
		wd.navigate().back();
		wd.findElement(By.linkText("Sign up for Facebook")).click();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.findElement(By.name("firstname"));
		System.out.println("TS005 Sign up Test case PASS");
		
		wd.quit();
				
		/*
		wd.get("http://brm.tremplintech.in/web_pages/login.aspx");
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.findElement(By.id("txt_unam")).sendKeys("sylix");
		wd.findElement(By.id("txt_pass")).sendKeys("admin");
		wd.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.findElement(By.id("LinkButton1")).click();
		System.out.println("TS001 PASS");
		*/
		
	}

}
