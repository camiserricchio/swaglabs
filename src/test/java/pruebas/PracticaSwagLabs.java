package pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import paginas.PaginaCarrito;
import paginas.PaginaCheckout;
import paginas.PaginaInformacionCheckout;
import paginas.PaginaInventario;
import paginas.PaginaLogin;

public class PracticaSwagLabs {
	String url = "https://www.saucedemo.com/";
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() {
		//Log In
		PaginaLogin login = new PaginaLogin(driver);
		login.escribirUsername("standard_user");
		login.escribirPassword("secret_sauce");
		login.hacerClickEnBtnLogin();
		
		//Agregar productor al carrito e ir al carrito
		PaginaInventario inventario = new PaginaInventario(driver);
		inventario.addBackPack();
		inventario.addBikeLight();
		inventario.HacerClickEnbtnCart();
		
		//Checkout
		PaginaCarrito checkout = new PaginaCarrito(driver);
		checkout.hacerClickenBtnCheckout();
		
		//Completar Info CheckOut
		PaginaInformacionCheckout info = new PaginaInformacionCheckout(driver);
		info.EscribirFirstName("Matilde");
		info.EscribirLastName("Rosales");
		info.EscribirCodigoPostal("1687");
		info.HacerClickEnContinue();
		
		//Checkout
		PaginaCheckout finish =new PaginaCheckout (driver);
		finish.ClickearFinish();
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
		
	}
	
}