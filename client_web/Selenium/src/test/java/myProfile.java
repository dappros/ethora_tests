import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	    Thread.sleep(3000);
	    driver.findElement(By.id("email")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("email")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.id("email")).sendKeys("baseapp@mailinator.com");
	    Thread.sleep(3000);
	    driver.findElement(By.id("password")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("password")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys("baseapp@mailinator.com");
	    Thread.sleep(3000);
	    driver.findElement(By.id("submitEmail")).click();
	    System.out.println("Login Sucessfully");
	    
	    // My Profile
	    //driver.get("https://ethora.ethoradev.com/chat/none");
	    Thread.sleep(6000);
	    driver.findElement(By.cssSelector("path")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div/li/p")).click();
	    Thread.sleep(6000);
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
	    
	    driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium.css-1yxmbwk > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-vubbuv > path")).click();
	  
	    // Click on edit and Change Description
	    driver.get("https://ethora.ethoradev.com/profile/0xEC3C9e873A51b254a375deBC66A027d204fd52d4");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit Profile'])[1]/following::div[2]")).click();
	    Thread.sleep(2000);
	    
	    
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/button")).click();
//	    //driver.findElement(By.id(":r25:")).click();
//	    driver.findElement(By.name("isProfileOpen")).click();
//	    driver.findElement(By.name("isProfileOpen")).click();
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit Profile'])[1]/following::div[3]")).click();

	   
	    
//	    driver.findElement(By.id(":rk:")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.id(":rk:")).clear();
//	    Thread.sleep(2000);
//	    driver.findElement(By.id(":rk:")).sendKeys("atom");
//	    Thread.sleep(2000);
//	    driver.findElement(By.id(":rl:")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.id(":rl:")).clear();
//	    Thread.sleep(2000);
//	    driver.findElement(By.id(":rl:")).sendKeys("Owner");
//	    Thread.sleep(2000);
//	    driver.findElement(By.id(":rm:")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.id(":rm:")).clear();
//	    Thread.sleep(2000);
//	    driver.findElement(By.id(":rm:")).sendKeys("Description");
//	    Thread.sleep(2000);
	 
	    System.out.println("done");
	    
	    Thread.sleep(3000);
		
		

		driver.close();

	}



}
