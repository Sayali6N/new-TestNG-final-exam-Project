package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategory_Page;
import page.MonthDropDownValidation_Page;
import util.BrowserFactory;

public class MonthDropDownHasAllMonths_Test {

	WebDriver driver;
	AddCategory_Page addCategory;
	MonthDropDownValidation_Page validateMonths;

	@Test
	public void testMonthDropDown() {

		driver = BrowserFactory.init();
		addCategory = PageFactory.initElements(driver, AddCategory_Page.class);
		validateMonths = PageFactory.initElements(driver, MonthDropDownValidation_Page.class);
		
		validateMonths.userselectsMonthFromDropDown("Jun");
		
		validateMonths.monthDropDownHasAllMonths_Validation();
		
		BrowserFactory.tearDown();
	}

}
