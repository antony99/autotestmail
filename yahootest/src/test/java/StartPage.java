
public class StartPage {

    private LogInPage loginPage;

    public boolean atPage() {
        loginPage.enterUserName();
        loginPage.clickLoginName();
        return true;
    }

}
