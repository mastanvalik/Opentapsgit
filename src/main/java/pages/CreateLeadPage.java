package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers {


	
	public CreateLeadPage() {
		if (!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}
	

	public CreateLeadPage enterCompanyname(String data) {

		enterById(prop.getProperty("CreateLead.Companyname.Id"), data);

		return this;
	}

	public CreateLeadPage enterFirstname(String data) {

		enterById(prop.getProperty("CreateLead.Firstname.Id"), data);

		return this;

	}

	public CreateLeadPage enterLastname(String data) {

		enterById(prop.getProperty("CreateLead.Lastname.Id"), data);

		return this;

	}

	public ViewLead clickCreateLead() {

		clickByClassName(prop.getProperty("CreateLead.Creaetlead.Classname"));

		return new ViewLead();

	}
}
