package PageObjectModel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;

public class BaseClass {
		static WebDriver driver = null;
		
		
		public static WebDriver invokeBrowser(String s) throws InterruptedException {
			
			if(s.equals("microsoft"))
				{	
					driver = new EdgeDriver();   
					driver.manage().window().maximize();      
					driver.get("https://www.microsoft.com/en-us/edge/launch/try-edge-cle?form=MA13FJ"); 
					Thread.sleep(2000);
				}
			else if(s.equalsIgnoreCase("FireFox")) {
				driver = new FirefoxDriver();   
				driver.manage().window().maximize();      
				driver.get("https://www.mozilla.org/en-US/firefox/"); 
				Thread.sleep(2000);
			}
			else if(s.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();   
				driver.manage().window().maximize();      
				driver.get("https://www.google.com"); 
				Thread.sleep(2000);
			}
			else {
				System.out.println("None of the browser is matching");
			}
			return driver;
		}
		
		public static void ScreenShot() throws IOException{
			File src = null;
			src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("./ScreenShots/"+"Page-"+".png"));
		}
		
		public static void closeDriver(WebDriver d1) throws InterruptedException {
			Thread.sleep(2000);
			d1.close();
		}
		
}

