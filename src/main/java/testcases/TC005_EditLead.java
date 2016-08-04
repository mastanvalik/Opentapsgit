package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC005_EditLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser, String leadId, String leadDataSource, String Marketingcampaign) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLeadTab()
		.clickFindLeads()
		.enterByLeadID(leadId)
		.clickFindLeads()
		.clickFirstLeadId()
		.clickEdit()
		.selectDataSource(leadDataSource)
		.clickAddDataSource()
		.selectMarketingCampaign(Marketingcampaign)
		.clickAddMarketingCampaign()
		.clickUpdate()
		.verifyDataSource(leadDataSource)
		.verifyMarketingCampaign(Marketingcampaign);
//		.clickLogout();
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="EditLead";
		testDescription="Editing Lead in Edit Lead Page";
	}

	
	
	
	
	
	
}
