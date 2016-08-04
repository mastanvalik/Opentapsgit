package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	

	public CreateLeadPage clickCreate() {

		clickByLink(prop.getProperty("Home.ClickCreateLead.LinkText"));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new CreateLeadPage();
	}
	public MyLeadsPage clickLeadTab(){
		clickByXpath(prop.getProperty("Home.ClickLeadTab.Xpath"));//clickbyXpath("(//a[@href='/crmsfa/control/leadsMain'])");
		return new MyLeadsPage();
		
	}
	













}
