package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrehireDashboard_Page {

    public WebDriver driver;
    public PrehireDashboard_Page(WebDriver driver)
    {
        this.driver=driver;
    }

    @FindBy(xpath="")
    public WebElement AboutMe;
}
