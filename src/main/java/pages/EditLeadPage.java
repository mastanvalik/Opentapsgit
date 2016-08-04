package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers {

	public EditLeadPage() {
		if (!verifyTitle(" opentaps CRM"))
			Reporter.reportStep("This is not Edit Leads Page", "FAIL");

	}

	public EditLeadPage selectDataSource(String dataSource) {
		selectById(prop.getProperty("EditLeadPage.SelectDataSource.Id"), dataSource);
		return this;
	}

	public EditLeadPage clickAddDataSource()
	{
		clickByXpath(prop.getProperty("EditLeadPage.ClickAddDataSource.Xpath"));
		return this;
	}
	public EditLeadPage selectMarketingCampaign(String dataSource) {
		selectById(prop.getProperty("EditLeadPage.SelectMarketingcCampaign.Id"), dataSource);
		return this;
	
	}
	
	public EditLeadPage clickAddMarketingCampaign()
	{
		clickByXpath(prop.getProperty("EditLeadPage.ClickAddMarketingCampaign.Xpath"));
		return this;
	}

	public ViewLead clickUpdate()
	{
		clickByXpath("EditLeadPage.ClicUpdateLead.Xpath");
		return new ViewLead();
			}
	
}
	