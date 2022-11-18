package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class stepDefenition {
	WebDriver driver;
	String macValue; 
	
	@Given("^User have opened the browser$")
	public void setup() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver.exe");
		///DemoblazeQA/DemoblazeTest/src/main/java/testing/stepDefenition.java
		driver = new ChromeDriver();
	}

	@And("^User have opened Demoblaze website$")
	public void navegation() throws Throwable {
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("^User have accessed index page$")
	public void goToIndex() throws Throwable {
		firstTest pom = new firstTest(driver);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			pom.goToIndex();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element not found");
		}
	}

	@And("^have gonne to the Laptops section$")
	public void clickLaptos() throws Throwable {
		firstTest pom = new firstTest(driver);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			pom.clickLaptos();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element not found");
		}
	}

	@And("^have Found MacBook Pro$")
	public void findMacPro() throws Throwable {
		firstTest pom = new firstTest(driver);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			macValue= pom.getMacValue();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			pom.clickMackPro();
			
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element not found");

		}
	
	}

	@Then("^add it to cart$")
	public void addToChart() throws Throwable {
		firstTest pom = new firstTest(driver);
		try {
			pom.clickBtn();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element not found");
		}

	}

	@When("^User have opened cart$")
	public void oppenCart()throws Throwable {
		firstTest pom = new firstTest(driver);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			pom.openCart();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element not found");
		}
	}

	@When("^User have placed order$")
	public void placeOrder()throws Throwable {
		firstTest pom = new firstTest(driver);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			pom.placeOrder();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element not found");
		}
	}

	
	@When("have filed name as {string} And country as {string}  And city as {string} And creditCard as {string} And month as {string} And Year as {string}")
	public void have_filed_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as(String string, String string2, String string3, String string4, String string5, String string6) {
		firstTest pom = new firstTest(driver);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			pom.fillOrder( string, string2, string3, string4, string5, string6);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element not found");

		}
	}
	

	@Then("Verify the purchase confirmation contains And If name is equal {string}")
	public void verifyPurchase(String string) {
		firstTest pom = new firstTest(driver);
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			pom.verifyInfo(string,macValue);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element not found");

		}

	}
}
