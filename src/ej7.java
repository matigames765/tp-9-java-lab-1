import java.util.ArrayList;
public class ej7 {
    public static void main(String[] args) {
        /*
        7.	Encuentra el elemento más grande en un ArrayList de números.
         */
        ArrayList<Integer> int_array = new ArrayList<>();
        int_array.add(4);
        int_array.add(8);
        int_array.add(3);
        int_array.add(5);
        int bigger_number = int_array.get(0);
        for (int number : int_array){
            if (bigger_number < number){
                bigger_number = number;
            }
        }
        System.out.println("El numero mas grande del ArrayList es " + bigger_number);
    }
}
