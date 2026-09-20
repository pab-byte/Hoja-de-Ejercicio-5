import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio9_FusionOrdenada {

    /**
     * Fusiona dos listas ordenadas ascendentemente en una tercera, tambien ordenada.
     * Un solo recorrido con dos punteros: O(n + m).
     */
    public static ArrayList<Integer> fusionar(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> resultado = new ArrayList<>(a.size() + b.size());
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                resultado.add(a.get(i++));
            } else {
                resultado.add(b.get(j++));
            }
        }
        // Uno de los dos ya se agoto; se copia lo que quede del otro
        while (i < a.size()) resultado.add(a.get(i++));
        while (j < b.size()) resultado.add(b.get(j++));

        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 3, 4, 8, 10, 12, 15, 20));

        System.out.println("Lista A : " + a);
        System.out.println("Lista B : " + b);
        System.out.println("Fusion  : " + fusionar(a, b));
    }
}
