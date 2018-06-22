package aafly.ssm.agentmenu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.selenium.framework.CustomWait;
import com.selenium.framework.FrameworkUtility;

public class AgentAuthentication_Login extends FrameworkUtility {

	// Declaration of Variables

	@FindBy(xpath = "//")
	public WebElement lblTouchtoType;

	@FindBy(id = "aaLogo")
	public WebElement lblAmericanlogo;

	@FindBy(id = "locTime")
	public WebElement lblLocaltime;

	//@FindBy(id = "btnStartover")
	@FindBy(xpath="//div[@class='cell large-8 right']/button[@class='button ghost-grey']")
	public WebElement startoverBtn;

	// Menu Access Screen text

	@FindBy(xpath = "//div[contains(@class,'container')]/h1")
	public WebElement lblMenuAccess;

	@FindBy(id = "agentPassword")
	public WebElement editMenuCode;

	// @FindBy(id="btnContinue")
	@FindBy(xpath = "//div[@class='right']/button[@class='button']")
	public WebElement continueBtn;

	// @FindBy(id="btnBack")
	@FindBy(xpath = "//div[@class='right']/button[@class='button secondary']")
	public WebElement backBtn;

	
	// Initialization

	public AgentAuthentication_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Validate "We are glad to see you here" Screen

	public void validateTouchtoType() {
		if (lblTouchtoType.isDisplayed()) {
			System.out.println(lblTouchtoType.getText() + " : - Page Loaded Successfully");
		} else {
			System.out.println(lblTouchtoType.getText() + " : - Page not Loaded Successfully");
			Assert.fail();
		}
	}

	// Validate and Click on the American Airline logo on the Touch To Type

	public void validateAmericanAirlineLogo() {
		if (lblAmericanlogo.isDisplayed()) {
			System.out.println(lblAmericanlogo.getText() + " : - American Airline Logo displayed Successfully");
			doubleClick(lblAmericanlogo);
		} else {
			System.out.println(lblAmericanlogo.getText() + " : - American Airline Logo not displayed Successfully");
			Assert.fail();
		}
	}

	// Validate the Menu Access Label

	public void validateMenuAccessLabel() {
		if (lblMenuAccess.isDisplayed()) {
			System.out.println(lblMenuAccess.getText() + " :- Menu Access Label displayed Successfully");
		} else {
			System.out.println(lblMenuAccess.getText() + " :- Menu Access Label not displayed Successfully");
			Assert.fail();
		}
	}

 //Validate Start Over Button
	
	public void validateStartoverBtn() {
		if (startoverBtn.isEnabled()) 
		{
			clickElement(startoverBtn);
			System.out.println("StartOver Button is clicked successfully");
		}
		else {
			System.out.println("StartOver is not clicked successfully");
		}

	}
	

	// Enter Menu Access Code and Click on Back Button 
	
	public void validateBackBtn() {
		// Check the size of menu access label , if it is not null then enter
		// AA001 in Edit Field
		if (lblMenuAccess.getSize() != null) {
			enterText(editMenuCode, "AA001");
			clickElement(backBtn);
			System.out.println("Back Button is clicked successfully");

		}

		else {
			System.out.println("Back Button is not clicked successfully");
		}

	}
	
	
	
	// Enter Menu Access Code and Click on Continue Button

	public void enterMenuCode() throws InterruptedException {
		// Check the size of menu access label , if it is not null then enter AA001 in Edit Field
		if (lblMenuAccess.getSize() != null) {
			enterText(editMenuCode, "AA001");
			CustomWait con_back = new CustomWait();
			con_back.forElementVisibility(continueBtn);
			clickElement(continueBtn);
			System.out.println("Menu access screen is displayed, Continue Button is visible and clicked");
		}

		else {
			System.out.println("Menu access screen is not displayed successfully");
		}

	}


	
}