import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	public WebDriver webDriver;
	private String GOOGLE_URL = "http://www.google.com";
	private By searchField = By.name("q");
	private By searchButton2 = By.xpath("//input[@type='submit']");

	public GoogleSearchPage(WebDriver driver) {
		this.webDriver = driver;
	}

	public GoogleSearchPage open() {
		webDriver.get(GOOGLE_URL);
		return this;
	}

	public void search(String string) {
		WebElement element =  webDriver.findElement(searchField);
		element.sendKeys(string);
	}

	public ResultGooglePage pressSearchButton() {
		webDriver.findElement(searchButton2).click();
		return new ResultGooglePage(webDriver);
	}
}
