import java.util.ArrayList;
public class ej22 {
    public static void main(String[] args) {
        /*
        22.	Crea un ArrayList de enteros y ordénalo de forma ascendente.
         */
        ArrayList<Integer> number_array = new ArrayList<>();
        number_array.add(3);
        number_array.add(2);
        number_array.add(1);
        number_array.add(4);
        bubbleSort(number_array);
        System.out.println("El ArrayList ordenado en forma ascendente queda: ");
        System.out.println(number_array);
    }
    public static void bubbleSort(ArrayList<Integer> number_array) {
        int n = number_array.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (number_array.get(i - 1) > number_array.get(i)) {
                    int temp = number_array.get(i - 1);
                    number_array.set(i - 1, number_array.get(i));
                    number_array.set(i, temp);
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
