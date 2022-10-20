package testing;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class firstTest {
	WebDriver driver = null;
	
	By index = By.cssSelector("#nava");
	By laptops = By.linkText("Laptops");
	By mackPro = By.xpath("/html/body/div[5]/div/div[2]/div/div[6]/div/div/h4/a");
	By mackProValue = By.xpath("/html/body/div[5]/div/div[2]/div/div[6]/div/div/h5");
	By btn = By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a");
	By cart = By.cssSelector("#cartur");
	By placeOrder = By.xpath("/html/body/div[6]/div/div[2]/button");
	By orderInfo = By.cssSelector("#orderModalLabel");
	By userName = By.cssSelector("#name");
	By userCountry= By.cssSelector("#country");
	By userCity = By.cssSelector("#city");
	By userCreditCard = By.cssSelector("#card");
	By month = By.cssSelector("#month");
	By year = By.cssSelector("#year"); 
	By sendOrder = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
	By purchaseInfo = By.xpath("/html/body/div[10]/p");
	


	public firstTest(WebDriver driver) {
		this.driver = driver;
	}
	public void goToIndex() {
		
		driver.findElement(index).click();
	}
	public void clickLaptos() {
		driver.findElement(laptops).click();	
	} 
	public String getMacValue() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement anchorValue = driver.findElement(mackProValue);
		js.executeScript("window.scrollBy(0,-350)","");
		System.out.println("value: "+anchorValue.getText());
		return anchorValue.getText().substring(1);
	}
	public void clickMackPro() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)","");
		WebElement anchors = driver.findElement(mackPro);
		anchors.click();
		System.out.println("element mack click");

	}
	public void clickBtn() {
		
		  WebElement anchors = driver.findElement(btn);
		  anchors.click();
		  		
	}
	public void openCart() {
		driver.findElement(cart).click();
	}
	
	public void placeOrder() {
		driver.findElement(placeOrder).click();
	}
	
	public void fillOrder(String name, String country, String city,String creditCard, String monthNum, String yearNum) {
		if(!driver.findElements(orderInfo).isEmpty()) {
			driver.findElement(userName).sendKeys(name);
			driver.findElement(userCountry).sendKeys(country);
			driver.findElement(userCity).sendKeys(city);
			driver.findElement(userCreditCard).sendKeys(creditCard);
			driver.findElement(month).sendKeys(monthNum);
			driver.findElement(year).sendKeys(yearNum);
			driver.findElement(sendOrder).click();
			
			
		}else {
			System.out.println("Element not found");
		}
	}
	
	public void verifyInfo(String name, String value) {
		String bodyText=driver.findElement(purchaseInfo).getText();
		System.out.println("Purchase confirmation: \n"+ bodyText);
		System.out.println("The Order Id displayed?: "+ bodyText.contains("Id"));
		System.out.println("The amount paid, equals the expected?: "+ bodyText.contains(value));
		System.out.println("val: "+ value);
		System.out.println("The displayed name is equal to the mocked information?: "+ bodyText.contains(name.toString()));
		
	}
}
