
import java.util.Random;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;


public class doc_create {
	
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
	//for letters
	public String generateRandomString(int length){
	    return RandomStringUtils.randomAlphabetic(length);
	} 

	//for numbers
	public String generateRandomNumber(int length){
	    return RandomStringUtils.randomNumeric(length);
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

	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div[3]/li[2]/p")).click();
	    Thread.sleep(2000);
	    driver.get("https://ethora.ethoradev.com/documents/upload");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("uploadFile")).click();
	    System.out.println("Click on Upload file");
	    Thread.sleep(2000);
	    
	    // Need to Change the path as per system
	    Runtime.getRuntime().exec("C://Users//bikas//OneDrive//Desktop//upload.exe" + " " + "C:\\Users\\bikas\\OneDrive\\Desktop\\1.jpeg");
	    Thread.sleep(4000);
	    
	    System.out.println("File is Uploaded Successfully");
	    
	    driver.findElement(By.id("documentName")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("documentName")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.id("documentName")).sendKeys("token new");
	    System.out.println("Document name Uploaded");
	    Thread.sleep(2000);
	    driver.findElement(By.id("submitUpload")).click();
	    System.out.println("Click on Create");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("path")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//body/div[@id='menu-appbar']/div[3]/ul[1]/div[1]/li[1]")).click();
	    Thread.sleep(2000);

	    
 
	 
	    System.out.println("done");
	    
	    Thread.sleep(3000);
		
		

		//driver.close();

	}



}
