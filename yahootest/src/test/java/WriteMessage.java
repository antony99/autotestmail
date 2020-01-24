import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WriteMessage {
    private WebDriver driver;

    WriteMessage(WebDriver driver) {
        this.driver = driver;
    }

    void enterUserMail() {
        driver.findElement(By.id("to")).sendKeys("gozietopfut");
    }

       void enterTopic() {
        driver.findElement(By.id("subject")).sendKeys("Тест");
    }

    void clickWriteMessage() {
        driver.findElement(By.cssSelector("div#app > div > table:nth-of-type(2) > tbody > tr:nth-of-type(2) > td > table > tbody > tr > td > a")).click();
    }

    void enterTextMessage() {
        driver.findElement(By.id("editorPlainText")).sendKeys("Тестовое сообщение");
    }

    void open() {
        driver.get("https://mail.yahoo.com/b/compose?.src=ym&amp%3Breason=unsupported_browser&amp%3Bncrumb=zgHbEiJncKk");
    }

    void clickOnSave(){
        driver.findElement(By.cssSelector("form#compose-form > table > tbody > tr:nth-of-type(3) > td > div > div > button:nth-of-type(2)")).click();
    }
    void clickOnSend(){
        driver.findElement(By.cssSelector("form#compose-form > table > tbody > tr:nth-of-type(3) > td > div > div > button")).click();
    }

    boolean atPage() {
        if (driver.getTitle().equals("Написать сообщение")) {
            return true;
        } else {
            return false;
        }
    }
}