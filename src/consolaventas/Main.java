/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolaventas;

import java.util.Scanner;

/**
 *
 * @author Cesia Coto
 */
public class Main {

    public static void main(String[] args) {
        login l = new login();
        Menu m2 = new Menu();
        Scanner t = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("Bienvenido al sistema XYZ");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Loguearse con usuario y contraseña");
            System.out.println("2. Salir y cerrar sistema");
            System.out.print("Digite la opcion: ");
            op = t.nextInt();
            switch (op) {
                case 1: {
                    boolean isValid = l.ingresar();
                    if (isValid) {
                        switch (l.getTipoUsuario()) {
                            case "Admin":
                                m2.MenuAdmin(l);
                                break;
                            case "Vendedor":
                                m2.MenuVendedor(l);
                                break;
                            case "Invitado":
                                m2.MenuInvitado(l);
                                break;
                            default:
                                System.out.println("Error, no se encontro un tipo de usuario valido");
                                break;
                        }
                    }
                }
                break;
                case 2:
                    ///SALIR DEL SISTEMA

                    System.out.println("Hasta la proxima......");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println();
        } while (op != 2);
    }
}
