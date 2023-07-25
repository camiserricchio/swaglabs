package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCheckout {

	//Atributos
	@FindBy(id="finish")
	WebElement btnFinish;
	
	//Constructor
	public PaginaCheckout (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Acciones
	public void ClickearFinish() {
		btnFinish.click();
	}
}
