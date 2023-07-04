package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{

    @Test
    public void verifySignupURL() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(getDriver().getCurrentUrl().contains("signup"));
    }

    @Test
    public void verifyEmptyEmailErrorMess() throws InterruptedException {
        getSignUpPage().signUpButtonPress();
        Thread.sleep(1000);
        Assert.assertEquals(getSignUpPage().errorEmail(), "This field is required");
    }

    @Test
    public void verifyEmptyPasswordErrorMess() throws InterruptedException {
        getSignUpPage().signUpButtonPress();
        Thread.sleep(1000);
        Assert.assertEquals(getSignUpPage().getPasswordErrorMess().getText(), "This field is required");

    }

    @Test
    public void verifyTypeInMail() {
        Assert.assertEquals(getSignUpPage().emailValues() , "email");
    }

    @Test
    public void verifyTypeInPassword() {
        Assert.assertEquals(getSignUpPage().passlValues(), "password");
    }

    @Test
    public void verifyUserInfo() throws InterruptedException {
        getSignUpPage().getDriver().navigate().refresh();
        getSignUpPage().nameEnter("Darko");
        getSignUpPage().emailEnter("darko@gmail.com");
        getSignUpPage().passwordEnter("darkodjekic");
        getSignUpPage().confirmPassEnter("darkodjekic");
        getSignUpPage().signUpButtonPress();

    }


    @DataProvider(name = "testDataEMail")
    public Object[][] testDataMail() {

        return new Object[][]{
                {"darko.com"}, {"Darko.com"}, {"darko@gmail"},
                {"darko<djekic>@.gmail.com"}, {"12darko(2000).gmail.com"},
                {"d;nije125\"kakotreba@gmail.com"}

        };

    }

    @Test(dataProvider = "testDataEMail")
    public void wrongInputInMail(String name) throws InterruptedException {
        getSignUpPage().emailEnterbyname(name);
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//div[contains(text(), 'Valid email is required')]"))));
        WebElement errorType = getDriver().findElement(By.xpath("//div[contains(text(), 'Valid email is required')]"));
        String expectedTextFromErrorMail = "Valid email is required";
        Assert.assertEquals(errorType.getText(), expectedTextFromErrorMail);
    }

    @Test
    public void varifyPasswordErrorMess(){
        getSignUpPage().shortPassword();
    }
}
