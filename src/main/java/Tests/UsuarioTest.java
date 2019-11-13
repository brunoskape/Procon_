package Tests;

import Helper.BaseTest;
import Pages.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class UsuarioTest extends BaseTest {

    WebDriver driver;


    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://procon-carioca-web.clv.iplan.dev.solutis.xyz/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


    @Test
    public void cadastrarUsuarioTest() throws InterruptedException {

        HomePage homepage = new HomePage(driver);

        homepage.acessarMenuUsuario();
        homepage.preencherDadosUsuario("NOME COMPLETO", "28606850063");
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://procon-carioca-web.clv.iplan.dev.solutis.xyz/consumidor");
    }


    @After
    public void tearDown() throws Exception {

       driver.quit();

    }

}
