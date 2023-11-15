import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Message_Reply {

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
	    Thread.sleep(8000);
	    System.out.println("Chat loaded Sucessfully");
  
	    driver.get("https://ethora.ethoradev.com/chat/d5a107d9ff3892558278d8fa0da052e8fa1bb8a876c72052ddc074a2b0053ab8");
	    Thread.sleep(8000);
	    System.out.println("Profile loaded sucessfully");
	    
	    driver.findElement(By.xpath("//button[@id='official']")).click();
	    System.out.println("Click on Offical tab sucessfully");
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Testersss'])[1]/preceding::*[name()='svg'][5]")).click();
	    Thread.sleep(4000);
	    
	    
	    //Send Message
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/div[2]/div/ul/li/div/div[2]/div")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div/div[2]/div/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div/div[2]/div/div")).sendKeys("Hello I am Alexa");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button[1]")).click();
	    Thread.sleep(4000);
	    System.out.println("Message Sent to textbox sucessfully");
	    
	    //Click on three Dot
//	    driver.findElement(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[22]")).click();
//	    Thread.sleep(2000);
//	    driver.switchTo().frame(0);
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//div[@class='MuiDialogContent-root css-1ty026z']"));
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//button[normalize-space()='Reply']")).click();
//	    Thread.sleep(2000);
	    
	    
 //####################################################################
	    
	    List<WebElement> elms = driver.findElements(By.xpath("//button[@id='long-button']"));
	    int lastelmIndex = elms.size();
	    elms.get(lastelmIndex-1).click();
	    
	///################################################################################
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//body/div[3]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
	    System.out.println("Click on Reply sucessfully");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]")).click();
	    Thread.sleep(4000);
	    
	    
	    //###############################################
	   // (//div[@data-placeholder="Type message here"])[2]
	    
//	    driver.findElements(By.xpath("//div[@data-placeholder=\"Type message here\"")).get(2).sendKeys("QA Tester");
//	    Thread.sleep(4000);
//	    System.out.println("Message Sent to textbox sucessfully");
	    
	    driver.findElement(By.xpath("//div[@is='MessageInput']//div//div[@class='cs-message-input']//div[@class='cs-message-input__content-editor']")).sendKeys("QA Tester");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@is='MessageInput']//div//div[@class='cs-message-input']//button[@class='cs-button cs-button--send']")).click();
	    Thread.sleep(4000);
	    //##########################################################################################
	    
        //####################################################################
	    
	    List<WebElement> elms1 = driver.findElements(By.xpath("//button[@id='long-button']"));
	    int lastelmIndex1 = elms1.size();
	    elms1.get(lastelmIndex1-1).click();
	    
	    //################################################################################
	    Thread.sleep(2000);
	    
	    //click on edit
	    driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/div[1]/button[2]")).click();
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div/div[2]/div/div")).sendKeys("Hello I am Bot");
	    
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[3]/button[1]")).click();
	
	 //  driver.findElement(By.id("file")).clear();
//	    Thread.sleep(4000);
//	    driver.findElement(By.id("file")).sendKeys("C:\\fakepath\\pinterestdownloader.com-1697002512.988053.jpg");
//	    Thread.sleep(4000);

		driver.close();

	}



}
