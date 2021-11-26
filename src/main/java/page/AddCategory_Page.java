package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCategory_Page extends BasePage {
	WebDriver driver;

	public AddCategory_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='categorydata']")WebElement AddCategoryData_Element;

	@FindBy(how = How.CSS, using = "input[name='submit'][value='Add category']")WebElement ClickSubmitButton_Element;

	public void userAddCategoryDataOnTextBox(String NewItem) {
		AddCategoryData_Element.sendKeys(NewItem + randomNumber(50));
	}

	public void userClickSubmitButton() {
		ClickSubmitButton_Element.click();
	}

	public boolean validateAUserIsAbleToAddNewCategory() {
		if (AddCategoryData_Element.isDisplayed()) {
			System.out.println("New Category Item Is Added!!");
			return true;
		} else {
			System.out.println("The category you want to add already exists: <duplicated category name>");
		}
		return false;
	}

}
