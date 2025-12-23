package practicePom;

import org.testng.annotations.Test;

import objectRepositoryUtility.Contact_Page;
import objectRepositoryUtility.Contact_createNewCon_Page;
import objectRepositoryUtility.HomePage;
import objectRepositoryUtility.Org_Page;
import objectRepositoryUtility.Org_createNewOrg_Page;

public class Practice_TestNG1 extends PracticeBaseClass{
	
	@Test
	public void createContact() {
		System.out.println("contact create");
	}
	@Test
	public void MODIFYContact() {
		System.out.println("contact create");
	}
  public void DeleteContact() {
		System.out.println("contact create");
	}
	
	@Test
	public void createOrg() {
		System.out.println("created organisation");
	}
	@Test
	public void modifyOrg() {
		System.out.println("modify organisation");
	}
	@Test
	public void deleteOrg() {
		System.out.println("delete organisation");
	}
	
	@Test
	public void orgWithIndustries() {
		System.out.println("create orgWithIndustries");
	}
public void createContactWithAttachTest() throws Throwable {

		

		HomePage hp = new HomePage(driver);

		hp.getOrgLink().click();;

		Org_createNewOrg_Page ocp = new Org_createNewOrg_Page(driver);

		Org_Page op = new Org_Page(driver);

		op.getCreateNewOrgIcon().click();

		String orgName = eLib.getDataFRomExcel("contact", 4, 2)+jLib.getRandomNumber();

		ocp.createOrganization(orgName);

		Thread.sleep(2000);

		hp.getContactLink().click();

		Contact_Page cp = new Contact_Page(driver);

		cp.getCreateContactIcon().click();

		String firstName = eLib.getDataFRomExcel("contact", 1, 2);

		String lastName = eLib.getDataFRomExcel("contact", 1, 3);

		String supportStartDate= jLib.getSystemDateyyyyMMdd();

		String supportEndDate = jLib.getRequiredDateyyyyMMdd(30);

		String filePath = "C:\\Users\\Mamat\\OneDrive\\Desktop\\meta.png";

		Contact_createNewCon_Page cc = new Contact_createNewCon_Page(driver);

		cc.createContactWithOrgAndAttachFile(filePath, orgName, firstName, lastName, supportStartDate, supportEndDate);

		

	}
}
