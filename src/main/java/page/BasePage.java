package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static int randomNumber(int boundaryNumber) {
		Random rnd = new Random();
		int generatedNo = rnd.nextInt(boundaryNumber);
		return generatedNo;
	}
	
	public static String generateRandomString(String aToZ) {
	    Random rand=new Random();
	    StringBuilder randomString=new StringBuilder();
	    for (int i = 0; i < 20; i++) {
	       int randIndex=rand.nextInt(aToZ.length()); 
	       randomString.append(aToZ.charAt(randIndex));            
	    }
	    return randomString.toString();
	}
	
	public void selectFromDropDown(WebElement dropDownElement, String visiableText) {
		Select select = new Select(dropDownElement);
		select.selectByVisibleText(visiableText);
	}
	
}
