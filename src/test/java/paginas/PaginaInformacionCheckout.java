package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInformacionCheckout {
	//Atributos
	@FindBy(name="firstName")
	WebElement txtfirstName;
	@FindBy(name="lastName")
	WebElement txtlastName;
	@FindBy(name="postalCode")
	WebElement txtpostalCode;
	@FindBy(name="continue")
	WebElement btnContinue;
	
	//Constructor
	public PaginaInformacionCheckout (WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
		
	//Acciones
	public void EscribirFirstName (String FirstName) {
		txtfirstName.sendKeys(FirstName);
	}
	public void EscribirLastName (String LastName) {
		txtlastName.sendKeys(LastName);
	}
	public void EscribirCodigoPostal (String PostalCode) {
		txtpostalCode.sendKeys(PostalCode);
	}
	public void HacerClickEnContinue() {
		btnContinue.click();
	}

}
