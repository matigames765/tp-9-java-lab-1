import java.util.ArrayList;
public class ej11 {
    public static void main(String[] args) {
        /*
        11.	Crea un ArrayList de números enteros y elimina todos los elementos pares.
         */
        ArrayList<Integer> int_array = new ArrayList<>();
        int_array.add(1);
        int_array.add(2);
        int_array.add(3);
        int_array.add(4);
        int_array.add(5);
        int_array.add(6);
        for (int i = 0; i < int_array.size(); i++){
            if (int_array.get(i) % 2 == 0){
                int_array.remove(i);
            }
        }
        System.out.println("El array sin los elementos pares queda: " + int_array);
    }
}
