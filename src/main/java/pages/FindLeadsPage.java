package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers{
public FindLeadsPage()
{
	if(!verifyTitle("Find Leads | opentaps CRM"))
		Reporter.reportStep("This is not Find Leads Page", "FAIL");
}

public FindLeadsPage clickFindLeads()
{
	clickByXpath(prop.getProperty("FindLeads.ClickBy.Xpath"));
	return this;
}

public FindLeadsPage enterByLeadID(String data)
{
	enterById(prop.getProperty("Home.EnterById.Xpath"), data);//"//*[@name='id']"
	return this;
}


public ViewLead clickFirstLeadId()
{
	clickByXpath(prop.getProperty("clickFirstLeadId.Xpath"));//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	return new ViewLead();
}


}
