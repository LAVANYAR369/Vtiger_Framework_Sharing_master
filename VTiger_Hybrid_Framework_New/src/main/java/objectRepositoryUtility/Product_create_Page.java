package objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_create_Page {

	WebDriver driver = null;

	public Product_create_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstname")
	private WebElement firstnameTextfeild;

	@FindBy(name = "lastname")
	private WebElement lastnameTextfeild;


	
}
