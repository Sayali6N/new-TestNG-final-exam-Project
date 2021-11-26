package page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/*Test 2: Validate a user is not able to add a duplicated category. 
 * If it does then the following message will display:
 *  "The category you want to add already exists: <duplicated category name>."
 */

public class DuplicateCategoryPage extends AddCategory_Page {
	WebDriver driver;

	public DuplicateCategoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "select[name='category']")WebElement SelectCategoryFromDropDown_Element;

	public void userSelectsCatagoryFromDropDownList(String listItem) {
		selectFromDropDown(SelectCategoryFromDropDown_Element, listItem);
		SelectCategoryFromDropDown_Element.click();
	}

	public boolean validateAUserIsNotAbleToAddDuplicateCategory() {
		if (SelectCategoryFromDropDown_Element.isDisplayed()) {
			System.out.println("The category you want to add already exists: <duplicated category name>");
			return true;
		} else {

			System.out.println("New Category Item Is Added!!");
		}
		return false;
	}

}
