import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio6_VentasMensuales {

    public static double promedioMensual(ArrayList<Double> ventas) {
        return ventas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public static double valorMaximo(ArrayList<Double> ventas) {
        return Collections.max(ventas);
    }

    public static double valorMinimo(ArrayList<Double> ventas) {
        return Collections.min(ventas);
    }

    public static int diasSobrePromedio(ArrayList<Double> ventas) {
        double promedio = promedioMensual(ventas);
        int contador = 0;
        for (Double monto : ventas) {
            if (monto > promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        // Ventas diarias de un mes de 30 dias (valores fijos para reproducibilidad)
        ArrayList<Double> ventas = new ArrayList<>(Arrays.asList(
                1200.50, 980.00, 1500.75, 2100.00, 875.25, 1320.00, 1650.40,
                1100.00, 990.90, 1800.00, 2250.60, 760.00, 1430.30, 1210.00,
                1975.00, 1050.00, 890.50, 1600.00, 2400.00, 1150.75, 1340.00,
                1720.20, 810.00, 1990.00, 1260.00, 1480.00, 2050.00, 930.00,
                1380.00, 1560.00));

        System.out.println("Dias registrados: " + ventas.size());
        System.out.printf("Promedio mensual      : Q%.2f%n", promedioMensual(ventas));
        System.out.printf("Valor maximo          : Q%.2f%n", valorMaximo(ventas));
        System.out.printf("Valor minimo          : Q%.2f%n", valorMinimo(ventas));
        System.out.println("Dias sobre el promedio: " + diasSobrePromedio(ventas));
    }
}
