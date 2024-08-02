package Task;

import UserInterface.MenuPrincipalUI;

public class MenuPrincipalTask {
    public void Menu_Principal() throws InterruptedException {
        MenuPrincipalUI seleccionar = new MenuPrincipalUI();
        seleccionar.menu_principal.click();
        Thread.sleep(5_000);
    }
}
