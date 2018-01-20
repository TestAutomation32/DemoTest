package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    @FindBy(xpath="//input[@id='PlaceHolderMain_btnBehavior']")
    public WebElement WarningAccBtn;

    @FindBy(id = "PlaceHolderMain_pnlPassword_UserName")
    public WebElement UserNameTxtBox;

    @FindBy(xpath = "//input[@name='ctl00$PlaceHolderMain$pnlPassword$password']")
    public WebElement PasswordTxtBox;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement ContinueBtn;

   @FindBy(xpath ="//h1[text()='Welcome to CareerOrientation for Workplace.gov!']")
   public WebElement LoginTitleHeader;

   @FindBy(xpath="//input[@id='PlaceHolderMain_pnlPin_password']")
   public WebElement PinTextBox;

    public LoginPage ClickWarningAcceptBtn()
    {
        WebDriverWait WarningWait=new WebDriverWait(driver,30);
        WarningWait.until(ExpectedConditions.elementToBeClickable(WarningAccBtn));
        WarningAccBtn.click();

        return this;
    }
    public LoginPage EnterUserName(String name)
    {
        WebDriverWait NameWait=new WebDriverWait(driver, 30);
        NameWait.until(ExpectedConditions.elementToBeClickable(UserNameTxtBox));

        //UserNameTxtBox.clear();
        UserNameTxtBox.sendKeys(name);
        return this;
    }
    public LoginPage EnterPassword(String UrPass)
    {
        WebDriverWait PassWait=new WebDriverWait(driver,30);
        PassWait.until(ExpectedConditions.elementToBeClickable(PasswordTxtBox));

        //PasswordTxtBox.clear();
        PasswordTxtBox.sendKeys(UrPass);
        return this;
    }
    public LoginPage Click_ContinueBtn()
    {
        WebDriverWait ContinueWait=new WebDriverWait(driver,30);
        ContinueWait.until(ExpectedConditions.elementToBeClickable(ContinueBtn));

        ContinueBtn.click();
        return this;
    }
    public LoginPage Enter_Pin()
    {

        return this;
    }
    public LoginPage LoginPageHeaderTitle_ContinueBtn()
    {
        WebDriverWait loginTitleWait=new WebDriverWait(driver,30);
        loginTitleWait.until(ExpectedConditions.elementToBeSelected(LoginTitleHeader));

        String ActualLoginTitle=LoginTitleHeader.getTagName();
        String ExpectedLgTitle="Welcome to CareerOrientation for Workplace.gov!";
        if(ActualLoginTitle.equals(ExpectedLgTitle))
        {
            LoginTitleHeader.getText();
            Click_ContinueBtn();
        }

        return this;
    }
    public LoginPage EnterPin(String EnterUserPin)
    {
        WebDriverWait PinWait=new WebDriverWait(driver, 30);
        PinWait.until(ExpectedConditions.elementToBeClickable(PinTextBox));

        PinTextBox.sendKeys(EnterUserPin);
        return this;
    }



}
