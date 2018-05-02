import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestCompanyEmail {
	
	//JUnit Test ID: CE-1-CONS
	//Author(s): Hashim & Feras
	//Date Written: 17:44 26/04/2018
	@Test
	public void testCreateEmail() {
		assertNotNull(new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello."));
	}
	
	//JUnit Test ID: CE-2-CONS
	//Author(s): Hashim & Feras
	//Date Written: 17:47 26/04/2018
	@Test
	public void testCreateEmptyEmail() {
		assertNotNull(new CompanyEmail());
	}
	
	//JUnit Test ID: CE-3-CONS
	//Author(s): Hashim & Feras
	//Date Written: 17:49 26/04/2018
	@Ignore
	public void testCreateOneOnly() {
		assertNull(new CompanyEmail("psyhh1@nottingham.ac.uk", "", "", ""));
	}
	
	//JUnit Test ID: CE-4-CONS
	//Author(s): Hashim & Feras
	//Date Written: 17:51 26/04/2018
	@Ignore
	public void testCreateTwoOnly() {
		assertNull(new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "", ""));
	}
	
	//JUnit Test ID: CE-5-CONS
	//Author(s): Hashim & Feras
	//Date Written: 17:52 26/04/2018
	@Ignore
	public void testCreateThreeOnly() {
		assertNull(new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", ""));
	}
	
	//JUnit Test ID: CE-6-FROM
	//Author(s): Hashim & Feras
	//Date Written: 17:55 26/04/2018
	@Test
	public void testFromAddress() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		assertSame("psyhh1@nottingham.ac.uk", email.fromAddress());
	}
	
	//JUnit Test ID: CE-7-FROM
	//Author(s): Hashim & Feras
	//Date Written: 17:57 26/04/2018
	@Test
	public void testFromAddressNull() {
		CompanyEmail email = new CompanyEmail();
		assertNull(email.fromAddress());
	}
	
	//JUnit Test ID: CE-8-TO
	//Author(s): Mohsin & Feras
	//Date Written: 18:27 26/04/2018
	@Test
	public void testToAddress() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		assertSame("ezyfs1@nottingham.ac.uk", email.toAddress());
	}
	
	//JUnit Test ID: CE-9-TO
	//Author(s): Mohsin & Feras
	//Date Written: 18:30 26/04/2018
	@Test
	public void testToAddressNull() {
		CompanyEmail email = new CompanyEmail();
		assertNull(email.toAddress());
	}
	
	//JUnit Test ID: CE-10-SUB
	//Author(s): Mohsin & Feras
	//Date Written: 18:32 26/04/2018
	@Test
	public void testSubjectLine() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		assertSame("Hello!", email.subjectLine());
	}
	
	//JUnit Test ID: CE-11-SUB
	//Author(s): Mohsin & Feras
	//Date Written: 18:34 26/04/2018
	@Test
	public void testSubjectLineNull() {
		CompanyEmail email = new CompanyEmail();
		assertNull(email.subjectLine());
	}
	
	//JUnit Test ID: CE-12-MSG, CE-13-MSG
	//Author(s): Mohsin & Feras
	//Date Written: 18:35 26/04/2018
	@Test
	public void testEmailMessage() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		assertSame("Hello.", email.emailMessage());
	}
	
	//JUnit Test ID: CE-14-MSG
	//Author(s): Mohsin & Feras
	//Date Written: 18:39 26/04/2018
	@Test
	public void testEmailMessageNull() {
		CompanyEmail email = new CompanyEmail();
		assertNull(email.emailMessage());
	}
	
	//JUnit Test ID: CE-15-SETF
	//Author(s): Mohsin & Feras
	//Date Written: 18:41 26/04/2018
	@Test
	public void testSetFrom() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		email.setFrom("psymw7@nottingham.ac.uk");
		assertSame("psymw7@nottingham.ac.uk", email.fromAddress());
	}
	
	//JUnit Test ID: CE-16-SETF
	//Author(s): Mohsin & Feras
	//Date Written: 18:43 26/04/2018
	@Test
	public void testSetFromInvalid() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		email.setFrom("psymw7nottingham.ac.uk");
		assertSame("psyhh1@nottingham.ac.uk", email.fromAddress());
	}
	
	//JUnit Test ID: CE-17-SETT
	//Author(s): Mohsin & Feras
	//Date Written: 18:45 26/04/2018
	@Test
	public void testSetTo() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		email.setTo("psymw7@nottingham.ac.uk");
		assertSame("psymw7@nottingham.ac.uk", email.toAddress());
	}
	
	//JUnit Test ID: CE-18-SETT
	//Author(s): Mohsin & Feras
	//Date Written: 18:47 26/04/2018
	@Test
	public void testSetToInvalid() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		email.setTo("psymw7nottingham.ac.uk");
		assertSame("ezyfs1@nottingham.ac.uk", email.toAddress());
	}
	
	//JUnit Test ID: CE-19-SETS
	//Author(s): Mohsin & Feras
	//Date Written: 18:50 26/04/2018
	@Test
	public void testSetSubject() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		email.setSubject("New Subject.");
		assertSame("New Subject.", email.subjectLine());
	}
	
	//JUnit Test ID: CE-20-SETM
	//Author(s): Mohsin & Feras
	//Date Written: 18:53 26/04/2018
	@Test
	public void testSetMessage() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		email.setMessage("New Message.");
		assertSame("New Message.", email.emailMessage());
	}
	
	//JUnit Test ID: CE-21-ISVA
	//Author(s): Mohsin & Feras
	//Date Written: 18:55 26/04/2018
	@Test
	public void testIsValidTrue() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		assertTrue(email.isValid());
	}
	
	//JUnit Test ID: CE-22-ISVA
	//Author(s): Mohsin & Feras
	//Date Written: 18:57 26/04/2018
	@Test
	public void testIsValidFalse() {
		CompanyEmail email = new CompanyEmail();
		assertFalse(email.isValid());
	}
	
	//JUnit Test ID: CE-23-TOST
	//Author(s): Mohsin & Feras
	//Date Written: 18:58 26/04/2018
	@Test
	public void testToString() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		assertSame("Hello!", email.toString());
	}
	
	//JUnit Test ID: CE-24-TOST
	//Author(s): Mohsin & Feras
	//Date Written: 18:59 26/04/2018
	@Test
	public void testToStringEmpty() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "", "Hello.");
		assertSame("[no subject]", email.toString());
	}
	
	//JUnit Test ID: CE-25-ISVA
	//Author(s): Hashim & Feras
	//Date Written: 19:04 26/04/2018
	@Test
	public void testIsValidBoth() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		email.setSubject(null);
		email.setMessage(null);
		assertFalse(email.isValid());
	}
	
	//JUnit Test ID: CE-26-ISVA
	//Author(s): Hashim & Feras
	//Date Written: 19:07 26/04/2018
	@Test
	public void testIsValidSub() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		email.setSubject(null);
		assertFalse(email.isValid());
	}
	
	//JUnit Test ID: CE-27-ISVA
	//Author(s): Hashim & Feras
	//Date Written: 19:10 26/04/2018
	@Test
	public void testIsValidMsg() {
		CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
		email.setMessage(null);
		assertFalse(email.isValid());
	}
	

}
