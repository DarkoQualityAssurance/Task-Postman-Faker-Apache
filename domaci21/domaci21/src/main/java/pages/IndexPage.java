package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage{

    private By signUpLink = By.xpath("//*[@id='app']/div/div/header/div/div[3]/a[4]/span");

    public IndexPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public By getSignUpLink() {
        return signUpLink;
    }

    public void open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/");
    }

    public void clickOnSignUpLink(){
        getDriver().findElement(signUpLink).click();
    }
}
