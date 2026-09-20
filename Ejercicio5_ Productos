import java.util.ArrayList;

public class Ejercicio5_Productos {

    // Clase Producto (anidada para que este archivo sea independiente del Ejercicio 1)
    static class Producto {
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

        @Override
        public String toString() {
            return String.format("[%d] %-12s Q%9.2f  stock: %d", id, nombre, precio, stock);
        }
    }

    /**
     * Recibe la lista y un porcentaje de aumento; actualiza el precio de todos
     * los productos con stock inferior a 10 unidades.
     */
    public static void aplicarAumento(ArrayList<Producto> productos, double porcentajeAumento) {
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            if (p.getStock() < 10) {
                double nuevoPrecio = p.getPrecio() + (p.getPrecio() * porcentajeAumento / 100.0);
                p.setPrecio(nuevoPrecio);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(101, "Laptop", 6500.00, 4));
        productos.add(new Producto(102, "Impresora", 1800.00, 12));
        productos.add(new Producto(103, "Tablet", 2300.00, 9));
        productos.add(new Producto(104, "Auriculares", 350.00, 30));
        productos.add(new Producto(105, "Webcam", 420.00, 0));

        System.out.println("--- Inventario original ---");
        for (Producto p : productos) System.out.println(p);

        aplicarAumento(productos, 15); // +15 %

        System.out.println("\n--- Despues de aumentar 15% a los de stock < 10 ---");
        for (Producto p : productos) System.out.println(p);
    }
}
