package StepDefinitions;

import Task.CredencialesTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.IOException;

public class CredencialesSD {
    @And("Ingresamos {},{}")
    public void Inicio_Sesion(String usuario,String contrasena) throws InterruptedException, IOException {
        CredencialesTask test = new CredencialesTask();
        test.user(usuario);
        test.password(contrasena);
        ScreenShot x = new ScreenShot();
        x.TakesScreenshot();
        }
    }

