package Tests;

import Helper.BaseTest;
import Pages.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UsuarioTest extends BaseTest {

    WebDriver driver;


    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://procon-carioca-web.clv.iplan.dev.solutis.xyz/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //HomePage hometest = new HomePage(driver);

    }


    @Test
    public void cadastrarUsuarioTest()  {

        HomePage homepage = new HomePage(driver);

        homepage.acessarMenuUsuario();
        homepage.preencherDadosUsuario("14075299783", "TESTE");

    }


    @After
    public void tearDown() throws Exception {

        driver.close();

    }

}
