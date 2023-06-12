package luma.us.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.us.basepage.LumaBasePage;

public class Hooks extends LumaBasePage{
	@Before
	public void getSetUp() {
		LumaBasePage.startAutomation();
		
		
	}
	
	@After
	public void tearDown() {
		
		//driver.quit();
		
		
	}

}
