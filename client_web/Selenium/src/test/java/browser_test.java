import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class browser_test {

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
		
		
	    // 3 | click | xpath = div[@id='root']/div/div/div/div/button[3] | 	    
		
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/button[3]")).click();
	    driver.findElement(By.id(":r4:")).click();
	    driver.findElement(By.id(":r4:")).clear();
	    driver.findElement(By.id(":r4:")).sendKeys("baseapp@mailinator.com");
	    driver.findElement(By.name("password")).click();
	    
	  
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("baseapp@mailinator.com");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//	    driver.get("https://ethora.ethoradev.com/chat/none");
//	    driver.findElement(By.cssSelector("path")).click();
//	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div/li/p")).click();
//	    driver.get("https://ethora.ethoradev.com/profile/0xEC3C9e873A51b254a375deBC66A027d204fd52d4");
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/ul/li/div/div[2]/span")).click();
//	    driver.get("https://ethora.ethoradev.com/provenance");
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/ul/li/div/div[2]/p")).click();
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/ul/li/div/div[2]/p")).click();
//	    driver.findElement(By.xpath("//img[@alt='image1']")).click();
//	    driver.findElement(By.cssSelector("path")).click();
//	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div/li/p")).click();
//	    driver.get("https://ethora.ethoradev.com/profile/0xEC3C9e873A51b254a375deBC66A027d204fd52d4");
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/ul/li/div/div[2]/span")).click();
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/ul/li/div/div[2]/span")).click();
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='atom Owner'])[1]/preceding::*[name()='svg'][4]")).click();
//	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div[2]/li/p")).click();
//	    driver.get("https://ethora.ethoradev.com/chat/none");
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='testtesttesttest'])[1]/preceding::*[name()='svg'][6]")).click();
//	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div[2]/li[2]/p")).click();
//	    driver.get("https://ethora.ethoradev.com/newchat");
//	    driver.findElement(By.id(":rf:")).click();
//	    driver.findElement(By.id(":rf:")).clear();
//	    driver.findElement(By.id(":rf:")).sendKeys("Testersss");
//	    driver.findElement(By.id(":rg:")).click();
//	    driver.findElement(By.id(":rg:")).clear();
//	    driver.findElement(By.id(":rg:")).sendKeys("Testerss");
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[3]/button")).click();
//	    driver.get("https://ethora.ethoradev.com/chat/d5a107d9ff3892558278d8fa0da052e8fa1bb8a876c72052ddc074a2b0053ab8");
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/div[2]/div/ul/li/div/div[2]/div[2]/div")).click();
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div/div[2]")).click();
//	    driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium.css-burlrh > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-vubbuv > path")).click();
//	    driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeInherit.css-1cw4hi4 > path")).click();
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div[2]/div")).click();
//	    driver.get("https://ethora.ethoradev.com/chatDetails/d5a107d9ff3892558278d8fa0da052e8fa1bb8a876c72052ddc074a2b0053ab8@conference.dev.dxmpp.com");
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Members (1)'])[1]/preceding::*[name()='svg'][5]")).click();
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Members (1)'])[1]/preceding::*[name()='svg'][2]")).click();
//	    driver.findElement(By.id("outlined-basic")).click();
//	    driver.findElement(By.id("outlined-basic")).clear();
//	    driver.findElement(By.id("outlined-basic")).sendKeys("TEsters");
//	    driver.findElement(By.id("modal-modal-description")).click();
//	    driver.findElement(By.cssSelector("div.MuiContainer-root.MuiContainer-maxWidthLg.css-1qsxih2 > button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium.css-1yxmbwk > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeSmall.css-1k33q06 > path")).click();
//	    driver.findElement(By.id("outlined-basic")).click();
//	    driver.findElement(By.id("outlined-basic")).clear();
//	    driver.findElement(By.id("outlined-basic")).sendKeys("Testerssss");
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Enter new info here'])[2]/following::button[1]")).click();
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Members (1)'])[1]/preceding::*[name()='svg'][8]")).click();
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Members (1)'])[1]/preceding::*[name()='svg'][7]")).click();
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Members (1)'])[1]/preceding::*[name()='svg'][9]")).click();
//	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div[2]/li/p")).click();
//	    driver.get("https://ethora.ethoradev.com/chat/d5a107d9ff3892558278d8fa0da052e8fa1bb8a876c72052ddc074a2b0053ab8");
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='testtesttesttest'])[1]/preceding::*[name()='svg'][6]")).click();
//	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div")).click();
//	    driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium.css-t5hogr > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-vubbuv > path")).click();
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/div[2]/div/ul/li[2]/div/div[2]/div[2]/div")).click();
//	    driver.get("https://ethora.ethoradev.com/chat/974add7ad347cd39b5fff2c16939003a27ce74f038cdc9884c03575e28078394");
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Wednesday, 27 September 2023'])[1]/following::*[name()='svg'][1]")).click();
//	    driver.findElement(By.xpath("//div/div/div[2]/div/img")).click();
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::div[14]")).click();
//	    driver.findElement(By.xpath("//div[@id='root']/div/header/div")).click();
//	    driver.findElement(By.cssSelector("path")).click();
//	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div[3]/li")).click();
//	    driver.get("https://ethora.ethoradev.com/mint");
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/div/button")).click();
//	    driver.findElement(By.xpath("//input[@type='file']")).clear();
//	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\fakepath\\Screenshot_2023-09-20_161056-removebg-preview.png");
//	    driver.findElement(By.id(":rs:")).click();
//	    driver.findElement(By.id(":rs:")).clear();
//	    driver.findElement(By.id(":rs:")).sendKeys("IDS Denmed");
//	    driver.findElement(By.id("uncontrolled-native")).click();
//	    new Select(driver.findElement(By.id("uncontrolled-native"))).selectByVisibleText("3");
//	    driver.findElement(By.id(":rt:")).click();
//	    driver.findElement(By.cssSelector("path")).click();
//	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div[3]/li")).click();
//	    driver.findElement(By.cssSelector("path")).click();
//	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div[2]/li/p")).click();
//	    driver.get("https://ethora.ethoradev.com/chat/974add7ad347cd39b5fff2c16939003a27ce74f038cdc9884c03575e28078394");
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='TEsters'])[1]/preceding::*[name()='svg'][6]")).click();
//	    driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div[3]/li")).click();
//	    driver.get("https://ethora.ethoradev.com/mint");
//	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/div/button")).click();
//	    driver.findElement(By.xpath("//input[@type='file']")).clear();
//	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\fakepath\\Screenshot_2023-09-20_161056-removebg-preview.png");
//	    driver.findElement(By.id(":r12:")).click();
//	    driver.findElement(By.id(":r12:")).clear();
//	    driver.findElement(By.id(":r12:")).sendKeys("IDS D");
//	    driver.findElement(By.id("uncontrolled-native")).click();
//	    new Select(driver.findElement(By.id("uncontrolled-native"))).selectByVisibleText("3");
//	    driver.findElement(By.id(":r13:")).click();
//	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='upload image'])[1]/preceding::*[name()='svg'][4]")).click();
//	    //driver.findElement(By.xpath("//div[@id='menu-appbar']/div[3]/ul/div[2]/li/p")).click();
	    
	    Thread.sleep(1000);
		
		

		//driver.close();

	}



}
