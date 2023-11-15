import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chat {

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
	    driver.findElement(By.id("email")).sendKeys("dapprosplatform@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).sendKeys("dp@pathak");
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
	    //group tab
	    driver.findElement(By.xpath("//button[@id='private']")).click();
	    System.out.println("Click on Group tab sucessfully");
	    Thread.sleep(6000);
	    
	    // Offical tab
	    driver.findElement(By.xpath("//button[@id='official']")).click();
	    System.out.println("Click on Offical tab sucessfully");
	    Thread.sleep(6000);
	    
	    //Click on Group chat
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Testersss'])[1]/preceding::*[name()='svg'][5]")).click();
	    Thread.sleep(6000);
	    
	    // Refresh Profile
//	    driver.get("https://ethora.ethoradev.com/chat/d5a107d9ff3892558278d8fa0da052e8fa1bb8a876c72052ddc074a2b0053ab8");
//	    Thread.sleep(12000);
	    
	    
//	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[34]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
//	    Thread.sleep(6000);
//	    System.out.println("Click on Three Dot sucessfully");
	    
	    
	    //####################################################################
	    
	    List<WebElement> elms = driver.findElements(By.xpath("//button[@id='long-button']"));
	    int lastelmIndex = elms.size();
	    elms.get(lastelmIndex-1).click();
	    
	///################################################################################
	    
	    
	    
	    driver.findElement(By.xpath("//img[@alt='coin']")).click();
	    Thread.sleep(6000);
	    System.out.println("Click on Coin successfully");
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[34]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(6000);
		System.out.println("Click on Three Dot successfully");
	    
	    driver.findElement(By.xpath("//body/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
	    Thread.sleep(6000);
	    System.out.println("Click on Direct Message successfully");
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]")).click();
	    Thread.sleep(4000);
	    System.out.println("Click on Textbox successfully");
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]")).sendKeys("Hello, DM");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='cs-button cs-button--send']")).click();
	    Thread.sleep(4000);
	    System.out.println("Message Sent to textbox successfully");
	    Thread.sleep(6000);
	    
//	 // Offical tab
	    driver.findElement(By.xpath("//button[@id='official']")).click();
	    System.out.println("Click on Offical tab successfully");
	    Thread.sleep(6000);
	    
	  //Click on Group chat
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Testersss'])[1]/preceding::*[name()='svg'][5]")).click();
	    Thread.sleep(6000);
	   
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[34]/section[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
	    Thread.sleep(8000);
	    System.out.println("Click on Three Dot successfully");
	    
	    driver.findElement(By.xpath("//body/div[3]/div[3]/div[1]/div[1]/div[1]/button[2]")).click();
	    Thread.sleep(3000);
	    System.out.println("Click on Reply successfully");
	    	    
	    driver.findElement(By.xpath("//input[@aria-label='controlled']")).click();
	    Thread.sleep(4000);
	    System.out.println("Click on CheckBox 1 successfully");
	    
	    driver.findElement(By.xpath("//input[@aria-label='controlled']")).click();
	    Thread.sleep(4000);
	    System.out.println("Click on CheckBox 2 sucessfully");
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]")).click();
	    Thread.sleep(6000);
	    System.out.println("Click on Textbox successfully");
	    
	    
//	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]")).sendKeys("Reply New Message");
//	    Thread.sleep(6000);
//	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[3]/button[1]")).click();
//	    Thread.sleep(2000);
//        System.out.println("Send Message successfully");
	    
	    driver.findElement(By.xpath("//div[@is='MessageInput']//div//div[@class='cs-message-input']//button[@class='cs-button cs-button--send']//*[name()='svg']")).click();
	    Thread.sleep(4000);
	    System.out.println("Click on Sent successfully");
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/section[1]/button[1]")).click();
	    
	    driver.findElement(By.xpath("//section[@class='cs-conversation-header__actions']//button[1]")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/button[1]")).click();
	  
	    
		//driver.close();

	}
	


}
