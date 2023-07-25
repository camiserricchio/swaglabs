package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCarrito {
	//Atributos
	@FindBy(id="checkout")
	WebElement btnCheckout;
	
	//Contructor
	public PaginaCarrito(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Acciones
	public void hacerClickenBtnCheckout() {
		btnCheckout.click();
	}
	

}
