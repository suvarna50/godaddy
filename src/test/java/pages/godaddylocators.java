package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class godaddylocators extends godaddybase {
	public godaddylocators() {
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath = "(//li[@class='menu fmenu'])[1]")
	private WebElement domain;

	@FindBy(xpath = "//a[text()='Domain Name Search']")
	private WebElement firstsubmenu;
	
	@FindBy(xpath= "(//*[@class='logo-mark'])[1]")
	private WebElement logo;
	
	
	

	

	public WebElement getDomain() {
		return domain;
	}

	public WebElement getFirstsubmenu() {
		return firstsubmenu;
	}

	public WebElement getLogo() {
		return logo;
	}
}