package Modelo;
/*
 * Autor     @Robinson Rojas
 * Fecha     11/02/2020
 * Version   1.0
 * Licence   MIT
 *
 * Ejercicios de lógica de programación.
 *
 */

import Controlador.Calcular;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calcular op = new Calcular(0,0,0,0);

        int menu = 0;
        while (menu != 6) {
            System.out.println("----------------------------------");
            System.out.println("\n       Menu");
            System.out.println("1.Taylor de sin x.");
            System.out.println("2.Taylor de cos x.");
            System.out.println("3.Serie de Taylor de e^x.");
            System.out.println("4.Formula de Leibniz para π 'pi', con n° terminos de precision, bigdecimal.");
            System.out.println("5.Factorial.");
            System.out.println("6.Salir");

            System.out.print("\nDigite una Opcion: ");
            menu = leer.nextInt();
            System.out.println("----------------------------------");


            switch (menu) {
                case 1:
                    System.out.println("[Serie de Taylor de sin x]");
                    System.out.print("Ingrese el angulo x: ");
                    op.X = leer.nextDouble();
                    System.out.println("sin(" + op.X + ") es= " + op.seno(op.X));
                    break;

                case 2:
                    System.out.println("[Serie de Taylor de cos x]");
                    System.out.print("Ingrese el angulo x: ");
                    op.X = leer.nextDouble();
                    System.out.println("cos(" + op.X + ") es= " + op.cos(op.X));
                    break;

                case 3:
                    System.out.println("[Función exponencial e^x]");
                    System.out.print("Ingrese x: ");
                    op.X = leer.nextDouble();

                    System.out.print("Ingrese el n° termino: ");
                    op.Nmax = leer.nextInt();

                    System.out.println("Sumatoria en n : " + op.Nmax + " = " + op.e(op.X, op.Nmax));
                    break;

                case 4:
                    System.out.println("[π, double, BigDecimal]");
                    System.out.print("Ingrese el n° de precision para la serie de Leibniz: ");
                    op.PI = leer.nextInt();

                    System.out.println("piDouble, π = " + op.piDouble(op.PI));
                    System.out.println("piBigDecimal, π = " + op.piBigDecimal(op.PI));
                    break;

                case 5:
                    System.out.println("[Factorial]");
                    System.out.print("Ingrese el numero : ");
                    op.Nfac = leer.nextInt();
                    System.out.println("Factorial de " + op.Nfac + " = " + op.factorial(op.Nfac));
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
