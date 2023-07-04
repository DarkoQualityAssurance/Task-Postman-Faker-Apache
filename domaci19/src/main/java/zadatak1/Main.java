package zadatak1;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Users//Laptop//Desktop//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        Faker faker = new Faker();
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys(faker.name().fullName());
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement currentAddress = driver.findElement(By.cssSelector("#currentAddress"));
        currentAddress.sendKeys(faker.address().city());
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(faker.address().city());
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        WebElement name = driver.findElement(By.id("name"));
        WebElement emailCheck = driver.findElement(By.id("email"));
        WebElement addressCheck = driver.findElement(By.id("currentAddress"));
        WebElement address2Check = driver.findElement(By.id("permanentAddress"));


        if (name.getText().contains(fullName.getText()) && emailCheck.getText().contains(email.getText()) && addressCheck.getText().contains(currentAddress.getText()) && address2Check.getText().contains(permanentAddress.getText())){
            System.out.println("Test pass , Info are the same !");
        }else {
            System.out.println("Test failed , Info not the same !");
        }


    }
}
