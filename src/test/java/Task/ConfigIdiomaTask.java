package Task;

import UserInterface.ConfigIdiomaUI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Objects;

import static Util.config.driver;

public class ConfigIdiomaTask {
    public void Config_Idioma(String lenguaje) throws InterruptedException {
        ConfigIdiomaUI seleccionar = new ConfigIdiomaUI();
    if(Objects.equals(lenguaje, "ESP")){
        seleccionar.config_idioma.click();

        Actions actions =new Actions (driver);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(10_000);

        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(10_000);
        System.out.println("Default lenguaje:" +lenguaje);
    }
    else{
        System.out.println("Default lenguaje:" +lenguaje);
        //log("Default lenguaje:"+ lenguaje);
    }

    }
}
