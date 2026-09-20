import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

class Factura {
    private int idFactura;
    private String cliente;
    private double monto;

    public Factura(int idFactura, String cliente, double monto) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.monto = monto;
    }

    public int getIdFactura() { return idFactura; }
    public String getCliente() { return cliente; }
    public double getMonto() { return monto; }
}

public class Ejercicio8_Facturas {

    /** Acumula el monto total facturado por cada cliente. */
    public static Map<String, Double> resumenPorCliente(ArrayList<Factura> facturas) {
        Map<String, Double> resumen = new LinkedHashMap<>();
        for (Factura f : facturas) {
            resumen.merge(f.getCliente(), f.getMonto(), Double::sum);
        }
        return resumen;
    }

    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(new Factura(1001, "Ana Lopez", 1500.00));
        facturas.add(new Factura(1002, "Carlos Perez", 800.50));
        facturas.add(new Factura(1003, "Ana Lopez", 2300.75));
        facturas.add(new Factura(1004, "Maria Gomez", 450.00));
        facturas.add(new Factura(1005, "Carlos Perez", 1200.00));

        Map<String, Double> resumen = resumenPorCliente(facturas);

        System.out.println("Resumen de facturacion por cliente:");
        for (Map.Entry<String, Double> e : resumen.entrySet()) {
            System.out.printf("%-15s Q%.2f%n", e.getKey(), e.getValue());
        }
    }
}
