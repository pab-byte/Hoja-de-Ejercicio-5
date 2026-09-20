import java.util.ArrayList;

class ItemCarrito {
    private String producto;
    private int cantidad;
    private double precioUnitario;

    public ItemCarrito(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public double getPrecioUnitario() { return precioUnitario; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getSubtotal() { return cantidad * precioUnitario; }

    @Override
    public String toString() {
        return String.format("%s x%d @ Q%.2f = Q%.2f", producto, cantidad, precioUnitario, getSubtotal());
    }
}

class CarritoCompras {
    private final ArrayList<ItemCarrito> items = new ArrayList<>();

    /** Si el producto ya existe, incrementa la cantidad; si no, lo agrega. */
    public void agregarItem(ItemCarrito nuevo) {
        for (ItemCarrito existente : items) {
            if (existente.getProducto().equalsIgnoreCase(nuevo.getProducto())) {
                existente.setCantidad(existente.getCantidad() + nuevo.getCantidad());
                return;
            }
        }
        items.add(nuevo);
    }

    /** Elimina el item con ese nombre de producto. Devuelve true si lo encontro. */
    public boolean eliminarItem(String producto) {
        return items.removeIf(i -> i.getProducto().equalsIgnoreCase(producto));
    }

    public void vaciarCarrito() {
        items.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito i : items) {
            total += i.getSubtotal();
        }
        return total;
    }

    public void mostrar() {
        if (items.isEmpty()) {
            System.out.println("(carrito vacio)");
            return;
        }
        items.forEach(System.out::println);
        System.out.printf("TOTAL: Q%.2f%n", calcularTotal());
    }
}

public class Ejercicio7_CarritoCompras {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarItem(new ItemCarrito("Mouse", 1, 85.00));
        carrito.agregarItem(new ItemCarrito("Teclado", 2, 150.00));
        carrito.agregarItem(new ItemCarrito("Mouse", 2, 85.00)); // ya existe: suma cantidad

        System.out.println("--- Carrito ---");
        carrito.mostrar();

        carrito.eliminarItem("Teclado");
        System.out.println("\n--- Tras eliminar Teclado ---");
        carrito.mostrar();

        carrito.vaciarCarrito();
        System.out.println("\n--- Tras vaciar ---");
        carrito.mostrar();
    }
}
