package Helper;

import Pages.HomePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    HomePage hometest;


    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.tjrj.jus.br/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        HomePage hometest = new HomePage(driver);

    }

    @After
    public void tearDown() throws Exception {

        //	driver.close();

    }

}
