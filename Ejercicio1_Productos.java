import java.util.ArrayList;

class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return String.format("Producto{id=%d, nombre='%s', precio=Q%.2f, stock=%d}",
                id, nombre, precio, stock);
    }
}

public class Ejercicio1_Productos {

    /**
     * Aumenta el precio en 'porcentaje' % a todos los productos con stock < 10.
     */
    public static void aumentarPrecioStockBajo(ArrayList<Producto> productos, double porcentaje) {
        for (Producto p : productos) {
            if (p.getStock() < 10) {
                p.setPrecio(p.getPrecio() * (1 + porcentaje / 100.0));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Mouse", 85.00, 25));
        productos.add(new Producto(2, "Teclado", 150.00, 5));
        productos.add(new Producto(3, "Monitor", 1200.00, 8));
        productos.add(new Producto(4, "Cable HDMI", 40.00, 10));
        productos.add(new Producto(5, "USB 64GB", 60.00, 3));

        System.out.println("=== Antes del aumento ===");
        productos.forEach(System.out::println);

        aumentarPrecioStockBajo(productos, 10); // +10 %

        System.out.println("\n=== Despues de aumentar 10% (stock < 10) ===");
        productos.forEach(System.out::println);
    }
}
