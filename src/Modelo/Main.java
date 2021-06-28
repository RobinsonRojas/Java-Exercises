package Modelo;
/*
 * Autor     @Robinson Rojas
 * Fecha     11/02/2020
 * Version   1.0
 * Licence   GNU
 *
 * El programa  calcula las sumatorias de Taylor
 * de seno, coseno, PI y e^x
 */

import Controlador.Calcular;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calcular op = new Calcular();

        int menu = 0;
        while (menu != 6) {
            System.out.println("\n----------------------------------");
            System.out.println("       Menu");
            System.out.println("1.Calcular la Serie de Taylor de sin x.");
            System.out.println("2.Calcular la Serie de Taylor de cos x.");
            System.out.println("3.Calcular la Serie de Taylor de e^x.");
            System.out.println("4.Calcular el numero pi.");
            System.out.println("5.Calcular el factorial de un numero.");
            System.out.println("6.Salir");

            System.out.print("\nDigite una Opcion:");

            menu = leer.nextInt();
            System.out.println("----------------------------------");


            switch (menu) {
                case 1:
                    System.out.print("Ingrese el angulo x:");
                    double X1 = leer.nextDouble();
                    op.X = X1;
                    op.X = op.X * Math.PI / 180;

                    System.out.print("Ingrese el numero hasta donde termina n:");
                    op.Nmax = leer.nextInt();

                    System.out.println("La serie de Taylor de sin(" + X1 + ") es:");
                    op.seno(op.X, op.Nmax);
                    break;

                case 2:
                    System.out.print("Ingrese el angulo x:");
                    double X2 = leer.nextDouble();
                    op.X = X2;
                    op.X = op.X * Math.PI / 180;

                    System.out.print("Ingrese el numero hasta donde termina n:");
                    op.Nmax = leer.nextInt();

                    System.out.println("La serie de Taylor de cos(" + X2 + ") es:");
                    op.cos(op.X, op.Nmax);
                    break;

                case 3:
                    System.out.print("Ingrese x:");
                    op.X = leer.nextDouble();

                    System.out.print("Ingrese el numero hasta donde termina n:");
                    op.Nmax = leer.nextInt();

                    System.out.println("La serie de Taylor de e^^" + op.X + ") es:");
                    op.e(op.X, op.Nmax);
                    break;

                case 4:
                    System.out.print("Ingrese el numero de precision para la serie para pi/4:");
                    op.PI = leer.nextInt();
                    System.out.println(op.pi(op.PI));
                    break;

                case 5:
                    System.out.print("Ingrese el numero para calcular su factorial:");
                    op.Nfac = leer.nextInt();
                    System.out.println(op.factorial(op.Nfac));
                    break;

                case 6:
                    System.out.println("Fin.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor vuelva a intentarlo.");
            }
        }
    }
}
