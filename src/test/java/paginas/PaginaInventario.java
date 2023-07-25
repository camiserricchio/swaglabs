package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInventario {

	//Atributos
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement addBackPack;
	@FindBy(css="#add-to-cart-sauce-labs-bike-light")	
	WebElement addBikeLight;
	@FindBy(css="div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link")
	WebElement btnCart;
	
	//Constructor
	public PaginaInventario (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Acciones
	public void addBackPack() {
		addBackPack.click();
	}
	public void addBikeLight() {
		addBikeLight.click();
	}
	public void HacerClickEnbtnCart() {
		btnCart.click();
	}
}
