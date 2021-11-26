package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MonthDropDownValidation_Page extends AddCategory_Page {

	WebDriver driver;

	public MonthDropDownValidation_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "select[name='due_month']")WebElement MonthDropDown_Element;

	public void userselectsMonthFromDropDown(String MonthNames) {
		selectFromDropDown(MonthDropDown_Element, MonthNames);
	}

	public void monthDropDownHasAllMonths_Validation() {
		String[] monthArray = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		Select selectMonth = new Select(MonthDropDown_Element);
		List<WebElement> options = selectMonth.getOptions();

		for (WebElement we : options) {

			for (int i = 0; i < monthArray.length; i++) {
				if (we.getText().equals(monthArray[i])) {
					System.out.println("Matched");
					break;

				}
			}
		}

	}

}
