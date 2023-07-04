package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUpPage extends BasePage {
    private WebElement nameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement confirmPasswordField;
    private WebElement signUpButton;
    private WebElement emailErrorMess;
    private WebElement passwordErrorMess;


    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getNameField() {

        nameField = getDriver().findElement(By.id("name"));
        return nameField;
    }

    public void nameEnter(String text) {
        getNameField().sendKeys(text);
    }

    public WebElement getEmailField() {

        emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }


    public void emailEnter(String text) {
        getEmailField().sendKeys(text);
    }

    public void emailEnterbyname(String name) {
        getEmailField().sendKeys(name);
    }

    public WebElement getPasswordField() {

        passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }


    public void passwordEnter(String text) {
        getPasswordField().sendKeys(text);
    }

    public WebElement getConfirmPasswordField() {

        confirmPasswordField = getDriver().findElement(By.id("confirmPassword"));
        return confirmPasswordField;
    }

    public void confirmPassEnter(String text) {
        getConfirmPasswordField().sendKeys(text);
    }

    public WebElement getSignUpButton() {

        signUpButton = getDriver().findElement(By.xpath("//span[contains(text(), 'Sign me up')]"));
        return signUpButton;
    }

    public void signUpButtonPress() {
        getSignUpButton().click();
    }

    public WebElement getEmailErrorMess() {
        emailErrorMess = getDriver().findElement(By.xpath("//div[contains(text(),'This field is required')]"));
        return emailErrorMess;
    }

    public WebElement getPasswordErrorMess() {
        passwordErrorMess = getDriver().findElement(By.xpath("//div[contains(text(),'This field is required')]"));
        return passwordErrorMess;
    }

    public void shortPassword() {
        passwordEnter("aaaa");
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"))));
        WebElement passError = getDriver().findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"));
        String expectedTextFromPassError = "This field must have no less than 5 characters";
        Assert.assertEquals(passError.getText(), expectedTextFromPassError);
    }
}
