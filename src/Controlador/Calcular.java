package Controlador;

public class Calcular {

    public double X;    // angulo ingrsado por el usuario.
    public int Nmax;    // N Numero de veces que se repetira la sumatoria para mas precision ingresado por el usuario para calculaser las series de Taylor;
    public int PI;      // Numero de veces que se repetira la sumatoria para mas precision ingresado por el usuario para calcular pi.
    public int Nfac;    // Numero al que se le calcula su factorial.

    public void seno(double X, int Nmax) {
        double termino;
        double solucion = 0;

        for (int i = 0; i <= Nmax; i++) {

            double dividendo = Math.pow(X, ((2 * i) + 1));

            double divisor = (2 * i + 1);

            double factoriall = factorial((int) divisor);

            double division = dividendo / factoriall;

            termino = division * (Math.pow(-1, i));

            solucion = (solucion + termino);

            System.out.println("Sumatoria en n = " + i + " = " + solucion);
        }
    }

    public void cos(double X, int Nmax) {
        double termino;
        double solucion = 0;

        for (int i = 0; i <= Nmax; i++) {

            double dividendo = Math.pow(X, (2 * i));

            double divisor = (2 * i);

            double factoriall = factorial((int) divisor);

            double division = dividendo / factoriall;

            termino = division * (Math.pow(-1, i));

            solucion = (solucion + termino);

            System.out.println("Sumatoria en n = " + i + " = " + solucion);
        }
    }

    public void e(double X, int Nmax) {
        double solucion = 0;

        for (int i = 0; i <= Nmax; i++) {

            double dividendo = Math.pow(X, i);

            double divisor = factorial(i);

            double division = dividendo / divisor;

            solucion = solucion + division;

            System.out.println("Sumatoria en n = " + i + " = " + solucion);
        }
    }

    public double pi(int pi) {
        int d = 1;
        int sig = 1;
        double t;
        double s = 0;

        for (int i = 1; i <= pi; i++) {
            t = (double) 1 / d * sig;
            s += t;
            d += 2;
            sig *= -1;
        }
        return s * 4;
    }

    public int factorial(int Nfac) {
        int factorial = 1;

        for (int i = Nfac; i > 0; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }


}
