package Pages;

import Helper.BaseTest;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class HomePage extends BaseTest {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public void acessarMenuUsuario() {

        driver.findElement(By.cssSelector(".MuiButton-label > #btn-consumidor")).click();
        driver.findElement(By.cssSelector("#root > div > div > div._loading_overlay_wrapper.css-79elbk > main > div.MuiGrid-root.jss161.MuiGrid-container.MuiGrid-direction-xs-column.MuiGrid-align-items-xs-center.MuiGrid-justify-xs-center > div.MuiGrid-root.MuiGrid-container.MuiGrid-align-items-xs-center.MuiGrid-justify-xs-center > div:nth-child(1) > div > p")).click();//refatorar esse selector
    }

    public void acessarMenuEmpresa(){


    }

    public void preencherDadosUsuario(String nome, String cpf) throws InterruptedException {

        driver.findElement(By.id("cpf")).sendKeys(cpf);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);//refatorar esse trecho-- retirar o sleep e ajustar o trecho do timeout
        WebElement webElement = driver.findElement(By.id("cpf"));
        webElement.sendKeys(Keys.TAB);

        driver.findElement(By.id("senha")).sendKeys("123456");
        driver.findElement(By.id("nomeCompleto")).sendKeys(nome);
        driver.findElement(By.id("email")).sendKeys(("teste@automatizado.com"));
        driver.findElement(By.id("telefone")).sendKeys("2127272727");
        Thread.sleep(2000);//refatorar esse trecho-- retirar o sleep e ajustar o trecho do timeout
        driver.findElement(By.xpath(("//*[@id=\"root\"]/div/div/div[1]/main/div[2]/div/form/div[2]/div[2]/div/div/div/button"))).click();

        //marcações checkbox
        driver.findElement(By.id("titularTel")).click();
        driver.findElement(By.id("maxTel")).click();
        driver.findElement(By.id("prazoRec")).click();

        driver.findElement(By.id(("btnSalvar"))).click();

   }

   public void preencherDadosEmpresa(String cnpj){

       driver.findElement(By.name("cnpj")).sendKeys(cnpj);
       driver.findElement(By.name("senha")).sendKeys("123456");
       driver.findElement(By.name("cpfResponsavel")).sendKeys("123456");



   }


}
