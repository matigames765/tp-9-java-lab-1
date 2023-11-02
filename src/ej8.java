
import java.util.ArrayList;

public class ej8 {
    public static void main(String[] args) {
        /*
        8.	Copia todos los elementos de un ArrayList en otro ArrayList nuevo.
         */
        ArrayList<Integer> int_array = new ArrayList<>();
        int_array.add(1);
        int_array.add(2);
        int_array.add(3);

        ArrayList<Integer> new_int_array = new ArrayList<>(int_array);
        System.out.println("Arreglo copiado " + new_int_array);
    }
}
