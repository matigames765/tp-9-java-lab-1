import java.util.ArrayList;

public class ej9 {
    public static void main(String[] args) {
        /*
        9.	Invierte un ArrayList de enteros (el primer elemento se convierte en el último y
        viceversa).

         */
        ArrayList<Integer> int_array = new ArrayList<>();
        int_array.add(1);
        int_array.add(2);
        int_array.add(3);
        ArrayList<Integer> inverted_array = new ArrayList<>();
        for (int i = int_array.size() - 1;  i >= 0; i--){
            inverted_array.add(int_array.get(i));
        }
        System.out.println("El arreglo invertido queda: ");
        for (int number : inverted_array){
            System.out.println(number + " ");
        }

    }
}
