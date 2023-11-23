import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myProfile {
	
	public static float getDecimalRandomNumber(){
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextFloat();
    }

	static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		setBrowser();
		setBrowserConfig();
		runTest();
	}

	public static void setBrowser() {
		browser = "chrome";		
	}

	public static void setBrowserConfig() {
		String projectLocation = System.getProperty("user.dir");

		if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation+"/lib/chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (browser.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation+"/lib/chromedriver.exe");
			System.setProperty("webdriver.firefox.bin", projectLocation+"/lib/chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}


	}

	public static void runTest() throws Throwable {
		
		driver.get("https://ethora.ethoradev.com");
		Thread.sleep(6000);
		
	    // 3 | Login 	    
		driver.get("https://ethora.ethoradev.com/signIn");
		Thread.sleep(1000);
	    driver.findElement(By.id("regularLogin")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("email")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("email")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.id("email")).sendKeys("baseapp@mailinator.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).sendKeys("baseapp@mailinator.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("submitEmail")).click();
	    System.out.println("Login Sucessfully");
	    
	    // My Profile
	    //driver.get("https://ethora.ethoradev.com/chat/none");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("path")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div/li/p")).click();
	    Thread.sleep(3000);
	    System.out.println("Click on Menu Tab Sucessfully");
//	    driver.get("https://ethora.ethoradev.com/profile/0xEC3C9e873A51b254a375deBC66A027d204fd52d4");
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/ul/li/div/div[2]/span")).click();
//	    Thread.sleep(2000);
//	    driver.get("https://ethora.ethoradev.com/provenance");
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/ul/li/div/div[2]/p")).click();
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/ul/li/div/div[2]/p")).click();
//	    driver.findElement(By.xpath("//img[@alt='image1']")).click();
//	    driver.findElement(By.cssSelector("path")).click();
	    
	   // driver.get("https://ethora.ethoradev.com/chat/974add7ad347cd39b5fff2c16939003a27ce74f038cdc9884c03575e28078394");
	    //driver.findElement(By.cssSelector("path")).click();
	   // Thread.sleep(2000);
	  //  driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div/li/p")).click();
	    Thread.sleep(3000);
	    driver.get("https://ethora.ethoradev.com/profile/0xEC3C9e873A51b254a375deBC66A027d204fd52d4");
	    Thread.sleep(3000);    
	    
	    driver.findElement(By.xpath("//div[@id='root']/div/div/ul/li/div/div[2]/span")).click();
	    Thread.sleep(3000);
	    driver.get("https://ethora.ethoradev.com/provenance");
	    Thread.sleep(3000);
	    System.out.println("Click on Items file Sucessfully");
	    driver.findElement(By.xpath("//div[@id='root']/div/div/ul/li/div/div[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/ul/li/div/div[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("path")).click();
	    Thread.sleep(2000);
	    
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/ul/li/div/div[2]/span")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/ul/li/div/div[2]/span")).click();
//        Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div/li/p")).click();
	    Thread.sleep(2000);
        
	    // Click on edit and close 
	    driver.get("https://ethora.ethoradev.com/profile/0xEC3C9e873A51b254a375deBC66A027d204fd52d4");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/button")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("isProfileOpen")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("isProfileOpen")).click();
	    Thread.sleep(2000);
	    
	  //*[@id="submitProfile"]
	    driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium.css-1yxmbwk > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-vubbuv > path")).click();
	    System.out.println("Click on Edit and Close Sucessfully");
	    // Click on edit and Change Description
	    driver.get("https://ethora.ethoradev.com/profile/0xEC3C9e873A51b254a375deBC66A027d204fd52d4");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit Profile'])[1]/following::div[2]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@id='submitProfile']")).click();
	    Thread.sleep(2000);
	    System.out.println("Click on edit and Change Description Sucessfully");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	     
	    try {
	    	Thread.sleep(6000);
	    	} catch (InterruptedException e ) {
	    		e.printStackTrace();
	    	}
	  //Scroll vertically down by 500 pixels
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    
	    WebElement flag=driver.findElement(By.xpath("//header/div[1]/div[1]"));
	    Thread.sleep(2000);
	    js.executeScript("arguments[0].scrollIntoView();",flag);
	    
	    //Click on Profile QR
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
	    Thread.sleep(3000);
	    //Click on Copy Button
	    driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1cb0763']//*[name()='svg']")).click();
	    Thread.sleep(3000);
	    
	    //Click on Close
	   // driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/button[1]/*[1]")).click();
	    
	    //Click on Menu tab
	    driver.findElement(By.cssSelector("path")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div/li/p")).click();
	    Thread.sleep(6000);
	    
	    //Click on Sign out
	    driver.findElement(By.cssSelector("path")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul[1]/div[5]/li[3]")).click();
	    Thread.sleep(2000);
	    
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/button")).click();
//	    //driver.findElement(By.id(":r25:")).click();
//	    driver.findElement(By.name("isProfileOpen")).click();
//	    driver.findElement(By.name("isProfileOpen")).click();
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit Profile'])[1]/following::div[3]")).click();
	    
	   
	    
//	    Thread.sleep(2000);
	 
	    System.out.println("Test Completed");
	    
	    //Capture Full page screenshot
	    //Convert webdriver object to takeScreenshot interface
	    
//	    TakeScreenshot screenshot =((TakeScreenshot)driver);
//	    
//	  //Call get screenshots method to create image file
//	    File src = screenshot.getScreenshotAs(OutputType.FILE);
//	    File dest = new File("C:\\code\\Ethora_Web\\lib\\screenshots\\fullpage.png");
//	    
//	    //Copy image file to destination 
//	    FileUtils.copyFile(src, dest);
	    
	    Thread.sleep(3000);
		
		

		//driver.close();

	}



}
