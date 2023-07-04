package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends  BasePage{

    @FindBy(xpath = "//*[@id='app']/div/div/header/div/div[3]/a[4]/span")
    WebElement signUpLink;


    public IndexPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
        PageFactory.initElements(getDriver(),this);
    }


    public IndexPage open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/");
        return this;
    }

    public IndexPage clickOnSignUpLink(){
        signUpLink.click();
        return this;
    }
}
