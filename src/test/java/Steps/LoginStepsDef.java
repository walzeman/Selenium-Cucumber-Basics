package Steps;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by wayenew on 4/22/17.
 */
public class LoginStepsDef {

    WebDriver driver;


    @Given("^i navigate to the login page$")
    public void i_navigate_to_the_login_page() throws Throwable {


       System.setProperty("webdriver.chrome.driver","/Users/wayenew/Downloads/chromedriver");
        driver = new ChromeDriver();


//        System.setProperty("webdriver.gecko.driver","/Users/wayenew/Downloads/geckodriver");
//        driver = new FirefoxDriver();

        driver.manage().window().fullscreen();


        driver.get("http://executeautomation.com/demosite/Login.html");



        Thread.sleep(2000);
    }

    @When("^i enter the username as admin and password as admin$")
    public void i_enter_the_username_as_admin_and_password_as_admin() throws Throwable {

        driver.findElement(By.name("UserName")).sendKeys("Sapphire");
        Thread.sleep(2000);
        driver.findElement(By.name("Password")).sendKeys("team10");


    }

    @When("^i click the login button$")
    public void i_click_the_login_button() throws Throwable {

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("p:last-child input")).click();

    }

    @Then("^i should see the user form page$")
    public void i_should_see_the_user_form_page() throws Throwable {

        Thread.sleep(2000);

        System.out.println(driver.getTitle());

      driver.quit();

    }
}
