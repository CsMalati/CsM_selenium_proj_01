package StepDefinitions;

import PageFactory.MainPagePF;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MainPageTest
{
    static WebDriver driver;
    MainPagePF mainPagePF = new MainPagePF(driver);


    @Before
    public static void before()
    {
    //    WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        driver.manage().window().maximize();
    }

    /*@After
    public static void close()
    {
        driver.close();
    }*/

    @Given("user is navigated to the Selenium Easy homepage")
    public void user_is_navigated_to_the_selenium_easy_homepage() {
        mainPagePF.navigation();
    }
    @Given("click on Start Practising button")
    public void click_on_start_practising_button() {
        mainPagePF.clickOnStartPractisingButton();
    }
    @Given("click on simple form demo option")
    public void click_on_simple_form_demo_option() {
        mainPagePF.clickOnSimpleFormListElement();
    }
    @When("enter a text into the form")
    public void enter_a_text_into_the_form() {
       // mainPagePF.clickOnTextBox();
        mainPagePF.enterMyNameIntoTheTextBox("Csilla");
    }
    @When("click on Show Message button")
    public void click_on_show_message_button() {
       mainPagePF.clickOnShowMessageButton();
    }
    @Then("the text you entered will be visible below")
    public void the_text_you_entered_will_be_visible_below() {
        Assertions.assertEquals("Csilla",mainPagePF.showEnteredMessage());
    }

}
