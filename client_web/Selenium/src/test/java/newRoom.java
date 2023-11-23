
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newRoom {
	
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
	    driver.findElement(By.id("email")).sendKeys("dapprosplatform@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).sendKeys("dp@pathak");
	    Thread.sleep(1000);
	    driver.findElement(By.id("submitEmail")).click();
	    
	    // Chat Room Creation
	    Thread.sleep(6000);
	    driver.get("https://ethora.ethoradev.com/chat/none");
	    Thread.sleep(6000);
	    driver.findElement(By.cssSelector("path")).click();
	    //driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div/li/p")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//body/div[@id='menu-appbar']/div[3]/ul[1]/div[2]/li[1]")).click();
	    Thread.sleep(5000);
	    

	    driver.get("https://ethora.ethoradev.com/newchat");
	    Thread.sleep(5000);
	    driver.findElement(By.id("chatName")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("chatName")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("chatName")).clear();
	    Thread.sleep(4000);
	    driver.findElement(By.id("chatName")).sendKeys("DP_Room");
	    Thread.sleep(4000);
	    driver.findElement(By.id("description")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("description")).clear();
	    Thread.sleep(4000);
	    driver.findElement(By.id("description")).sendKeys("DP_Room");
	    Thread.sleep(4000);
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create new chat'])[1]/following::*[name()='svg'][1]")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("raised-button-file")).clear();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("raised-button-file")).sendKeys("/1.jpeg");
//	    Thread.sleep(5000);
	    driver.findElement(By.id("submitChat")).click();

	    

	 
	    System.out.println("done");
	    
	    Thread.sleep(3000);
		
		

		//driver.close();

	}



}
