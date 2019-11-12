package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public void acessarMenuUsuario() {

        driver.findElement(By.cssSelector(".MuiButton-label > #btn-consumidor")).click();
        driver.findElement(By.cssSelector("div.jss338:nth-child(1)")).click();
    }

    public void acessarMenuEmpresa(){


    }

    public void preencherDadosUsuario(String nome, String cpf)  {

        driver.findElement(By.id("cpf")).sendKeys(cpf);
        driver.findElement(By.id("senha")).sendKeys("123456");
        driver.findElement(By.id("nomeCompleto")).sendKeys(nome);
        driver.findElement(By.id("telefone")).sendKeys("2127272727");

   }

}
