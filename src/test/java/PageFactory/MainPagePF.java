package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPagePF {

    WebDriver driver;
    public MainPagePF (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final String baseURL = "http://demo.seleniumeasy.com/";

    public void navigation ()
    {
        driver.navigate().to(baseURL);
    }

    public void clickOnStartPractisingButton()
    {
        startPractisingButton.click();
    }

    public void clickOnSimpleFormListElement()
    {
        simpleFormListElement.click();
    }

    public void clickOnTextBox()
    {
        textbox.click();
    }
    public void enterMyNameIntoTheTextBox(String myName)
    {
        textbox.sendKeys(myName);
    }

    public void clickOnShowMessageButton()
    {
        showMessageButton.click();
    }

    public String showEnteredMessage ()
    {
        //WebElement element = driver.findElement(message2);
        return message.getText();

    }

    @FindBy (xpath = "//*[@id='btn_basic_example']")
    WebElement startPractisingButton;

    @FindBy (xpath = "//*[@id='basic']/div/a[1]")
    WebElement simpleFormListElement;

    @FindBy (xpath = "//*[@id='get-input']/div/input")
    WebElement textbox;

    @FindBy (xpath = "//*[@id='get-input']/button")
    WebElement showMessageButton;

    @FindBy (id = "display")
    WebElement message;

    //By message2 = By.id("display");


}
