package practicePom;

import org.testng.annotations.Test;

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
	public void ContactWithOrg() {
		System.out.println("created ContactWithOrg");
	}
	
	
	
	@Test
	public void modifyOrg() {
		System.out.println("modify organisation");
	}
	@Test
	public void deleteOrg() {
		System.out.println("delete organisation");
	}
}
