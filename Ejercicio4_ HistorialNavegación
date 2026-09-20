import java.util.ArrayList;

class HistorialNavegacion {
    private static final int LIMITE = 10;
    private final ArrayList<String> historial = new ArrayList<>();

    /** Agrega una URL; si se supera el limite, elimina la mas antigua (indice 0). */
    public void visitarPagina(String url) {
        historial.add(url);
        if (historial.size() > LIMITE) {
            historial.remove(0);
        }
    }

    public ArrayList<String> getHistorial() {
        return new ArrayList<>(historial); // copia para no exponer la lista interna
    }

    public void mostrar() {
        for (int i = 0; i < historial.size(); i++) {
            System.out.println((i + 1) + ". " + historial.get(i));
        }
    }
}

public class Ejercicio4_HistorialNavegacion {
    public static void main(String[] args) {
        HistorialNavegacion h = new HistorialNavegacion();

        for (int i = 1; i <= 13; i++) {
            h.visitarPagina("https://ejemplo.com/pagina" + i);
        }

        System.out.println("Historial (maximo 10, se conservan las mas recientes):");
        h.mostrar();
    }
}
