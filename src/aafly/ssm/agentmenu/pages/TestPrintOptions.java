package aafly.ssm.agentmenu.pages;
import java.util.List;
import java.util.Iterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.selenium.framework.FrameworkUtility;

public class TestPrintOptions extends FrameworkUtility {

	
	//	@FindBy(id="btnPrintTestDoc")
	
		@FindBy(xpath="//div[@class='cell large-4']/button[@class='ssmButtonSelect b3']")
		public WebElement printTestDocBtn;
	
	    @FindBy(xpath="//div[@class='container grid-container fluid']/h1")
	    public WebElement lblTestPrint;
	  
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button")
	    public List<WebElement> allOptionList;
	    
		//Declaring the Buttons Id under Test Print Screen
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b1 large-4']")
	    public WebElement boardingPassBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b2 large-4']")
	    public WebElement wifiBoardingPassBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b3 large-4']")
	    public WebElement priorityCardBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b4 large-4']")
	    public WebElement wifiPriorityCardBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b5 large-4']")
	    public WebElement baggageReceiptBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b6 large-4']")
	    public WebElement miscSalesReceiptBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b7 large-4']")
	    public WebElement ticketReceiptBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b8 large-4']")
	    public WebElement upgradeReceiptBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b9 large-4']")
	    public WebElement infoCardBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b10 large-4']")
	    public WebElement oneDayPassBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b11 large-4']")
	    public WebElement itineraryBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b12 large-4']")
	    public WebElement refundReceiptBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b13 large-4']")
	    public WebElement bonusMilesBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b14 large-4']")
	    public WebElement bagcouponBtn;
	    
	    @FindBy(xpath="//div[@class='grid-x grid-margin-x aarow']/button[@class='cell auto agent ssmButtonSelect b15 large-4']")
	    public WebElement printBagtagBtn;
	    
	    
	    
		//Initialization
		
		public TestPrintOptions(WebDriver driver) {
			PageFactory.initElements(driver, this);
		} 
	
	
//Validate and click on Print Test Document Option
	
			public void validateTestPrintDoc(){
			
				
				if(printTestDocBtn.isEnabled()){
					
		 				System.out.println(printTestDocBtn.getText()+" : - Print Test Document button displayed successfully");
						clickElement(printTestDocBtn);	
						System.out.println("Print Test Doc is clicked successfully");
				}
					else
						{
							System.out.println(printTestDocBtn.getText()+"  : - Print Test Document button is not displayed successfully");
							Assert.fail();
						}
							}

//Validate and Clicks on the buttons to Print the Receipts from Test the Printer Page.

		public void testprintButtons(){
				
				if(lblTestPrint.isDisplayed()){
				System.out.println(lblTestPrint.getText()+ "  : - Test All Print screen Label is displayed successfully");
				Iterator<WebElement> itr = allOptionList.iterator();
	            while(itr.hasNext()) 
	            {
	                 WebElement row = itr.next();
	                 /*CustomWait wait_load = new CustomWait();
	                 wait_load.forXseconds(1000);*/
	                 System.out.println(row.getText()); 
	                 System.out.println("Test Print Buttons displayed Successfully");
	            }		
			}
				else
				{
				  System.out.println(lblTestPrint.getText()+" : - Test All Print screen is not displayed successfully");	
					}
		}
			
	
		//validate Boarding Button Functionality
		
		public void validateboardingPassBtn(){
			
			if(boardingPassBtn.isEnabled()){
				
				System.out.println(boardingPassBtn.getText()+" : - Boading Pass button is displayed successfully");
				clickElement(boardingPassBtn);	
				System.out.println("Boading Pass button is clicked successfully");
		}
			else
				{
					System.out.println(boardingPassBtn.getText()+"  : - Boading Pass button is not displayed successfully");
				}
					}
		
		
		
		//validate Wifi Boarding Button Functionality
		
		public void validatewifiboardingPassBtn(){
			
			if(wifiBoardingPassBtn.isEnabled()){
				
				System.out.println(wifiBoardingPassBtn.getText()+" : - Wifi Boading Pass button is displayed successfully");
				clickElement(wifiBoardingPassBtn);	
				System.out.println("Wifi Boading Pass button is clicked successfully");
		}
			else
				{
					System.out.println(wifiBoardingPassBtn.getText()+"  : - Wifi Boading Pass button is not displayed successfully");
				}
					}
	
		//validate Priority Card Button Functionality
		
				public void validatepriorityCardBtn(){
					
					if(priorityCardBtn.isEnabled()){
						
						System.out.println(priorityCardBtn.getText()+" : - Priority Card button is displayed successfully");
						clickElement(priorityCardBtn);	
						System.out.println("Priority Card button  is clicked successfully");
				}
					else
						{
							System.out.println(priorityCardBtn.getText()+"  : - Priority Card button  is not displayed successfully");
						}
							}
				
				//validate Wifi Priority Card Button Functionality
				
				public void validatewifiPriorityCardBtn(){
					
					if(wifiPriorityCardBtn.isEnabled()){
						
						System.out.println(wifiPriorityCardBtn.getText()+" : - Wifi Priority Card button is displayed successfully");
						clickElement(wifiPriorityCardBtn);	
						System.out.println("Wifi Priority Card button is clicked successfully");
				}
					else
						{
							System.out.println(wifiPriorityCardBtn.getText()+"  : - Wifi Priority Card button is not displayed successfully");
						}
							}
				
				//validate Baggage Receipt Button Functionality
				
