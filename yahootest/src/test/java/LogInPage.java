import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    private WebDriver driver;

    LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    void enterUserName() {
        driver.findElement(By.id("login-username")).sendKeys("gozietopfut");
    }

    void clickLoginName() {
        driver.findElement(By.id("login-signin")).click();
    }

    void enterPassword() {
        driver.findElement(By.id("login-passwd")).sendKeys("lolkekLl9");
    }

    void clickLoginPassword() {
        driver.findElement(By.id("login-signin")).click();
    }

    void open() {
        driver.get("https://login.yahoo.com/?.src=ym&.lang=ru-RU&.intl=ru&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
    }

    boolean atPage() {
        if (driver.getTitle().equals("gozietopfut@yahoo.com — Yahoo Почта")) {
            return true;
        } else {
            return false;
        }
    }
}