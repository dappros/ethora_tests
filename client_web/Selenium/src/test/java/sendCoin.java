import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendCoin {

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
		Thread.sleep(1000);
		//driver.manage().window().setSize(new Dimension(1051, 933));
   
		driver.get("https://ethora.ethoradev.com/signIn");
		Thread.sleep(1000);
	    driver.findElement(By.id("regularLogin")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("email")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("email")).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id("email")).sendKeys("baseapp@mailinator.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).sendKeys("baseapp@mailinator.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("submitEmail")).click();
	    System.out.println("Login Sucessfully");
	
	    Thread.sleep(4000);
	    driver.get("https://ethora.ethoradev.com/chat/none");
	    Thread.sleep(6000);
	    System.out.println("Chat loaded Sucessfully");
  
	    driver.get("https://ethora.ethoradev.com/chat/d5a107d9ff3892558278d8fa0da052e8fa1bb8a876c72052ddc074a2b0053ab8");
	    Thread.sleep(4000);
	    System.out.println("Profile loaded sucessfully");
	    
	    driver.findElement(By.xpath("//button[@id='official']")).click();
	    System.out.println("Click on Offical tab sucessfully");
	    Thread.sleep(6000);
	    
	    
	    
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Testersss'])[1]/preceding::*[name()='svg'][5]")).click();
	    Thread.sleep(6000);
	    
	    driver.get("https://ethora.ethoradev.com/chat/d5a107d9ff3892558278d8fa0da052e8fa1bb8a876c72052ddc074a2b0053ab8");
	    Thread.sleep(12000);
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[34]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
	   
	     Thread.sleep(6000);
	    System.out.println("Click on Three Dot sucessfully");
	    driver.findElement(By.xpath("//img[@alt='coin']")).click();
	    Thread.sleep(6000);
	    System.out.println("Click on Coin successfully");
	    
	    
		//driver.close();

	}
	


}
