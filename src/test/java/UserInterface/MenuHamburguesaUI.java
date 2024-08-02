package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.config.driver;

public class MenuHamburguesaUI {
    public WebElement menu_secundario = driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_0\"]/span"));

}
