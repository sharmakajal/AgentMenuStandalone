package aafly.ssm.agentmenu.test;

import org.testng.annotations.Test;
import com.selenium.framework.BaseTest;
import aafly.ssm.agentmenu.pages.AgentAuthentication_Login;
import aafly.ssm.agentmenu.pages.AgentMenu;
import aafly.ssm.agentmenu.pages.TestPrintOptions;

public class AgentAuthenticationLoginTests extends BaseTest {

	// validate user should able to launch Flex Page and Agent Menu Screen
	// Click on American Airline Logo

	@Test(priority = 1)

	   public void agentMenuContinueBtn() throws InterruptedException {
		AgentAuthentication_Login agentContinue = new AgentAuthentication_Login(driver);
		agentContinue.validateMenuAccessLabel(); 
		agentContinue.enterMenuCode();
		Thread.sleep(3000);
		
		
		 AgentMenu menuoption = new AgentMenu(driver);
		 menuoption.validateMenuOption(); 
		
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
		   driver.close();

	}
}
