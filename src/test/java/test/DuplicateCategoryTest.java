package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategory_Page;
import page.DuplicateCategoryPage;
import util.BrowserFactory;

@Test
public class DuplicateCategoryTest {

	WebDriver driver;
	DuplicateCategoryPage duplicateCategory;
	
	public void testDuplicateCategory() {
		driver = BrowserFactory.init();
		duplicateCategory=PageFactory.initElements(driver, DuplicateCategoryPage.class);
		
		duplicateCategory.userSelectsCatagoryFromDropDownList("new job");
		
		duplicateCategory.validateAUserIsNotAbleToAddDuplicateCategory();
		
		BrowserFactory.tearDown();
	}
}
