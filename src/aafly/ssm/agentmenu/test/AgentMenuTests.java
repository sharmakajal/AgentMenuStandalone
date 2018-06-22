package aafly.ssm.agentmenu.test;

import org.testng.annotations.Test;
import com.selenium.framework.BaseTest;
import aafly.ssm.agentmenu.pages.AgentMenu;
import aafly.ssm.agentmenu.pages.AgentMenuOptions;
import aafly.ssm.agentmenu.pages.TestPrintOptions;

public class AgentMenuTests extends BaseTest {

	@Test(priority = 1)
	//validate user should be able to see the label and able to click on Test print documents.
	
	public void agentMenu() throws InterruptedException{
	  
	   AgentMenu menuoption = new AgentMenu(driver);
	   menuoption.validateMenuOption(); 
	   menuoption.validateMenuOptionButtons();
  
	   }
	
	@Test(priority = 2)
	
	//Click on the Machine Out of Service Button
	public void agentMenuOption() throws InterruptedException{
	
	AgentMenuOptions menubuttons = new AgentMenuOptions(driver);
	menubuttons.validateOutOfServiceBtn();
	menubuttons.validateMilitaryModeBtn();
	menubuttons.validateDeviceGraphicBtn();
	menubuttons.validateTurnBEBtn();
	menubuttons.validateTurnIROPBtn();
	menubuttons.validateLookUpNameBtn();
	menubuttons.validateBagtagPrinterBtn();
	menubuttons.validateTestPassportReaderBtn();
	menubuttons.validateTouchScreenBtn();
	menubuttons.validateTestInddicatorBtn();
	menubuttons.validateReprintBagtagBtn();
	menubuttons.validateKeypadBtn();
	
	TestPrintOptions print = new TestPrintOptions(driver);
	print.validateTestPrintDoc();
	print.testprintButtons();
	print.validateboardingPassBtn();
	print.validatewifiboardingPassBtn();
	print.validatepriorityCardBtn();
	print.validatewifiPriorityCardBtn();
	print.validatebaggageReceiptBtn();
	print.validatemiscSalesReceiptBtn();
	print.validateticketReceiptBtn();
	print.validateupgradeReceiptBtn();
	print.validateinfoCardBtn();
	print.validateoneDayPassBtn();
	print.validateitineraryBtn();
	print.validateitineraryBtn();
	print.validaterefundReceiptBtn();
	print.validatebonusMilesBtn();
	print.validatebaggageCouponBtn();
	print.validateprintBagtagBtn();
//	print.validateJustaMoment(); 
	
}	
}
