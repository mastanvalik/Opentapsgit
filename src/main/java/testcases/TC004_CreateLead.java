package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_CreateLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser,String CompanyName,String FirstName,String LastName) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickCreate()
		.enterCompanyname(CompanyName)
		.enterFirstname(FirstName)
		.enterLastname(LastName)
		.clickCreateLead();
		
		//.clickLogout();
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004";
		browserName="chrome";
		testCaseName="Create Lead Test";
		testDescription="Create Lead  in Opentaps using POM framework";
	}

	
	
	
	
	
	
}
