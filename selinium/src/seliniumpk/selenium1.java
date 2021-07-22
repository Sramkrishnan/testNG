package seliniumpk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\JAVA\\selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://en-gb.facebook.com/login/web/");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("loginbutton"));
		System.out.println("Url opened successfully, test case TS001 Pass");
		
		d.findElement(By.linkText("Forgotten account?")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("identify_email"));
		System.out.println("Forgotten account link text working properly, test case TS002 Pass");
		
		d.navigate().back();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.linkText("Sign up for Facebook")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.name("firstname"));
		System.out.println("Sign up for Facebook link text working properly, test case TS003 Pass");
		
		d.navigate().back();
		d.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		d.findElement(By.id("loginbutton")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.linkText("Find your account and log in."));
		System.out.println("Clicking login button without username and passowrd showing error, test case TS004 Pass");
		
		d.navigate().back();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("email")).sendKeys("9715040621");
		d.findElement(By.id("loginbutton")).click();
		d.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		d.findElement(By.linkText("Forgotten password?"));
		System.out.println("Valid user name & without password, showing error msg, test case TS005 Pass");
		
		d.navigate().back();
		d.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		d.findElement(By.id("email")).sendKeys("9715040621");
		d.findElement(By.id("pass")).sendKeys("siva0701durga");
		d.findElement(By.id("loginbutton")).click();
		d.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		d.findElement(By.id("approvals_code"));
		System.out.println("login with valid username & pass, sucessfully login, test case TS006 Pass");
		
		d.navigate().back();
		d.findElement(By.id("loginbutton"));
		d.quit();

	}

}
