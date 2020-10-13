package PruebasAutomatizadas;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Casos_de_prueba {
	
	private static WebDriver driver;

	/*Scenario: Ingresar al home de falabella desde google */
	@Given("^el usuario se encuentra en google$")
	public void Usuario_en_google() throws Throwable	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automatización\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.cl");
		System.out.println("Estoy en google");

		}
	
	@When("^el usuario busca por la palabra falabella y selecciona el primer resultado de google$")
	public void Ingresar_a_falabella() throws Throwable	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("falabella");
		driver.findElement(By.name("q")).submit();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3/span")).click();
	}
	
	@Then("^Usuario ingresa al home de falabella y Productos son desplegados$")
	public void Usuario_en_falabella()throws Throwable	{

	}
	
		
	/*Scenario: ingresar al ecommerce seleccionando un producto */
	@Given ("^el usuario se encuentra en el home de falabella$")
	public void Home_Falabella()throws Throwable	{
		System.out.println("Estoy en el home de falabella");
	}

	@When ("^el usuario busca producto desde el home$")
	public void selecciona_primer_producto()throws Throwable	{
		/* dadas las caracteristicas de lo solicitado, se selecciona un producto electronico
		 * para poder seleccionar la garantia extendida */
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[3]/div/div[1]/div/div[1]/div/input")).sendKeys("Aire Acondicionado");
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[3]/div/div[1]/div/div[1]/div/input")).sendKeys(Keys.ENTER);
	}
	
	@Then ("^usuario ingresa al ecommerce$")
	public void usuario_ingresa_ecommerce()throws Throwable	{
		System.out.println("Ingrese en el ecommerce de falabella");
	}
	
	/*Scenario: Ingresar al detalle de un producto*/
	@Given("^el usuario se encuentra en el ecommerce$")
	public void Ecommerce_Falabella()throws Throwable	{
		System.out.println("Estoy en el ecommerce de falabella");		
	}
	@When("^el usuario selecciona el primer producto del ecommerce$") 
	public void cambiar8()throws Throwable	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/section[2]/div/div[2]/div[3]/div/div[1]/div[1]/a/img")).click();
	}
	@Then("^usuario se encuentra en el detalle de un producto$")
	public void cambiar9()throws Throwable	{
		System.out.println("Ingrese en el detalle de un producto");
	}
	
	
	/*Scenario: Agregar Producto a la bolsa*/
	
	@Given("^el usuario se encuentra en el detalle de un producto$") 
	public void cambiar10()throws Throwable	{
		System.out.println("Estoy en el detalle de un producto");
	}
	@When("^usuario presiona boton agregar a la bolsa de compras y luego presiona el boton ver la bolsa de compras$") 
	public void cambiar11()throws Throwable	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"buttonForCustomers\"]/button")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"linkButton\"]")).click();
	}

	@Then("^usuario se encuentra en la bolsa de compras$") 
	public void cambiar13()throws Throwable	{
		System.out.println("ingrese a la bolsa de compras");
	}
	
	
	/*Scenario: Aumentar cantidad y agregar garantia extendida*/ 
	@Given("^El usuario se encuentra en la bolsa de compras y Tiene un producto en la bolsa$") 
	public void cambiar14()throws Throwable	{
		System.out.println("Estoy en la bolsa de compras");
	}
	@When("^El usuario presiona el boton aumentar la cantidad y el usuario agrega garantia extendida$") 
	public void cambiar15()throws Throwable	{
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.className("increase")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[1]/section/section/div/div/div/form/div/a")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/section/section/div/div/div/form/div/div/ul/li[4]/a")).click();

	}
	
	@Then("^Se agrego un producto mas a la bolsa y ambos con garantia extendida y Se actualiza precio$") 
	public void cambiar16()throws Throwable	{
		System.out.println("Prueba Finalizada");
	}	
	
	
	
	
	
	
	
	
	
	
	
}
	
	