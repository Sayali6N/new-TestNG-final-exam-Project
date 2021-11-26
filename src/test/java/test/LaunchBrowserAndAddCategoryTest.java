package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCategory_Page;

import util.BrowserFactory;

public class LaunchBrowserAndAddCategoryTest {

	WebDriver driver;
	AddCategory_Page addCategory;
	

	@Test
	public void testlaunchBrowserandAddCategory() {

		driver = BrowserFactory.init();
		addCategory=PageFactory.initElements(driver, AddCategory_Page.class);
		
		
		addCategory.userAddCategoryDataOnTextBox("flower");
		addCategory.userClickSubmitButton();
		
		addCategory.validateAUserIsAbleToAddNewCategory();
		
		BrowserFactory.tearDown();

	}
}