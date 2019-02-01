import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class GoogleSearchTest {

	WebDriver webDriver;
	GoogleSearchPage googleSearchPage;
	ResultGooglePage resultGooglePage;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
		if (webDriver != null) {
			webDriver.quit();
		}
	}

	@Test
	public void searchInGoogleByWorldTest() {
		googleSearchPage = new GoogleSearchPage(webDriver);
		googleSearchPage.open().search("Text");
		resultGooglePage = googleSearchPage.pressSearchButton();
		assertEquals(true, resultGooglePage.isOpened());
	}

}
