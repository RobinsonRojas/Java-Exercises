package Controlador;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calcular {

    public double X;    // angulo ingrsado por el usuario.
    public int Nmax;    // N Numero de veces que se repetira la sumatoria para mas precision ingresado por el usuario para calculaser las series de Taylor;
    public int PI;      // Numero de veces que se repetira la sumatoria para mas precision ingresado por el usuario para calcular pi.
    public int Nfac;    // Numero al que se le calcula su factorial.

    public Calcular(double x, int nmax, int PI, int nfac) {
        X = x;
        Nmax = nmax;
        this.PI = PI;
        Nfac = nfac;
    }

    public double seno(double X) {
        double termino;
        double solucion = 0;
        X = X * Math.PI / 180;

        for (int i = 0; i <= 4; i++) {
            double dividendo = Math.pow(X, ((2 * i) + 1));
            double divisor = (2 * i + 1);
            double factoriall = factorial((int) divisor);
            double division = dividendo / factoriall;

            termino = division * (Math.pow(-1, i));
            solucion = (solucion + termino);
        }
        return (solucion);
    }

    public double cos(double X) {
        double termino;
        double solucion = 0;
        X = X * Math.PI / 180;

        for (int i = 0; i <= 4; i++) {
            double dividendo = Math.pow(X, (2 * i));
            double divisor = (2 * i);
            double factoriall = factorial((int) divisor);
            double division = dividendo / factoriall;

            termino = division * (Math.pow(-1, i));
            solucion = (solucion + termino);
        }
        return (solucion);
    }

    public double e(double X, int Nmax) {
        double solucion = 0;

        for (int i = 0; i <= Nmax; i++) {
            double dividendo = Math.pow(X, i);
            double divisor = factorial(i);
            double division = dividendo / divisor;

            solucion = solucion + division;
        }
        return (solucion);
    }

    public double piDouble(int n) {
        int divisor = 1;
        int signo = 1;
        double termino;
        double pi = 0;

        for (int i = 1; i <= n; i++) {
            termino = (double) 1 / divisor * signo;
            pi += termino;
            divisor += 2;
            signo *= -1;
        }
        return pi * 4;
    }

    public BigDecimal piBigDecimal(int n) {
        BigDecimal divisor = new BigDecimal("1");
        BigDecimal signo = new BigDecimal("1");
        BigDecimal termino;
        BigDecimal sumatoria = new BigDecimal("0");
        BigDecimal pi = new BigDecimal("0");

        BigDecimal dividendo = new BigDecimal("1");
        BigDecimal incremento = new BigDecimal("2");
        BigDecimal signoN = new BigDecimal(-1);
        BigDecimal cuatro = new BigDecimal("4");

        for (int i = 1; i <= n; i++) {
            termino = dividendo.divide(divisor.multiply(signo), 10000, RoundingMode.HALF_UP);
            sumatoria = sumatoria.add(termino);
            divisor = divisor.add(incremento);
            signo = signo.multiply(signoN);
            pi = sumatoria.multiply(cuatro);
        }
        return (pi);
    }

    public int factorial(int Nfac) {
        int factorial = 1;

        for (int i = Nfac; i > 0; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }
}