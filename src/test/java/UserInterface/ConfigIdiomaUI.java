package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.config.driver;

public class ConfigIdiomaUI {

    public WebElement config_idioma = driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_0\"]/span"));


}
