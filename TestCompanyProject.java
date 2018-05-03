package cw2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
	public class TestCompanyProject {
		
		CompanyProject obj = new CompanyProject();
		
		//JUnit Test ID:CP-1-CONS
		//Author (s): Riyadh & Yousef
		//Date Written: 19:35 26/04/2018
		//Reason: To test that the object can be created successfully
		@Test
		public void testCompanyProjectObj() {
			assertNotNull(obj);
		}
			
		//JUnit Test ID:CP-2-CONS
		//Author (s): Riyadh & Yousef
		//Date Written: 19:45 26/04/2018
		//Reason: To test getPID() function returns the correct initial project ID.
		@BeforeClass
		public static  void testCompanyProjectID() {
			CompanyProject obj = new CompanyProject();
			int add = obj.getPID();
			assertEquals(1 ,add);
		}

		//JUnit Test ID:CP-3-GETPT
		//Author (s): Riyadh & Yousef
		//Date Written: 18:20 27/04/2018
		//Reason: To test getPTitle() function returns the correct project Title.
		@Test
		public void testCompanyProjectTitle() {
			
			String PTitle = obj.getPTitle();
			assertEquals("New Project" ,PTitle);
		}
		
		//JUnit Test ID:CP-4-CONS
		//Author (s): Riyadh & Yousef
		//Date Written: 18:30 27/04/2018
		/*Reason: To test getPTitle() function returns the correct project Title
					when the title is passed through the constructor.*/
		@Test
		public void testCompanyProjectTitle1() {
			String a = "Hello";
			CompanyProject obj=new CompanyProject(a);
			String PTitle = obj.getPTitle();
			assertEquals(a ,PTitle);
		}
		
		//JUnit Test ID:CP-5-SPTE
		//Author (s): Riyadh & Yousef
		//Date Written: 19:00 27/04/2018
		//Reason: To test setPTitle(String) function sets the title correctly
		@Test
		public void testCompanyProjectTitleLength() {
			obj.setPTitle("Engineering");
			String P= obj.getPTitle();
			assertEquals("Engineering" ,P);
		}
		
		//JUnit Test ID:CP-6-SPTE
		//Author (s): Riyadh & Yousef
		//Date Written: 19:00 27/04/2018
		//Reason: To test setPTitle(String) function does not set the title if less than 10 characters
		@Test
		public void testCompanyProjectTitleLength2() {
			obj.setPTitle("Eng");
			String P= obj.getPTitle();
			assertNotSame("Eng" ,P);
		}
		
		//JUnit Test ID:CP-7-AC&IS
		//Author (s): Riyadh & Yousef
		//Date Written: 20:30 27/04/2018
		/*Reason: To test if the function addContact(String) sets the value correctly
		  			and the function isContact() returns the set value correctly*/
		@Test
		public void TestisContact() {
			boolean check=true;
			obj.addContact("Email@email.com");
			obj.addContact("Email1@email.com");
			obj.addContact("Email2@email.com");
			check = obj.isContact("Email2@email.com");
			assertEquals(true,check);
		}
		
		//JUnit Test ID:CP-8-CONS
		//Author (s): Mohsin & Yousef
		//Date Written: 20:40 27/04/2018
		//Reason: To test that the object was built correctly by it's constructor
		//The test failed according to the mistake in the function emailMessage in the CompanyEmail class
		@Test
		public void TestaddEmail() {
			CompanyEmail email=new CompanyEmail("myemail@notts.com", "sendto@notts.com", "the title", "the message");
			obj.addEmail(email);
			assertSame(email.fromAddress(),"myemail@notts.com" );
			assertSame(email.toAddress(),"sendto@notts.com" );
			assertSame(email.subjectLine(),"the title");
			assertSame(email.emailMessage(),"the message");
		}
		
		//JUnit Test ID:CP-9-GEFP
		//Author (s): Mohsin & Yousef
		//Date Written: 21:00 27/04/2018
		//Reason: To test if the function getEmailsForPhase() is not null when an email is added
		/* Test Fails */
		@Test
		public void TestgetEmailsForPhase() {
			CompanyEmail email=new CompanyEmail("myemail@notts.com", "sendto@notts.com", "the title", "the message");
			obj.addEmail(email);
			ArrayList[] ProjectEmails = new ArrayList[6];
			ProjectEmails[0]=obj.getEmailsForPhase();
			assertSame(ProjectEmails[0].get(0),"myemail@notts.com");	
		}
		
		//JUnit Test ID:CP-10-GEFPI
		//Author (s): Mohsin & Yousef
		//Date Written: 21:20 27/04/2018
		//Reason: To test if the function getEmailsForPhase() is not null when an email is added 
		@Test
		public void TestGetEmailsForPhaseWithInt() {
			CompanyEmail email=new CompanyEmail("myemail@notts.com", "sendto@notts.com", "the title", "the message");
			obj.addEmail(email);
			//proj.nextPhase();
			//proj.addEmail(email);
			ArrayList[] ProjectEmails = new ArrayList[6];
			ProjectEmails[0]=obj.getEmailsForPhase(0);
			assertNotNull(ProjectEmails[0]);	
		}
		
		//JUnit Test ID:CP-11-NPHA
		//Author (s): Riyad & Yousef
		//Date Written: 21:30 27/04/2018
		//Reason: To test if the next phase valid in the company project system length
		@Test
		public void TestNextPhase() {
			boolean x=obj.nextPhase();
			assertTrue(x);	
		}
		
		//JUnit Test ID:CP-12-NPHA
		//Author (s): Riyad & Yousef
		//Date Written: 21:40 27/04/2018
		//Reason: To test if the next phase does not exist, nextPhase() function will return false
		@Test
		public void TestNextPhaseFalse() {
			obj.nextPhase();
			obj.nextPhase();
			obj.nextPhase();
			obj.nextPhase();
			obj.nextPhase();
			obj.nextPhase();
			boolean x=obj.nextPhase();
			assertFalse(x);	
		}
		
		
		//JUnit Test ID:CP-13-GPBN, CP-14-GPBN
		//Author (s): Riyad & Yousef
		//Date Written: 21:50 27/04/2018
		//Reason: To test if the function getPhaseByName() returns the correct phase title
		@Test
		public void TestGetPhaseByName() {
			String a="Feasibility";
			assertEquals(a,obj.getPhaseByName());	
		}
		
		//JUnit Test ID:CP-15-TSTR
		//Author (s): Riyad & Yousef
		//Date Written: 21:53 27/04/2018
		//Reason: to test if the function "toString" return the correct value
		@Test
		public void TestToString() {
			String a=obj.toString();
			assertEquals(a,"New Project" + " [" + "Feasibility" + "]");	
		}
		
		//JUnit Test ID:CP-16-TSTR
		//Author (s): Feras & Yousef
		//Date Written: 22:00 27/04/2018
		//Reason: To test if getPhaseByID() returns the correct initial phase ID
		@Test
		public void TestGetPhaseByID() {
			int a=obj.getPhaseByID();
			assertEquals(a, 0);	
		}
		
		//JUnit Test ID:CP-17-TSTR
		//Author (s): Feras & Yousef
		//Date Written: 22:05 27/04/2018
		//Reason: to test if getProjectContacts() function returns the same values that been added by addContact() function
		@Test
		public void TestGetProjectContacts() {
			ArrayList<String> ProjectContacts;
			ProjectContacts = new ArrayList<String>();
			obj.addContact("aaa");
			obj.addContact("BB");
			ProjectContacts=obj.getProjectContacts();
			assertEquals(ProjectContacts.get(0), "aaa");	
			assertEquals(ProjectContacts.get(1), "BB");
			}
}


