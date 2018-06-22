package aafly.ssm.agentmenu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.framework.FrameworkUtility;

public class AgentMenuOptions extends FrameworkUtility {

	
	//Declaration of variables
	
   @FindBy(xpath="//div[@class='cell large-4']/button[@class='ssmButtonSelect b1']")
   public WebElement outServiceBtn;

   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b2']")
   public WebElement bagtagPrinterBtn;
   
   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b4']")
   public WebElement passportReaderBtn;
   
   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b5']")
   public WebElement callibrateTouchBtn;
   
   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b6']")
   public WebElement militaryModeBtn;
   
   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b7']")
   public WebElement deviceGraphicsBtn;
   
   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b8']")
   public WebElement indicatorLightBtn;
   
   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b9']")
   public WebElement reprintBagtagBtn;
   
   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b10']")
   public WebElement keypadBtn;
   
   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b11']")
   public WebElement turnIROPBtn;
   
   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b12']")
   public WebElement agentAssistBEBtn;
   
   @FindBy(xpath = "//div[@class='cell large-4']/button[@class='ssmButtonSelect b13']")
   public WebElement lookNameBtn;

  
	//Initialization
	
	public AgentMenuOptions(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 

	//validate Take Machine Out of Service Button Functionality
	
	public void validateOutOfServiceBtn(){
		
		if(outServiceBtn.isEnabled()){
			
			System.out.println(outServiceBtn.getText()+" : - Machine Out of Service button is displayed successfully");
			clickElement(outServiceBtn);	
			System.out.println("Machine Out of Service button is clicked successfully");
	}
		else
			{
				System.out.println(outServiceBtn.getText()+"  : - Machine Out of Service button is not displayed successfully");
			}
				}
		
	//validate Bagtag Printer functionality
	
 public void validateBagtagPrinterBtn(){
		
		if(bagtagPrinterBtn.isEnabled()){
			
			System.out.println(bagtagPrinterBtn.getText()+" : - BagTag Printer button is displayed successfully");
			clickElement(bagtagPrinterBtn);	
			System.out.println("BagTag Printer button is clicked successfully");
	}
		else
			{
				System.out.println(bagtagPrinterBtn.getText()+"  : - BagTag Printer button is not displayed successfully");
				
			}
				}
		
	//validate Test Passport Reader functionality
 
 	public void validateTestPassportReaderBtn(){
		
		if(passportReaderBtn.isEnabled()){
			
			System.out.println(passportReaderBtn.getText()+" : - Test Passport Reader button is displayed successfully");
			clickElement(passportReaderBtn);	
			System.out.println("Test Passport Reader button is clicked successfully");
	}
		else
			{
				System.out.println(passportReaderBtn.getText()+"  : - Test Passport Reader button is not displayed successfully");
				
			}
				}


   //validate Calibrate Touch Screen functionality
 	
 		public void validateTouchScreenBtn(){
		
		if(callibrateTouchBtn.isEnabled()){
			
			System.out.println(callibrateTouchBtn.getText()+" : - Calibrate Touch Screen button is displayed successfully");
			clickElement(callibrateTouchBtn);	
			System.out.println("Calibrate Touch Screen button is clicked successfully");
	}
		else
			{
				System.out.println(callibrateTouchBtn.getText()+"  : - Calibrate Touch Screen button is not displayed successfully");
				
			}
				}
 	
  //validate Turn On Military Mode functionality
 		
 		public void validateMilitaryModeBtn(){
 			
 			if(militaryModeBtn.isEnabled()){
 				
 				System.out.println(militaryModeBtn.getText()+" : - Turn On Military Mode button is displayed successfully");
 				clickElement(militaryModeBtn);	
 				System.out.println("Turn On Military Mode button is clicked successfully");
 		}
 			else
 				{
 					System.out.println(militaryModeBtn.getText()+"  : - Turn On Military Mode button is not displayed successfully");
 					
 				}
 					}
 		
 		
  //validate Modify Device Graphics functionality
 		
 		
 		public void validateDeviceGraphicBtn(){
 			
 			if(deviceGraphicsBtn.isEnabled()){
 				
 				System.out.println(deviceGraphicsBtn.getText()+" : - Modify Device Graphics button is displayed successfully");
 				clickElement(deviceGraphicsBtn);	
 				System.out.println("Modify Device Graphics button is clicked successfully");
 		}
 			else
 				{
 					System.out.println(deviceGraphicsBtn.getText()+"  : - Modify Device Graphics button is not displayed successfully");
 					
 				}
 					}
 		
//validate Test Indicator functionality
 		
public void validateTestInddicatorBtn(){
 			
 			if(indicatorLightBtn.isEnabled()){
 				
 				System.out.println(indicatorLightBtn.getText()+" : - Modify Test Indicator button is displayed successfully");
 				clickElement(indicatorLightBtn);	
 				System.out.println("Test Indicator button is clicked successfully");
 		}
 			else
 				{
 					System.out.println(indicatorLightBtn.getText()+"  : - Test Indicator button is not displayed successfully");
 				
 				}
 					}
 		
 		
//validate Reprint Bagtags functionality

public void validateReprintBagtagBtn(){
		
		if(reprintBagtagBtn.isEnabled()){
			
			System.out.println(reprintBagtagBtn.getText()+" : - Reprint Bagtags button is displayed successfully");
			clickElement(reprintBagtagBtn);	
			System.out.println("Reprint Bagtags button is clicked successfully");
	}
		else
			{
				System.out.println(reprintBagtagBtn.getText()+"  : - Reprint Bagtags button is not displayed successfully");
			}
				}



//validate Keypad functionality

public void validateKeypadBtn(){
		
		if(keypadBtn.isEnabled()){
			
			System.out.println(keypadBtn.getText()+" : - Keypad button is displayed successfully");
			clickElement(keypadBtn);	
			System.out.println("Keypad button is clicked successfully");
	}
		else
			{
				System.out.println(keypadBtn.getText()+"  : - Keypad button is not displayed successfully");
			}
				}

//validate Turn off IROP functionality

public void validateTurnIROPBtn(){
		
		if(turnIROPBtn.isEnabled()){
			
			System.out.println(turnIROPBtn.getText()+" : - Turn off IROP button is displayed successfully");
			clickElement(turnIROPBtn);	
			System.out.println("Turn off IROP button is clicked successfully");
	}
		else
			{
				System.out.println(turnIROPBtn.getText()+"  : - Turn off IROP button is not displayed successfully");
			}
				}



//validate BE Agent Assist functionality

public void validateTurnBEBtn(){
		
		if(agentAssistBEBtn.isEnabled()){
			
			System.out.println(agentAssistBEBtn.getText()+" : - BE Agent Assist button is displayed successfully");
			clickElement(agentAssistBEBtn);	
			System.out.println("BE Agent Assist button is clicked successfully");
	}
		else
			{
				System.out.println(agentAssistBEBtn.getText()+"  : - BE Agent Assist button is not displayed successfully");
			}
				}

//validate LookUp By Name functionality

public void validateLookUpNameBtn(){
		
		if(lookNameBtn.isEnabled()){
			
			System.out.println(lookNameBtn.getText()+" : - LookUp By Name button is displayed successfully");
			clickElement(lookNameBtn);	
			System.out.println("LookUp By Name button is clicked successfully");
	}
		else
			{
				System.out.println(lookNameBtn.getText()+"  : - LookUp By Name button is not displayed successfully");
			}
				}
	
	}
	

