package cw2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;



public class CompanyProjectTestv2 {
	CompanyProject obj=new CompanyProject();
	//JUnit Test ID:CP-1-CONS
	//Author (s): Riyadh
	//Date Written: 18:14 26/04/2018
		@Test
	public void testCompanyProjectObj() {
		assertNotNull(obj);
	}
		
	//JUnit Test ID:CP-2-CONS
	//Author (s): Riyadh & Yousef
	//Date Written: 18:16 26/04/2018
	@BeforeClass
	public static  void testCompanyProjectID() {
		CompanyProject obj=new CompanyProject();
		int add = obj.getPID();
		assertEquals(1 ,add);
	}
		

		
	

		
		//JUnit Test ID:CP-3-GETPT
		//Author (s): Riyadh & Yousef
		//Date Written: 18:20 26/04/2018
			@Test
			public void testCompanyProjectTitle() {
				
				String PTitle = obj.getPTitle();
				assertEquals("New Project" ,PTitle);
			}
			//JUnit Test ID:CP-4-CONS
			//Author (s): Riyadh & Yousef
			//Date Written: 18:30 26/04/2018
			@Test
			public void testCompanyProjectTitle1() {
				String a = "Hello";
				CompanyProject obj=new CompanyProject(a);
				String PTitle = obj.getPTitle();
				assertEquals(a ,PTitle);
			}
			
			//JUnit Test ID:CP-5-SPTE
			//Author (s): Riyadh & Yousef
			//Date Written: 18:40 26/04/2018
			@Test
			public void testCompanyProjectTitleLength() {
				obj.setPTitle("Engineering");
				String P= obj.getPTitle();
				assertEquals("Engineering" ,P);
			}
			
			//JUnit Test ID:CP-6-SPTE
			//Author (s): Riyadh & Yousef
			//Date Written: 18:52 26/04/2018
			@Test
			public void testCompanyProjectTitleLength2() {
				obj.setPTitle("Eng");
				String P= obj.getPTitle();
				assertNotSame("Eng" ,P);
			}
			
			//JUnit Test ID:CP-7-AC&IS
			//Author (s): Riyadh & Yousef
			//Date Written: 18:58 26/04/2018
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
			//Date Written: 19:14 26/04/2018
			@Test
			public void TestaddEmail() {
				CompanyEmail email=new CompanyEmail("myemail@notts.com", "sendto@notts.com", "the title", "the message");
				obj.addEmail(email);
				assertSame(email.fromAddress(),"myemail@notts.com" );
				assertSame(email.toAddress(),"sendto@notts.com" );
				assertSame(email.subjectLine(),"the title" );
				assertSame(email.emailMessage(),"the message");
				

				
			}
			
			//JUnit Test ID:CP-9-GEFP
			//Author (s): Mohsin & Yousef
			//Date Written: 19:20 26/04/2018
			@Test
			public void TestgetEmailsForPhase() {
				CompanyEmail email=new CompanyEmail("myemail@notts.com", "sendto@notts.com", "the title", "the message");
				obj.addEmail(email);
				ArrayList[] ProjectEmails = new ArrayList[6];
				ProjectEmails[0]=obj.getEmailsForPhase();
				assertNotNull(ProjectEmails[0]);	
			}
			
			//JUnit Test ID:CP-10-GEFPI
			//Author (s): Mohsin & Yousef
			//Date Written: 19:28 26/04/2018
			//when we try to test for getEmailsForPhase(2) it does not work, it might be problem with max code or our test not sure
			@Test
			public void TestgetEmailsForPhaseWithInt() {
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
			//Date Written: 19:38 26/04/2018
			//when we try to test for getEmailsForPhase(2) it does not work, it might be problem with max code or our test not sure
			@Test
			public void TestnextPhase() {
				boolean x=obj.nextPhase();
				assertTrue(x);	
			}
			
			//JUnit Test ID:CP-12-NPHA
			//Author (s): Riyad & Yousef
			//Date Written: 19:40 26/04/2018
			@Test
			public void TestnextPhaseFalse() {
				obj.nextPhase();
				obj.nextPhase();
				obj.nextPhase();
				obj.nextPhase();
				obj.nextPhase();
				obj.nextPhase();
				boolean x=obj.nextPhase();
				assertFalse(x);	
			}
			
			
			//JUnit Test ID:CP-13-GPBN-CP-14-GPBN
			//Author (s): Riyad & Yousef
			//Date Written: 19:55 26/04/2018
			@Test
			public void TestgetPhaseByName() {
				String a="Feasibility";
				assertEquals(a,obj.getPhaseByName());	
			}
			
			//JUnit Test ID:CP-15-TSTR
			//Author (s): Riyad & Yousef
			//Date Written: 22:00 26/04/2018
			@Test
			public void TesttoString() {
				String a=obj.toString();
				assertEquals(a,"New Project" + " [" + "Feasibility" + "]");	
			}
			
			

}
