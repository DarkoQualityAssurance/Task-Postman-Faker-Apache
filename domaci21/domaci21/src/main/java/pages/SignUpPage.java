package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUpPage extends BasePage{

    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmPassword");
    private By signUpButton = By.xpath("//span[contains(text(), 'Sign me up')]");
    private By emailErrorMess = By.xpath("//div[contains(text(),'This field is required')]");
    private By passwordErrorMess = By.xpath("//div[contains(text(),'This field is required')]");


    public SignUpPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public By getNameField() {
        return nameField;
    }

    public void nameEnter(String text){
        getDriver().findElement(nameField).sendKeys(text);
    }

    public By getEmailField() {
        return emailField;
    }
    public String emailValues(){
        WebElement emailValue = getDriver().findElement(emailField);
        return emailValue.getAttribute("type");
    }
    public void emailClick(){
        getDriver().findElement(emailField).click();
    }


    public void emailEnter(String text){
        getDriver().findElement(emailField).sendKeys(text);
    }
    public void emailEnterbyname(String name){
        getDriver().findElement(emailField).sendKeys(name);
    }

    public By getPasswordField() {
        return passwordField;
    }
    public String passlValues(){
        WebElement passlValue = getDriver().findElement(passwordField);
        return passlValue.getAttribute("type");
    }

    public void passwordEnter(String text){
        getDriver().findElement(passwordField).sendKeys(text);
    }

    public By getConfirmPasswordField() {
        return confirmPasswordField;
    }
    public void confirmPassEnter(String text){
        getDriver().findElement(confirmPasswordField).sendKeys(text);
    }

    public By getSignUpButton() {
        return signUpButton;
    }
    public void signUpButtonPress(){
        getDriver().findElement(signUpButton).click();
    }

    public By getEmailErrorMess() {
        return emailErrorMess;
    }
    public String errorEmail(){
        WebElement errorOnEmail = getDriver().findElement(emailErrorMess);
        return errorOnEmail.getText();
    }

    public By getPasswordErrorMess() {
        return passwordErrorMess;
    }
    public String errorPassword(){
        WebElement errorOnPassword = getDriver().findElement(passwordErrorMess);
        return errorOnPassword.getText();
    }

    public void shortPassword(){
        passwordEnter("aaaa");
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"))));
        WebElement passError = getDriver().findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"));
        String expectedTextFromPassError = "This field must have no less than 5 characters";
        Assert.assertEquals(passError.getText(), expectedTextFromPassError);
    }
}



