package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.config.driver;

public class MenuPrincipalUI {
    public WebElement menu_principal = driver.findElement(By.xpath("//*[@id=\"btn-menu\"]/button/i"));

}
