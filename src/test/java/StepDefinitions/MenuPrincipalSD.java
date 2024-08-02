package StepDefinitions;

import Task.MenuPrincipalTask;
import io.cucumber.java.en.And;

public class MenuPrincipalSD {
    @And("Seleccionamos el menu principal")
    public void Menu_Principal() throws InterruptedException {
        MenuPrincipalTask menu = new MenuPrincipalTask();
        menu.Menu_Principal();
    }
}