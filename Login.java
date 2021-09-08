package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
	{
	public static void main(String[] args) throws InterruptedException 
		{		
			System.setProperty( "webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			
			d.manage().window().maximize(); // Max the window 
		    d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	//Implicit wait
			d.get("https://platformrc.wyscout.com/app/");	//Navigate the URL
	
			//Identify the valid email id & password
			
			d.findElement(By.id("login_username")).sendKeys("prajaktashendkar10@gmail.com");
			d.findElement(By.id("login_password")).sendKeys("Prajakta@123");
			d.findElement(By.id("login_button")).click();
			
			String u = d.getCurrentUrl();
			
				if (u.equals("https://platformrc.wyscout.com/app/")) 
					{
						System.out.println(" Login Successfully ");
						
					}
				else 
					{
						System.out.println(" Unsuccessfully login");
					} 
				
			Thread.sleep(10000);
			d.close();	//close browser	
			
		} 
	
	}


