package Tests;

import org.junit.Assert;
import org.junit.Test;

import JUnit.TestBase;
import POMs.HomePageObject;

public class HomePageTests extends TestBase {
	
	@Test
	public void VerifyHomeLink(){
		// Navigate to and initialize the "home" page
		HomePageObject homePageObject = HomePageObject.NavigateAndInitialize(driver, baseUrl);
		// Assert the home link's text is the expected value
		Assert.assertEquals("Tim's Projects and Blog", homePageObject.linkHome.getText());
	}
}
