package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver navegador) {
        super(navegador);
    }


    public LoginFormPage signIn(){
        navegador.findElement(By.linkText("Sign in")).click();
        return new LoginFormPage(navegador);
    }
}
