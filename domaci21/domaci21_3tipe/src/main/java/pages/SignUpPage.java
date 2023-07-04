package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUpPage extends BasePage{
    @FindBy(id = "name")
    WebElement nameField;
    @FindBy(id = "email")
    WebElement emailField;
    @FindBy(id = "password")
    WebElement passwordFiled;
    @FindBy(id = "confirmPassword")
    WebElement confirmPasswordFiled;
    @FindBy(xpath = "//span[contains(text(), 'Sign me up')]")
    WebElement signUpButton;
    @FindBy(xpath = "//div[contains(text(),'This field is required')]")
    WebElement emailErrorMess;
    @FindBy(xpath = "//div[contains(text(),'This field is required')]")
    WebElement passwordErrorMess;


    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(getDriver(),this);
    }



    public SignUpPage nameEnter(String text) {
        nameField.sendKeys(text);
        return this;
    }

    public String emailValues() {
        return emailField.getAttribute("type");
    }

    public SignUpPage emailClick() {
        emailField.click();
        return this;
    }

    public SignUpPage emailEnter(String text) {
        emailField.sendKeys(text);
        return this;
    }

    public SignUpPage emailEnterbyname(String name) {
        emailField.sendKeys(name);
        return this;
    }

    public String passlValues() {
        return passwordFiled.getAttribute("type");
    }

    public SignUpPage passwordEnter(String text) {
        passwordFiled.sendKeys(text);
        return this;
    }



    public SignUpPage confirmPassEnter(String text) {
        confirmPasswordFiled.sendKeys(text);
        return this;
    }


    public SignUpPage signUpButtonPress() {
        signUpButton.click();
        return this;
    }


    public String errorEmail() {
        return emailErrorMess.getText();
    }

    public WebElement getPasswordErrorMess() {
        passwordErrorMess = getDriver().findElement(By.xpath("//div[contains(text(),'This field is required')]"));
        return passwordErrorMess;
    }


    public SignUpPage shortPassword() {
        passwordEnter("aaaa");
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"))));
        WebElement passError = getDriver().findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"));
        String expectedTextFromPassError = "This field must have no less than 5 characters";
        Assert.assertEquals(passError.getText(), expectedTextFromPassError);
        return this;
    }
}
