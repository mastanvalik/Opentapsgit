package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers {
	public MyLeadsPage() {
		if(!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not My Leads Page", "FAIL");
	}	
	
	public FindLeadsPage clickFindLeads()
	{
		clickByXpath(prop.getProperty("Home.clickFindLeads.Xpath"));
	return new FindLeadsPage();	
	}
	
	
}
