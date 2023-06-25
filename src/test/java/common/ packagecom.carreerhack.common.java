

import java.util.cocurrent.TimeUnit;
import org.oprnqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBase {

public WebDriver driver;
 
 public void launchBrowser() {
 
 WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
 
 driver.get("https://www.google.com");
 driver.manage().window().maximize();
 
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
 }
 public void closeBrowser(){
 
 driver.close();
 }
 