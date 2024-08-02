package Task;

import UserInterface.MenuPrincipalUI;
import UserInterface.OpcModuloUI;

public class OpcModuloTask {
    public void Opc_Modulo1(String moduloprincipal) throws InterruptedException {
        OpcModuloUI seleccionar = new OpcModuloUI();

        switch (moduloprincipal) {
            case "Portal" -> {
                seleccionar.opc_modulo1.click();
                Thread.sleep(10_000);
            }
            case "Seguridad" -> {
                seleccionar.opc_modulo2.click();
                Thread.sleep(10_000);
            }
            case "Uso interno" -> {
                seleccionar.opc_modulo3.click();
                Thread.sleep(10_000);
            }
            case "M& facturas" -> {
                seleccionar.opc_modulo4.click();
                Thread.sleep(10_000);
            }
            case "M&V intercambio" -> {
                seleccionar.opc_modulo5.click();
                Thread.sleep(10_000);
            }
            case "Inteligencia de negocios" -> {
                seleccionar.opc_modulo6.click();
                Thread.sleep(10_000);
            }
            case "Gestion cartera" -> {
                seleccionar.opc_modulo7.click();
                Thread.sleep(10_000);
            }
            case "Intercambio archivos" -> {
                seleccionar.opc_modulo8.click();
                Thread.sleep(10_000);
            }
            case "Ajustes" -> {
                seleccionar.opc_modulo9.click();
                Thread.sleep(10_000);
            }


        }
    }
}



