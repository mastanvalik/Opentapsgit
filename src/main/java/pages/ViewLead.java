package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLead extends OpentapsWrappers{

	public ViewLead() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not View Lead Page", "FAIL");
	}	
	
	public MyLeadsPage clickDelete()
	{
		clickByClassName(prop.getProperty("ViewLead.Delete.className"));//subMenuButtonDangerous
		return new MyLeadsPage();
	}
	public EditLeadPage clickEdit()
	
	{
		clickByLink(prop.getProperty("ViewLead.Edit.LinkText"));///Edit
		return new EditLeadPage();
	}

	public ViewLead verifyDataSource(String datasource)
	{
		
		verifyTextByXpath(prop.getProperty("ViewLead.VerifyDataSource.Xpath"), datasource);
	return this;
	}

	public ViewLead verifyMarketingCampaign(String datasource)
	{
		
		verifyTextByXpath(prop.getProperty("ViewLead.VerifyMarketingCampaign.Xpath"), datasource);
	return this;
	}












}