				public void validatebaggageReceiptBtn(){
					
					if(baggageReceiptBtn.isEnabled()){
						
						System.out.println(baggageReceiptBtn.getText()+" : -Baggage Receipt button is displayed successfully");
						clickElement(baggageReceiptBtn);	
						System.out.println("Baggage Receipt button is clicked successfully");
				}
					else
						{
							System.out.println(baggageReceiptBtn.getText()+"  : - Boading Pass button is not displayed successfully");
						}
							}
				
				//validate Misc Sales Receipt Button Functionality
				
				public void validatemiscSalesReceiptBtn(){
					
					if(miscSalesReceiptBtn.isEnabled()){
						
						System.out.println(miscSalesReceiptBtn.getText()+" : - Misc Sales Receipt button is displayed successfully");
						clickElement(miscSalesReceiptBtn);	
						System.out.println("Misc Sales Receipt button is clicked successfully");
				}
					else
						{
							System.out.println(miscSalesReceiptBtn.getText()+"  : - Misc Sales Receipt button is not displayed successfully");
						}
							}
				
				//validate Ticket Receipt Button Functionality
				
				public void validateticketReceiptBtn(){
					
					if(ticketReceiptBtn.isEnabled()){
						
						System.out.println(ticketReceiptBtn.getText()+" : - Ticket Receipt button is displayed successfully");
						clickElement(ticketReceiptBtn);	
						System.out.println("Ticket Receipt button is clicked successfully");
				}
					else
						{
							System.out.println(ticketReceiptBtn.getText()+"  : - Ticket Receipt button is not displayed successfully");
						}
							}
				
				//validate Upgrade Receipt Button Functionality
				
				public void validateupgradeReceiptBtn(){
					
					if(upgradeReceiptBtn.isEnabled()){
						
						System.out.println(upgradeReceiptBtn.getText()+" : - Upgrade Receipt button is displayed successfully");
						clickElement(upgradeReceiptBtn);	
						System.out.println("Upgrade Receipt button is clicked successfully");
				}
					else
						{
							System.out.println(upgradeReceiptBtn.getText()+"  : - Upgrade Receipt button is not displayed successfully");
						}
							}
				
				//validate Information Card Button Functionality
				
				public void validateinfoCardBtn(){
					
					if(infoCardBtn.isEnabled()){
						
						System.out.println(infoCardBtn.getText()+" : - Information Card button is displayed successfully");
						clickElement(infoCardBtn);	
						System.out.println("Information Card button is clicked successfully");
				}
					else
						{
							System.out.println(infoCardBtn.getText()+"  : - Information Card button is not displayed successfully");
						}
							}
				
				//validate One Day Pass Button Functionality
				
				public void validateoneDayPassBtn(){
					
					if(oneDayPassBtn.isEnabled()){
						
						System.out.println(oneDayPassBtn.getText()+" : - One Day Pass button is displayed successfully");
						clickElement(oneDayPassBtn);	
						System.out.println("One Day Pass button is clicked successfully");
				}
					else
						{
							System.out.println(oneDayPassBtn.getText()+"  : - One Day Pass button is not displayed successfully");
						}
							}
				
				//validate Itinerary Button Functionality
				
				public void validateitineraryBtn(){
					
					if(itineraryBtn.isEnabled()){
						
						System.out.println(itineraryBtn.getText()+" : -Itinerary button is displayed successfully");
						clickElement(itineraryBtn);	
						System.out.println("Itinerary button is clicked successfully");
				}
					else
						{
							System.out.println(itineraryBtn.getText()+"  : - Itinerary button is not displayed successfully");
						}
							}
				
				//validate Refund Receipt Button Functionality
				
				public void validaterefundReceiptBtn(){
					
					if(refundReceiptBtn.isEnabled()){
						
						System.out.println(refundReceiptBtn.getText()+" : - Refund Receipt button is displayed successfully");
						clickElement(refundReceiptBtn);	
						System.out.println("Refund Receipt button is clicked successfully");
				}
					else
						{
							System.out.println(refundReceiptBtn.getText()+"  : - Refund Receipt button is not displayed successfully");
						}
							}
				
				//validate Bonus Miles Button Functionality
				
				public void validatebonusMilesBtn(){
					
					if(bonusMilesBtn.isEnabled()){
						
						System.out.println(bonusMilesBtn.getText()+" : - Bonus Miles button is displayed successfully");
						clickElement(bonusMilesBtn);	
						System.out.println("Bonus Miles button is clicked successfully");
				}
					else
						{
							System.out.println(bonusMilesBtn.getText()+"  : - Bonus Miles button is not displayed successfully");
						}
							}
				
				//validate OA Baggage Coupon Button Functionality
				
				public void validatebaggageCouponBtn(){
					
					if(bagcouponBtn.isEnabled()){
						
						System.out.println(bagcouponBtn.getText()+" : - OA Baggage Coupon button is displayed successfully");
						clickElement(bagcouponBtn);	
						System.out.println("OA Baggage Coupon button is clicked successfully");
				}
					else
						{
							System.out.println(bagcouponBtn.getText()+"  : - OA Baggage Coupon button is not displayed successfully");
						}
							}
				
				//validate Print Bagtag Button Functionality
				
				public void validateprintBagtagBtn(){
					
					if(printBagtagBtn.isEnabled()){
						
						System.out.println(printBagtagBtn.getText()+" : - Print Bagtag button is displayed successfully");
						clickElement(printBagtagBtn);	
						System.out.println(" Print Bagtag  button is clicked successfully");
				}
					else
						{
							System.out.println(printBagtagBtn.getText()+"  : -  Print Bagtag button is not displayed successfully");
						}
							}
				
			
}
