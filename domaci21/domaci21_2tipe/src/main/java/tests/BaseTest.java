package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.IndexPage;
import pages.SignUpPage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private IndexPage indexPage;
    private SignUpPage signUpPage;


    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public IndexPage getIndexPage() {
        return indexPage;
    }
    public SignUpPage getSignUpPage(){
        return signUpPage;
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Laptop//Desktop//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        indexPage = new IndexPage(driver, wait);
        signUpPage = new SignUpPage(driver,wait);
    }

    @BeforeMethod
    public void beforeEachTest() throws InterruptedException {
        getDriver().manage().window().maximize();
        getIndexPage().open();
        getIndexPage().clickOnSignUpLink();
        Thread.sleep(1000);
    }

    @AfterClass
    public void end(){
        driver.close();
    }
}
