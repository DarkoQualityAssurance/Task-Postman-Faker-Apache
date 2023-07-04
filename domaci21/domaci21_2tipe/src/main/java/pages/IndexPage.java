package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage {

    private WebElement signUpLink;

    public IndexPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public WebElement getSignUpLink() {
        this.signUpLink = getDriver().findElement(By.xpath("//*[@id='app']/div/div/header/div/div[3]/a[4]/span"));
        return signUpLink;
    }

    public void open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/");
    }

    public void clickOnSignUpLink(){
        getSignUpLink().click();
    }
}
