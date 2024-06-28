
package com.mycompany.mavenproject1;
import interfazpaquete.Interfaz;

public class principal {
    public static void main(String[] args){
        System.out.println("Bienvenido al sistema");
        Interfaz ventana = new Interfaz();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
