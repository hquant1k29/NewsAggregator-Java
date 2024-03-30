package crawlers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookCrawler {
	
	private WebDriver driver;
	private final String USER_AGENT_PERSON = "user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36";
	
	public FacebookCrawler() {
		// replace by path to your chromedriver.exe in your computer
        System.setProperty("webdriver.chrome.driver",
                "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(USER_AGENT_PERSON);
        driver = new ChromeDriver(options);
	}
	
	 public void login(String username, String password) {
	        try {
	            driver.get("https://www.facebook.com/search/posts/?q=blockchainnews");

	            Thread.sleep(4000);

	            WebElement usernameInput = driver.findElement(By.name("email"));
	            usernameInput.sendKeys(username);	

	            WebElement passwordInput = driver.findElement(By.name("pass"));
	            passwordInput.sendKeys(password);

	            WebElement loginButton = driver.findElement(By.id("loginbutton"));
	            loginButton.click();
	            
	            Thread.sleep(5000);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	private void scrollDown(WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	
	public void run() {
		FacebookCrawler crawler = new FacebookCrawler();
        
		String username = "phuongtroc2004@gmail.com";
		String password = ":BNHagnN.nhpqm9";	
		
//		String username = "ahqn28@gmail.com";
//		String password = "Anhquan36";
//		
//		String username = "quant1k29@gmail.com";
//		String password = "Quan@2201";
        crawler.login(username, password);
        
        // back
        
	}
}