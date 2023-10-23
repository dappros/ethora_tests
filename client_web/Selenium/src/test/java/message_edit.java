import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class message_edit {

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
	    Thread.sleep(9000);
	    System.out.println("Profile loaded sucessfully");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Testersss'])[1]/preceding::*[name()='svg'][5]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/div[2]/div/ul/li/div/div[2]/div")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div/div[2]/div/div")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div/div[2]/div/div")).sendKeys("Hello I am Alexa");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button[1]")).click();
	    Thread.sleep(4000);
	    System.out.println("Message sent sucessfully");
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[6]/section[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[7]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	    Thread.sleep(2000);
	    
	   // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hello I am Alexa'])[3]/following::*[name()='svg'][1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Reply'])[1]/following::button[1]")).click();
	    Thread.sleep(2000);
	    
	    //driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/div[1]/button[2]")).click();
	    System.out.println("Click on Edit sucessfully");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div/div[2]/div/div")).sendKeys("Hello Edited Message");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[3]/button[1]")).click();
	    Thread.sleep(4000);
	    System.out.println("Click on Submit Icon Sucessfully");
	    
	    
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hello I am Alexa'])[4]/following::*[name()='svg'][1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::button[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Delete message'])[1]/following::button[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("section.cs-message.cs-message--outgoing.cs-message--avatar-spacer.cs-message--single.cs-message--avatar-tr > div.cs-message__content-wrapper > div.cs-message__content > div.cs-message__custom-content > div.MuiBox-root.css-ojqyia > #long-button > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-vubbuv > path")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::button[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
	    Thread.sleep(4000);

		driver.close();

	}



}
