import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendMessage {

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
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Testersss'])[1]/preceding::*[name()='svg'][5]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/div[2]/div/ul/li/div/div[2]/div")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div/div[2]/div/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div/div[2]/div/div")).sendKeys("Hello I am Bot");
	    //ERROR: Caught exception [unknown command [editContent]]
	    Thread.sleep(4000);
	    System.out.println("Message Sent to textbox sucessfully");
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button[1]")).click();

	    
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Wednesday, 11 October 2023'])[1]/following::*[name()='svg'][1]")).click();
//	    Thread.sleep(4000);
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::button[1]")).click();
	    Thread.sleep(4000);
	    
	    
//	    driver.findElement(By.id("file")).clear();
//	    Thread.sleep(4000);
//	    driver.findElement(By.id("file")).sendKeys("C:\\fakepath\\pinterestdownloader.com-1697002512.988053.jpg");
//	    Thread.sleep(4000);

		//driver.close();

	}



}
