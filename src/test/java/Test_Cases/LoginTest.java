package Test_Cases;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void Login_EODS()
    {
     Login.ClickWarningAcceptBtn();
     Login.EnterUserName(prop.getProperty("UserName"));
     Login.EnterPassword(prop.getProperty("Password"));


    }

}
