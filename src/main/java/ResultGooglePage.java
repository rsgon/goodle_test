import org.openqa.selenium.WebDriver;

public class ResultGooglePage {
	
	public WebDriver webDriver;
	
	public ResultGooglePage(WebDriver driver) {
		this.webDriver = driver;
	}

	public boolean isOpened(){
		return !webDriver.getCurrentUrl().equals("http://www.google.com/");
	}
}
