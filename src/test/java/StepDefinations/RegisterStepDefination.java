package StepDefinations;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class RegisterStepDefination {

    WebDriver driver;
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(1000);

    @Given("^User able to open browser$")
    public void user_able_to_open_browser() {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Given("^Enter Url$")
    public void enter_Url() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @Then("^User click on Rgister Link$")
    public void user_click_on_Rgister_Link(){
        driver.findElement(By.className("ico-register")).click();

    }


    @Then("^User select the Gender option$")
    public void user_select_the_Gender_option() {
        driver.findElement(By.xpath("//*[text()='Male']")).click();
    }

    @Then("^User insert the fist name$")
    public void user_insert_the_fist_name() {
        driver.findElement(By.id("FirstName")).sendKeys("paresh");
    }

    @Then("^User insert the last name$")
    public void user_insert_the_last_name() {
        driver.findElement(By.id("LastName")).sendKeys("patel");
    }

    @Then("^User insert the email id$")
    public void user_insert_the_email_id() {
        driver.findElement(By.id("Email")).sendKeys("paresh"+ randomInt +"@gmail.com");
    }
    @Then("^User Enter the company name , password and confirm password$")
    public void user_Enter_the_company_name_password_and_confirm_password() {
        driver.findElement(By.id("Company")).sendKeys("www.nopcommerce.com");
        driver.findElement(By.id("Password")).sendKeys("123456789");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
    }

    @Then("^User select the DOB$")
    public void user_select_the_DOB() {
        driver.findElement(By.xpath("//*[text()='3']")).click();
        driver.findElement(By.xpath("//*[text()='May']")).click();
        driver.findElement(By.xpath("//*[text()='1995']")).click();
    }

    @Then("^User Click on register button$")
    public void user_Click_on_register_button() {
        driver.findElement(By.id("register-button")).click();
    }

    @Then("^User close the browser$")
    public void user_close_the_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

}
