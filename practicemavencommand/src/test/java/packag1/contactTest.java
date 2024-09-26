package packag1;

import org.testng.annotations.Test;

public class contactTest {
	@Test
	public void createcontactTest() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);		
		System.out.println("execute create contact test");
	}
	
	@Test
	public void modifycontactTest() {
		System.out.println("execute modify contact tets");
	}
	@Test
	public void deletecontactTest() {
		System.out.println("execute delete contact tets");
	}

}
