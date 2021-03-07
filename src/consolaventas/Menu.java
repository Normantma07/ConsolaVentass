/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolaventas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesia Coto
 */
public class Menu {

    private Scanner teclado;

    public void MenuAdmin(login l) {
        int opcion = 0;

        teclado = new Scanner(System.in);
        do {
            System.out.println("Bienvenido" + " ");
            System.out.println("1. Venta Nueva");
            System.out.println("2. Consultar inventarios");
            System.out.println("3. Cambiar contraseña");
            System.out.println("4. Cerrar sesión");
            System.out.print("Digite la opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                //REALIZAR VENTA
                case 1:
                    break;
                case 2:
                    //CONSULTAR INVENTARIOS

                    break;
                case 3:
                    //CAMBIAR CONTRASEÑA     
                    if (l.cambiarContraseña()) {

                        System.out.print("Volviendo a la pantalla de inicio de sesion");
                        opcion = 4;
                    }
                    break;
                case 4:
                    //SALIR DEL SISTEMA

                    System.out.println("Saliendo del sistema....");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 4);
    }

    public void MenuVendedor(login l) {
        int opcion = 0;

        teclado = new Scanner(System.in);
        do {
            System.out.println("Bienvendio" + " ");
            System.out.println("1. Venta Nueva");
            System.out.println("2. Consultar inventarios");
            System.out.println("3. Cerrar sesión");
            System.out.print("Digite la opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                //REALIZAR VENTA
                case 1: {

                }
                break;
                case 2:
                    //CONSULTAR INVENTARIOS

                    break;
                case 3:
                    //SALIR DEL SISTEMA  

                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 3);
    }

    public void MenuInvitado(login l) {
        int opcion = 0;

        teclado = new Scanner(System.in);
        do {
            System.out.println("Bienvendio" + " ");
            System.out.println("1. Consultar precios");
            System.out.println("2. Cerrar sesión");
            System.out.print("Digite la opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                //CONSULTAR PRECIOS
                case 1: {
                    System.out.println("Consultando precios...");

                }
                break;
                case 2:
                    //SALIR DEL SISTEMA   

                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 2);
    }

}
