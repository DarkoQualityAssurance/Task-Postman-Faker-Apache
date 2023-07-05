package zadatak1;

/*
Testirati na stranici https://vue-demo.daniel-avellaneda.com signup stranicu.
●	 Verifikovati da se u url-u stranice javlja ruta "/signup". Verifikovati da atribut type u polju za unos email ima
vrednost "email" i za password da ima atribut type "password.
●	 Proveriti manuelno negativne slučajeve (nevalidan email, kratak password, nepopunjeni podaci…),
 a zatim za iste napraviti automatske testove za proveru greške ukoliko je prikazana.
  Pozitivni slučajevi nam ovde nisu od interesa. Poželjno je da bude minimum 5 testova.
●	Koristiti TestNG i dodajte before i after class metode.

 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Test {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void firstToDOMethod() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Laptop//Desktop//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @BeforeMethod
    public void allMethodDoing() throws InterruptedException {
        driver.get("https://vue-demo.daniel-avellaneda.com/");
        driver.manage().window().maximize();
        WebElement signUpOnFistPage = driver.findElement(By.xpath("//a[@href='/signup']"));
        signUpOnFistPage.click();
        Thread.sleep(2000);
    }

    @org.testng.annotations.Test
    public void singnUp() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Assert.assertTrue(driver.getCurrentUrl().contains("signup"));
    }

    @org.testng.annotations.Test
    public void emailCheckTest() {
        WebElement emailInput = driver.findElement(By.xpath("//*[@id='email']"));
        emailInput.click();
        WebElement nameUnput = driver.findElement(By.id("name"));
        nameUnput.click();
        WebElement errorOnEmail = driver.findElement(By.xpath("//div[contains(text(), 'This field is required')]"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'This field is required')]"))));
        WebElement thisFiledisMessage = driver.findElement(By.xpath("//div[contains(text(), 'This field is required')]"));
        String expectedMailText = "This field is required";
        Assert.assertEquals(thisFiledisMessage.getText(), expectedMailText);
    }

    @org.testng.annotations.Test
    public void emailTypeCheckTest() {

        WebElement emailType = driver.findElement(By.id("email"));
        String expectedTextForEmail = "email";
        Assert.assertEquals(emailType.getAttribute("type"), expectedTextForEmail);
    }

    @org.testng.annotations.Test
        public void passwordTypeCheckTest(){
    WebElement passwordType = driver.findElement(By.id("password"));
    String expectedTextFroPassword = "password";
        Assert.assertEquals(passwordType.getAttribute("type"),expectedTextFroPassword);

}

    @DataProvider(name = "testDataEMail")
    public Object[][] testDataMail() {
        return new Object[][]{
                {"darko.com"}, {"Darko.com"}, {"darko@gmail"},
                {"darko<djekic>@.gmail.com"}, {"12darko(2000).gmail.com"},
                {"d;nije125\"kakotreba@gmail.com"}
        };
    }

    @org.testng.annotations.Test(dataProvider = "testDataEMail")
    public void emailMeFeature(String name) throws InterruptedException {

        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys(name);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'Valid email is required')]"))));
        WebElement errorType = driver.findElement(By.xpath("//div[contains(text(), 'Valid email is required')]"));
        String expectedTextFromErrorMail = "Valid email is required";
        Assert.assertEquals(errorType.getText(), expectedTextFromErrorMail);
    }

    @org.testng.annotations.Test
    public void passwordCheck() {
        WebElement passCheck = driver.findElement(By.id("password"));
        passCheck.sendKeys("aaaa");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"))));
        WebElement passError = driver.findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"));
        String expectedTextFromPassError = "This field must have no less than 5 characters";
        Assert.assertEquals(passError.getText(), expectedTextFromPassError);
    }


    @AfterClass
    public void logOff() {
        driver.close();
    }

}





