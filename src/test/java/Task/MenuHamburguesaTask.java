package Task;

import UserInterface.ConfigIdiomaUI;
import UserInterface.MenuHamburguesaUI;

public class MenuHamburguesaTask {
    public void Menu_Hamburguesa(String lenguaje) throws InterruptedException {
        MenuHamburguesaUI seleccionar = new MenuHamburguesaUI();
        seleccionar.menu_secundario.click();
        Thread.sleep(2_000);
    }
}