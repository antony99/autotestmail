import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class FirstTest {

    @Test

    public void navigateToMailRuAndAuth() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://login.yahoo.com/?.src=ym&.lang=ru-RU&.intl=ru&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");

        WebElement searchField = driver.findElement(By.id("login-username"));
        searchField.sendKeys("gozietopfut");

        WebElement searchButton = driver.findElement(By.id("login-signin"));
        searchButton.click();

        Thread.sleep(2000);

        WebElement searchField1 = driver.findElement(By.id("login-passwd"));
        searchField1.sendKeys("lolkekLl9");

        WebElement searchButton1 = driver.findElement(By.id("login-signin"));
        searchButton1.click();

        driver.get("https://mail.yahoo.com/b/?.src=ym&reason=unsupported_browser&toB=2&ncrumb=zgHbEiJncKk");

        Thread.sleep(2000);

        WebElement searchButton2 = driver.findElement(By.cssSelector("div#app > div > table:nth-of-type(2) > tbody > tr:nth-of-type(2) > td > table > tbody > tr > td > a"));
        searchButton2.click();

        WebElement searchField2 = driver.findElement(By.id("to"));
        searchField2.sendKeys("gozietopfut@gmail.com");

        WebElement searchField3 = driver.findElement(By.id("editorPlainText"));
        searchField3.sendKeys("Тестовое сообщение");

        WebElement searchField4 = driver.findElement(By.id("subject"));
        searchField4.sendKeys("Тест");

        WebElement searchButton3 = driver.findElement(By.cssSelector("form#compose-form > table > tbody > tr:nth-of-type(3) > td > div > div > button:nth-of-type(2)"));
        searchButton3.click();

        Thread.sleep(2000);

        WebElement searchButton4 = driver.findElement(By.cssSelector("form#compose-form > table > tbody > tr:nth-of-type(3) > td > div > div > button"));
        searchButton4.click();
    }
}