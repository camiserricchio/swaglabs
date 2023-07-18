package Edit.SwagLabs;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticaSwagLabs {

	String url = "https://www.saucedemo.com/";
	
@Test
public void CrearOrdenDeCompra () {
	//Abrir navegador
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	//Login
	WebElement username = driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("secret_sauce");
	
	WebElement btnLogin = driver.findElement(By.id("login-button"));
	btnLogin.click();
	
	//Agregar producto al carrito
	
	WebElement addBackPack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	addBackPack.click();
	
	WebElement car = driver.findElement(By.id("shopping_cart_container"));
	car.click();
	
	//Checkout
	
	WebElement checkout = driver.findElement(By.name("checkout"));
	checkout.click();
	
	WebElement firstName = driver.findElement(By.id("first-name"));
	firstName.sendKeys("Fernando");
	
	WebElement lastName = driver.findElement(By.name("lastName"));
	lastName.sendKeys("Rodriguez");
	
	WebElement postalCode = driver.findElement(By.name("postalCode"));
	postalCode.sendKeys("1785");
	
	WebElement btncontinue = driver.findElement(By.name("continue"));
	btncontinue.click();
	
	WebElement btnFinish = driver.findElement(By.id("finish"));
	btnFinish.click();
	
	//Cerrar navegador
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

