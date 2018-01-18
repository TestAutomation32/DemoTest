package Test_Cases;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public LoginPage Login;
    public WebDriver driver;
    public Properties prop=null;


    @BeforeSuite
    public void BeforeSetup()
    {
        ReadData();
        /*
        //APPLICATION DID NOT LAUNCH WHEN RUNNING CHROME-DRIVER
       System.setProperty("Webdriver.chrome.driver",prop.getProperty("ChromeDriver"));
       driver=new ChromeDriver();
       */
        System.setProperty("webdriver.gecko.driver", prop.getProperty("GeckoDriver"));
        driver=new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get(prop.getProperty("URL"));


        //PAGE FACTORY INITIALIZE
        Login= PageFactory.initElements(driver, LoginPage.class);

    }


    public void ReadData()
    {
        File fi=new File("C:\\Users\\Khalil Conteh\\IdeaProjects\\DemoTest\\src\\test\\ObjectRepo.properties");
        FileInputStream fileinput=null;
        try{
            fileinput=new FileInputStream(fi);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        prop=new Properties();

        //LOAD FILE
        try{
            prop.load(fileinput);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
