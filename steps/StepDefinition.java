package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	public ChromeDriver driver;
	@Given("open the browser")
	public void openBrowser() {
		driver= new ChromeDriver();
	}
	@And("load the URL")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/login");
	}
	@Given("Enter the username as {string}")
	public void username(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

	}
	@And("Enter the password as {string}")
	public void password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("click on login button")
	public void loginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage should be loaded")
	public void VerifyhomePage() {
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Home page loaded");
		}
		else {
			System.out.println("Home page not loaded");
		}
	}
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");
	}
	@When("crmfsa link clicked")
	public void crmfsaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("click Leads link")
	public void ClickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("click Create Leads link")
	public void ClickCreateLeads() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter the company name as (.*)$")
	public void EnterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@And("Enter first Name as (.*)$")
	public void EnterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@And("Enter Last name as (.*)$")
	public void EnterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("click on create lead button")
	public void CreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("view lead page should be displayed")
	public void ViewLeadPage() {
		String title = driver.getTitle();
		if(title.contains("Viewlead")) {
			System.out.println("Viewlead page loaded");
		}
		else {
			System.out.println("Viewlead page not loaded");
		}
	}
}

