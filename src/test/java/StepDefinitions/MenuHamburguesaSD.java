package StepDefinitions;

import Task.MenuHamburguesaTask;

public class MenuHamburguesaSD {
    public void Menu_Hamburguesa(String menusecundario) throws InterruptedException {
        MenuHamburguesaTask menu = new MenuHamburguesaTask();
        menu.Menu_Hamburguesa(menusecundario);
    }
}