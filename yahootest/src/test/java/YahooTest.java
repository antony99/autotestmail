
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class YahooTest {

    private WebDriver driver;
    private LogInPage loginPage;
    private WriteMessage writeMessage;
    private StartPage startPage;
    private TextMailMessage textMailMessage;

    @BeforeTest
    public void setUp(String browserName) {
        WebDriver driver = new FirefoxDriver();
        loginPage = new LogInPage(driver);
        System.out.println("Тест начался");
    }

    @Test
    public void logInTest() throws InterruptedException {
        loginPage.open();
        assertTrue(loginPage.atPage());
        loginPage.enterUserName();
        loginPage.clickLoginName();
        Thread.sleep(10000);
        loginPage.enterPassword( );
        loginPage.clickLoginPassword();
        assertTrue(startPage.atPage());
    }

    @Test
    public void messageWrite() throws InterruptedException {
        writeMessage.open();
        assertTrue(writeMessage.atPage());
        writeMessage.enterUserMail();
        writeMessage.enterTopic();
        writeMessage.enterTextMessage();
        assertTrue(textMailMessage.atPage());
        writeMessage.clickOnSave();
        writeMessage.clickOnSend();
        Thread.sleep(10000);
    }

}
