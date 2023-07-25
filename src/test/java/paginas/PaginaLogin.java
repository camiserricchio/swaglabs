package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaLogin {
	//Atributos
	@FindBy(name="user-name")
	WebElement txtUsername;
	@FindBy (id="password")
	WebElement txtPassword;
	@FindBy (css="#login-button")
	WebElement btnLogin;
	
	//Constructor
	public PaginaLogin (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Acciones
	
	public void escribirUsername (String username) {
		txtUsername.sendKeys(username);
	}
	public void escribirPassword (String password) {
		txtPassword.sendKeys(password);
	}
	public void hacerClickEnBtnLogin () {
		btnLogin.click();
	}
	
	
	

}
