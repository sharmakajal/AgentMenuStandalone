package aafly.ssm.agentmenu.pages;


import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.selenium.framework.FrameworkUtility;

public class AgentMenu extends FrameworkUtility {
	
	//Declaration of Variables

//	@FindBy(id="btnGoback")
    @FindBy(xpath="//div[@class='right']/button[@class='button secondary']")
	public WebElement gobackBtn; 
	

   @FindBy(xpath="//div[@class='cell large-4']/button")
   public List<WebElement> menuOptionBtn;
	

	@FindBy(xpath="//div[@class='container']/h1")
	public WebElement lblMenuOption;
	
   
   // Just a moment while we locate your reservation

 	@FindBy(xpath = "//div[@class='waitContainer']/h1")
 	public WebElement lblJustaMoment;
    
    
	/*@FindBy(id="btnBoardPass")
	private WebElement boardingPassBtn;
	
	@FindBy(id="btnWifiPass")
	private WebElement wifiPassBtn;
	
	@FindBy(id="btnPriority")
	private WebElement priorityBtn;
	
	@FindBy(id="btnWifiPriority")
	private WebElement wifiPriorityBtn;
	
	@FindBy(id="btnBagRec")
	private WebElement bagReceiptBtn;

	@FindBy(id="btnSalesRec")
	private WebElement salesReceiptBtn;
	
	@FindBy(id="btnTicketRec")
	private WebElement ticketReceiptBtn;
	
	@FindBy(id="btnUpgardeRec")
	private WebElement upgradeReceiptBtn;
	
	@FindBy(id="btnInfoCard")
	private WebElement infoCardBtn;
	
	@FindBy(id="btnOneday")
	private WebElement onedayPassBtn;
	
	@FindBy(id="btnItineray")
	private WebElement itineraryBtn;
	
	@FindBy(id="btnRefundRec")
	private WebElement refundReceiptBtn;
	
	@FindBy(id="btnBonusMiles")
	private WebElement bonusMilesBtn;
	
	@FindBy(id="btnPrintBagtag")
	private WebElement printBagtagBtn;
	
	@FindBy(id="btnCoupon")
	private WebElement couponBtn;*/
	
 	
	//Initialization
	
		public AgentMenu(WebDriver driver) {
			PageFactory.initElements(driver, this);
		} 
		
	//Validate Menu Option label  on the Agent_Menu_Options Screen
		
		public void validateMenuOption()
		{
			if(lblMenuOption.isDisplayed())
			{
				System.out.println(lblMenuOption.getText()+" : - Menu Option label displayed Successfully");		
			}
			else 
			{
				System.out.println(lblMenuOption.getText()+"  : - Menu Option label not displayed Successfully");	
				Assert.fail();
			}
		}
		
		
//Validate all Menu Options on Agent Menu Screen
		
		public void validateMenuOptionButtons(){
			
			Iterator<WebElement> itr = menuOptionBtn.iterator();
            while(itr.hasNext()) 
            {
                 WebElement row = itr.next();
                 System.out.println(row.getText());
               //  row.click();
                System.out.println("Validated all the MenuOption Buttons successful");
            }	 	 	 
				}		
		
		// Validate the Wait Screen

		public void validateJustaMoment() {
			if (lblJustaMoment.isDisplayed()) {
				System.out.println(lblJustaMoment.getText() + " : - Just a Moment Page Loaded Successfully");
			} else {
				System.out.println(lblJustaMoment.getText() + " : - Just a Moment Page not Loaded Successfully");
				Assert.fail();
			}
		}
}
		

		
