package PageFactory;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MainPagePF {

    static WebDriver driver;

    public MainPagePF (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    private final String baseUrl = "https://demo.seleniumeasy.com/";
    @FindBy (xpath = "//*[@id=\"btn_basic_example\"]")
    WebElement startPractisingButton;
    @FindBy (xpath = "//*[@id=\"basic\"]/div/a[1]")
    WebElement simpleFormListElement;
    @FindBy (xpath = "//*[@id=\"get-input\"]/div/input")
    WebElement textBox;
    @FindBy (xpath = "//*[@id=\"get-input\"]/button")
    WebElement showMessageButton;
    @FindBy (id = "display")
    WebElement message;



    public void navigation ()
    {
        driver.navigate().to(baseUrl);
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
        textBox.click();
    }

    public void enterMyNameIntoTexBox(String myName)
    {
        textBox.sendKeys(myName);
    }

    public void clickOnShowMessageButton()
    {
        showMessageButton.click();
    }

    public String showEnteredMessage()
    {
        return message.getText();
    }


}
