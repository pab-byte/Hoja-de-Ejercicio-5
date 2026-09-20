import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3_VentasDiarias {

    private static void validar(ArrayList<Double> ventas) {
        if (ventas == null || ventas.isEmpty()) {
            throw new IllegalArgumentException("La lista de ventas esta vacia");
        }
    }

    public static double calcularPromedio(ArrayList<Double> ventas) {
        validar(ventas);
        double suma = 0;
        for (double v : ventas) {
            suma += v;
        }
        return suma / ventas.size();
    }

    public static double calcularMaximo(ArrayList<Double> ventas) {
        validar(ventas);
        double max = ventas.get(0);
        for (double v : ventas) {
            if (v > max) max = v;
        }
        return max;
    }

    public static double calcularMinimo(ArrayList<Double> ventas) {
        validar(ventas);
        double min = ventas.get(0);
        for (double v : ventas) {
            if (v < min) min = v;
        }
        return min;
    }

    public static int contarDiasSobrePromedio(ArrayList<Double> ventas) {
        double promedio = calcularPromedio(ventas);
        int dias = 0;
        for (double v : ventas) {
            if (v > promedio) dias++;
        }
        return dias;
    }

    public static void main(String[] args) {
        // Ventas simuladas de un mes de 30 dias (entre Q500 y Q5,000)
        Random rnd = new Random(42);
        ArrayList<Double> ventas = new ArrayList<>();
        for (int dia = 1; dia <= 30; dia++) {
            double monto = 500 + rnd.nextDouble() * 4500;
            ventas.add(Math.round(monto * 100.0) / 100.0);
        }

        System.out.println("Ventas diarias: " + ventas);
        System.out.printf("Promedio mensual : Q%.2f%n", calcularPromedio(ventas));
        System.out.printf("Venta maxima     : Q%.2f%n", calcularMaximo(ventas));
        System.out.printf("Venta minima     : Q%.2f%n", calcularMinimo(ventas));
        System.out.println("Dias sobre el promedio: " + contarDiasSobrePromedio(ventas));
    }
}
