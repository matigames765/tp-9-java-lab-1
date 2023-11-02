import java.util.ArrayList;
public class ej25 {
    public static void main(String[] args) {
        /*
        25.	Crea un ArrayList de cadenas y ordena las cadenas alfabéticamente.
         */
        ArrayList<String> string_array = new ArrayList<>();
        string_array.add("hola");
        string_array.add("tenis");
        string_array.add("jugar");
        string_array.add("matias");
        bubbleSort(string_array);
        System.out.println("El array ordenado alfabeticamente queda: ");
        System.out.println(string_array);
    }
    public static void bubbleSort(ArrayList<String> string_array) {
        int n = string_array.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compara dos elementos adyacentes y los intercambia si están en el orden incorrecto
                if (string_array.get(j).compareTo(string_array.get(j + 1)) > 0) {
                    String temp = string_array.get(j);
                    string_array.set(j, string_array.get(j + 1));
                    string_array.set(j + 1, temp);
                }
            }
        }
    }
}
