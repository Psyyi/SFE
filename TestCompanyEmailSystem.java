package cw2;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class TestCompanyEmailSystem {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	CompanyEmailSystem emailSys = new CompanyEmailSystem();
	//JUnit Test ID: 
	//Author(s): Hashim & Mohsin
	//Date Written: 
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Mohsin
	//Date Written: 
	//Reason: check if an object is created from the constructor
	@Test
	public void testCreateSystem() {
		assertNotNull(new CompanyEmailSystem());
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Mohsin
	//Date Written: 
	//Reason: Test if the program output "What do you want to do?\n P = List [P]rojects, [num] = Open Project [num], A = [A]dd Project, X = E[x]it\r\n" when you first run it
	@Test
	public void testNewSystemPrint() {
		emailSys.main(null);
		assertEquals(outContent.toString(),"What do you want to do?\n P = List [P]rojects, [num] = Open Project [num], A = [A]dd Project, X = E[x]it\r\n");
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Feras
	//Date Written: 
	//Reason: Test if user input wrong text, the message "Command not recognised" is outputted.
	@Ignore
	public void testInvalidInput() {
		String invalidInput = "AKLIFISF";
			InputStream in = new ByteArrayInputStream(invalidInput.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("Command not recognised"));
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Feras
	//Date Written: 
	//Reason:Test if user input "P",a list of projects will appear
	@Test
	public void testListProjects() {
		
		String input = "P";
			InputStream in = new ByteArrayInputStream(input.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("1) Proj1 [Feasibility] - 4emails\r\n" + 
				"2) Proj2 [Feasibility] - 3emails\r\n" + 
				"3) Proj3 [Feasibility] - 3emails"));
	}
	
	
	//JUnit Test ID: 
	//Author(s): Hashim & Feras
	//Date Written: 
	//Reason:Test if user input "A",a message"What is the title of the project?\r\n"
	@Test
	public void testListAdd() {
		CompanyEmailSystem emailSys = new CompanyEmailSystem();
		String input = "A";
			InputStream in = new ByteArrayInputStream(input.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("What is the title of the project?\r\n"));
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Feras
	//Date Written: 
	//Reason:Test if user input "X",a message"Goodbye!" will be outputted
	@Test
	public void testExitSoftware() {
		String input = "X";
			InputStream in = new ByteArrayInputStream(input.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("Goodbye!"));
	}
	
	
	//JUnit Test ID: 
	//Author(s): Yousef & Feras
	//Date Written: 
	//Reason:Test if user input "P" then "1",a message"L = [L]ist Emails, A = [A]dd Email, F = List Phase [F]olders..." will be outputted
	@Test
	public void testNum1() {
		String input = "P";
			InputStream in = new ByteArrayInputStream(input.getBytes());
			System.setIn(in);
			input = "1";
			in = new ByteArrayInputStream(input.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("L = [L]ist Emails"));
	}
	
	//JUnit Test ID: 
	//Author(s): Yousef & Feras
	//Date Written:
	//Reason:Test if user input "P"then "2",a message"L = [L]ist Emails, A = [A]dd Email, F = List Phase [F]olders..." will be outputted
	@Test
	public void testNum2() {
		String input = "P";
			InputStream in = new ByteArrayInputStream(input.getBytes());
			System.setIn(in);
			input = "2";
			in = new ByteArrayInputStream(input.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("L = [L]ist Emails"));
	}
	
	
	//JUnit Test ID: 
	//Author(s): Yousef & Feras
	//Date Written: 
	//Reason:Test if user input "P"then "3",a message"L = [L]ist Emails, A = [A]dd Email, F = List Phase [F]olders..." will be outputted
	@Test
	public void testNum3() {
		String input = "P";
			InputStream in = new ByteArrayInputStream(input.getBytes());
			System.setIn(in);
			input = "3";
			in = new ByteArrayInputStream(input.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("L = [L]ist Emails"));
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Feras
	//Date Written: 
	//Reason:Test if a user inputted "P" then "1" then "A" then "email" then "email" then "subject" then "message", a message "Email added to.."will be outputted
	@Test
	public void testAddEmail() {
		CompanyEmailSystem emailSys = new CompanyEmailSystem();
		String routeAddEmail = "P\r\n" + "1\r\n" + "A\r\n" + "psyhh1@ad.nottingham.ac.uk\r\n" + "enymrmen@ad.nottingham.ac.uk\r\n" + "Subject\r\n" + "Message\r\n";
			InputStream in = new ByteArrayInputStream(routeAddEmail.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("Email added to")); 
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Feras
	//Date Written: 
	//Reason:Test if a user inputted "P" then "1" then "L", a message containing "from","subject","2) me6@me.com - this is a test subject for email6" will be outputted
	@Test
	public void testListEmails() {
		CompanyEmailSystem emailSys = new CompanyEmailSystem();
		String routeListEmail = "P\r\n" + "1\r\n" + "L";
			InputStream in = new ByteArrayInputStream(routeListEmail.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("From") && outContent.toString().contains("Subject") && outContent.toString().contains("2) me6@me.com - this is a test subject for email6") );
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Riyadh
	//Date Written: 
	@Test
	public void testListPhases() {
		CompanyEmailSystem emailSys = new CompanyEmailSystem();
		String routeListEmail = "P\r\n" + "1\r\n" + "F";
			InputStream in = new ByteArrayInputStream(routeListEmail.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("1) Feasibility - 4 Emails") );
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Riyadh
	//Date Written: 
	@Test
	public void testListContacts() {
		CompanyEmailSystem emailSys = new CompanyEmailSystem();
		String routeListEmail = "P\r\n" + "1\r\n" + "C";
			InputStream in = new ByteArrayInputStream(routeListEmail.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("1) me0@me.com\r\n" + 
				"2) me3@me.com\r\n" + 
				"3) me6@me.com\r\n" + 
				"4) me9@me.com") );
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Riyadh
	//Date Written: 
	@Test
	public void testChangeProjectPhase() {
		CompanyEmailSystem emailSys = new CompanyEmailSystem();
		String routeListEmail = "P\r\n" + "1\r\n" + "N";
			InputStream in = new ByteArrayInputStream(routeListEmail.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("[Phase changed: Proj1 [Design]") );
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Riyadh
	//Date Written: 
	@Test
	public void testChangeProjectMulti() {
		CompanyEmailSystem emailSys = new CompanyEmailSystem();
		String routeListEmail = "P\r\n" + "1\r\n" + "N\r\n" + "N\r\n" + "N\r\n" + "N\r\n"+ "N";
			InputStream in = new ByteArrayInputStream(routeListEmail.getBytes());
			System.setIn(in);
		emailSys.main(null);
		assertTrue(outContent.toString().contains("[Phase changed: Proj1 [Completed]") );
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Riyadh
	//Date Written: 
	@Test
	public void testExitProject() {
	
	}
	
	//JUnit Test ID: 
	//Author(s): Hashim & Riyadh
	//Date Written: 
	@Test
	public void testCmdNotRecognisedInProject() {

	}
	
	
	
	//JUnit Test ID: 
	//Author(s): Hashim & Riyadh
	//Date Written: 
	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}
}
