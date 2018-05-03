package cw2;

import static org.junit.Assert.*;
import org.junit.Test;

	import org.junit.Ignore;
	public class TestCompanyEmail {
		
		CompanyEmail email = new CompanyEmail();
		
		//JUnit Test ID: CE-1-CONS
		//Author(s): Hashim & Feras
		//Date Written: 17:44 26/04/2018
		//Reason: To test that the object can be created successfully with a full correct argument list
		@Test
		public void testCreateEmail() {
			assertNotNull(new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello."));
		}
		
		//JUnit Test ID: CE-2-CONS
		//Author(s): Hashim & Feras
		//Date Written: 17:47 26/04/2018
		//Reason: To test that the object can be created successfully with no arguments
		@Test
		public void testCreateEmptyEmail() {
			assertNotNull(new CompanyEmail());
		}
		
		//JUnit Test ID: CE-3-CONS
		//Author(s): Hashim & Feras
		//Date Written: 17:49 26/04/2018
		/*Reason: Test that the new companyEmail object can be successfully 
		  			created with only the fromAddress */
		@Test
		public void testCreateOneOnly() {
			assertNotNull(new CompanyEmail("psyhh1@nottingham.ac.uk", "", "", ""));
		}
		
		//JUnit Test ID: CE-4-CONS
		//Author(s): Hashim & Feras
		//Date Written: 17:51 26/04/2018
		/*Reason: Test that the new companyEmail object can be successfully
					created with only the fromAddress and toAddress */
		@Test
		public void testCreateTwoOnly() {
			assertNotNull(new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "", ""));
		}
		
		//JUnit Test ID: CE-5-CONS
		//Author(s): Hashim & Feras
		//Date Written: 17:52 26/04/2018
		/*Reason: Test that the new companyEmail object can be successfully
					created with only the fromAddress, toAddress and subLine*/
		@Test
		public void testCreateThreeOnly() {
			assertNotNull(new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", ""));
		}
		
		//JUnit Test ID: CE-6-FROM
		//Author(s): Hashim & Feras
		//Date Written: 17:55 26/04/2018
		/*Reason: To test that the fromAddress() function correctly
					returns the fromAddress variable of a CompanyEmail object */
		@Test
		public void testFromAddress() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			assertSame("psyhh1@nottingham.ac.uk", email.fromAddress());
		}
		
		//JUnit Test ID: CE-7-FROM
		//Author(s): Hashim & Feras
		//Date Written: 17:57 26/04/2018
		/*Reason: To test that the fromAddress() function correctly
					returns null when the CompanyEmail object's fromAddress is null */ 
		@Test
		public void testFromAddressNull() {
			assertNull(email.fromAddress());
		}
		
		//JUnit Test ID: CE-8-TO
		//Author(s): Mohsin & Feras
		//Date Written: 18:27 26/04/2018
		/*Reason: To test that the toAddress() function correctly
					returns the toAddress variable of a CompanyEmail object */
		@Test
		public void testToAddress() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			assertSame("ezyfs1@nottingham.ac.uk", email.toAddress());
		}
		
		//JUnit Test ID: CE-9-TO
		//Author(s): Mohsin & Feras
		//Date Written: 18:30 26/04/2018
		/*Reason: To test that the toAddress() function correctly
					returns null when the CompanyEmail object's toAddress is null */ 
		@Test
		public void testToAddressNull() {
			assertNull(email.toAddress());
		}
		
		//JUnit Test ID: CE-10-SUB
		//Author(s): Mohsin & Feras
		//Date Written: 18:32 26/04/2018
		/*Reason: To test that the subjectLine() function correctly
					returns the subjectLine variable of a CompanyEmail object */
		@Test
		public void testSubjectLine() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			assertSame("Hello!", email.subjectLine());
		}
		
		//JUnit Test ID: CE-11-SUB
		//Author(s): Mohsin & Feras
		//Date Written: 18:34 26/04/2018
		/*Reason: To test that the subjectLine function correctly
					returns null when the CompanyEmail object's subjectLine is null */ 
		@Test
		public void testSubjectLineNull() {
			assertNull(email.subjectLine());
		}
		
		//JUnit Test ID: CE-12-MSG, CE-13-MSG
		//Author(s): Mohsin & Feras
		//Date Written: 18:35 26/04/2018
		/*Reason: To test that the emailMessage() function correctly
					returns the emailMessage variable of a CompanyEmail object */
		@Test
		public void testEmailMessage() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			assertSame("Hello.", email.emailMessage());
		}
		
		//JUnit Test ID: CE-14-MSG
		//Author(s): Mohsin & Feras
		//Date Written: 18:39 26/04/2018
		/*Reason: To test that the emailMessage() function correctly
					returns null when the CompanyEmail object's emailMessage is null */ 
		@Test
		public void testEmailMessageNull() {
			assertNull(email.emailMessage());
		}
		
		//JUnit Test ID: CE-15-SETF
		//Author(s): Mohsin & Feras
		//Date Written: 18:41 26/04/2018
		/*Reason: To test that setFrom() function correctly sets the CompanyEmail fromAddress by 
					comparing the set address to the one returned by fromAddress() */
		@Test
		public void testSetFrom() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			email.setFrom("psymw7@nottingham.ac.uk");
			assertSame("psymw7@nottingham.ac.uk", email.fromAddress());
		}
		
		//JUnit Test ID: CE-16-SETF
		//Author(s): Mohsin & Feras
		//Date Written: 18:43 26/04/2018
		/*Reason: To test that the setFrom() function doesn't set the fromAddress
					when the new address isn't in email format(should contain @) */
		@Test
		public void testSetFromInvalid() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			email.setFrom("psymw7nottingham.ac.uk");
			assertSame("psyhh1@nottingham.ac.uk", email.fromAddress());
		}
		
		//JUnit Test ID: CE-17-SETT
		//Author(s): Mohsin & Feras
		//Date Written: 18:45 26/04/2018
		/*Reason: To test that setTo() function correctly sets the CompanyEmail toAddress by 
					comparing the set address to the one returned by toAddress() */
		@Test
		public void testSetTo() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			email.setTo("psymw7@nottingham.ac.uk");
			assertSame("psymw7@nottingham.ac.uk", email.toAddress());
		}
		
		//JUnit Test ID: CE-18-SETT
		//Author(s): Mohsin & Feras
		//Date Written: 18:47 26/04/2018
		/*Reason: To test that the setTo() function doesn't set the toAddress
					when the new address isn't in email format(should contain @) */
		@Test
		public void testSetToInvalid() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			email.setTo("psymw7nottingham.ac.uk");
			assertSame("ezyfs1@nottingham.ac.uk", email.toAddress());
		}
		
		//JUnit Test ID: CE-19-SETS
		//Author(s): Mohsin & Feras
		//Date Written: 18:50 26/04/2018
		/*Reason: To test that setSubject() function correctly sets the CompanyEmail subjectLine by 
					comparing the set subjectLine to the one returned by subjectLine() */
		@Test
		public void testSetSubject() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			email.setSubject("New Subject.");
			assertSame("New Subject.", email.subjectLine());
		}
		
		//JUnit Test ID: CE-20-SETM
		//Author(s): Mohsin & Feras
		//Date Written: 18:53 26/04/2018
		/*Reason: To test that setMessage() function correctly sets the CompanyEmail emailMessage by 
					comparing the set emailMessage to the one returned by emailMessage() */
		@Test
		public void testSetMessage() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			email.setMessage("New Message.");
			assertSame("New Message.", email.emailMessage());
		}
		
		//JUnit Test ID: CE-21-ISVA
		//Author(s): Mohsin & Feras
		//Date Written: 18:55 26/04/2018
		/*Reason: Test whether the isValid() function correctly returns true when all of the data members
					of the CompanyEmail are not null */
		@Test
		public void testIsValidTrue() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			assertTrue(email.isValid());
		}
		
		//JUnit Test ID: CE-22-ISVA
		//Author(s): Mohsin & Feras
		//Date Written: 18:57 26/04/2018
		/*Reason: Test whether the isValid() function correctly returns false when all of the data members
					of the CompanyEmail are null(because they haven't been set) */
		@Test
		public void testIsValidFalse() {
			assertFalse(email.isValid());
		}
		
		//JUnit Test ID: CE-23-TOST
		//Author(s): Mohsin & Feras
		//Date Written: 18:58 26/04/2018
		/*Reason: To test that the subjectLine is returned correctly by toString()
					when the subject line is not empty */
		@Test
		public void testToString() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			assertSame("Hello!", email.toString());
		}
		
		//JUnit Test ID: CE-24-TOST
		//Author(s): Mohsin & Feras
		//Date Written: 18:59 26/04/2018
		//Reason: To test whether "[no subject]" is returned correctly by toString() if the subjectLine is empty
		@Test
		public void testToStringEmpty() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "", "Hello.");
			assertSame("[no subject]", email.toString());
		}
		
		//JUnit Test ID: CE-25-ISVA
		//Author(s): Hashim & Feras
		//Date Written: 19:04 26/04/2018
		/*Reason: Test whether the isValid() function correctly returns false when subjectLine and emailmessage
					of the CompanyEmail are set to null */
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
		/*Reason: Test whether the isValid() function correctly returns false when subjectLine
					of the CompanyEmail is set to null */
		@Test
		public void testIsValidSub() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			email.setSubject(null);
			assertFalse(email.isValid());
		}
		
		//JUnit Test ID: CE-27-ISVA
		//Author(s): Hashim & Feras
		//Date Written: 19:10 26/04/2018
		/*Reason: Test whether the isValid() function correctly returns false when emailmessage
					of the CompanyEmail is set to null */
		@Test
		public void testIsValidMsg() {
			CompanyEmail email = new CompanyEmail("psyhh1@nottingham.ac.uk", "ezyfs1@nottingham.ac.uk", "Hello!", "Hello.");
			email.setMessage(null);
			assertFalse(email.isValid());
		}
		

	

}
