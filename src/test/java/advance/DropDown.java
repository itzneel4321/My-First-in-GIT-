package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
              
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select sel = new Select(dropdown);
		
		//Different ways to select from Dropdown -Select by index 
		//Select by visible text or
		//Select by Value
		
		
		//sel.selectByVisibleText("Option 2");
		//sel.selectByIndex(2);
		sel.selectByValue("1");
		
		//driver.close();
	}

}
