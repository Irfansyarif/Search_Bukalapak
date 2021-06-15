package SearchStep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class BukalapakSearch {

	WebDriver driver = null; 
	@Given("Browser is open")
	public void browser_is_open() {			
		System.out.println("Inside Step-browser is open");
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/eclipse-workspace/Testing/src/test/resources/Driver/chromedriver.exe");
	driver = new ChromeDriver();
	
	}

	@And("user is on bukalapak search page")
	public void user_is_on_bukalapak_search_page() {	
		System.out.println("Inside Step- user is on bukalapak search page");
		driver.navigate().to("https://www.bukalapak.com/");
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {	
		System.out.println("Inside Step- user enter a text in search box");
		driver.findElement(By.name("search[keywords]")).sendKeys("samsung a12");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step- hits enter");
		driver.findElement(By.name("search[keywords]")).sendKeys(Keys.ENTER);
				}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step-user is navigated to search results");	
		driver.findElement(By.xpath("//*[@id=\"product-explorer-container\"]/div/div[1]/div[2]/div/div[2]/div[3]/div/div[3]/div/div/div[1]/figure/div/div[1]/a")).click();
	}
}
