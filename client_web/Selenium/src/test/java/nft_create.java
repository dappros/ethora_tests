
import java.util.Random;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nft_create {
	
	static String uuid = UUID.randomUUID().toString(); 
    

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
		//driver.manage().window().setSize(new Dimension(1051, 933));
		
		
	    // Login    
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
	    
	    // Chat Room Creation
	    Thread.sleep(6000);
	    driver.get("https://ethora.ethoradev.com/chat/none");
	    Thread.sleep(6000);
	    driver.findElement(By.cssSelector("path")).click();
	    //driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div/li/p")).click();
	    Thread.sleep(2000);

    
	    driver.get("https://ethora.ethoradev.com/mint");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='upload image'])[1]/preceding::*[name()='svg'][4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div[3]/li/p")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("C://Users//bikas//OneDrive//Desktop//upload.exe" + " " + "C:\\Users\\bikas\\OneDrive\\Desktop\\1.jpeg");
	    Thread.sleep(4000);
//	    driver.findElement(By.xpath("//input[@id=':r9:']")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//input[@id=':r9:']")).clear();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//input[@id=':r9:']")).sendKeys("tokennew");
//	    Thread.sleep(2000);
	    driver.findElement(By.id("uncontrolled-native")).click();
	    new Select(driver.findElement(By.id("uncontrolled-native"))).selectByVisibleText("2");
	    driver.findElement(By.id(":ra:")).click();
	    

	 
	    System.out.println("done");
	    
	    Thread.sleep(3000);
		
		

		driver.close();

	}



}
