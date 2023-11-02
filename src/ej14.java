import java.util.ArrayList;
public class ej14 {
    public static void main(String[] args) {
        /*
        14.	Encuentra el elemento más pequeño en un ArrayList de números.
         */
        ArrayList<Integer> number_array = new ArrayList<>();
        number_array.add(3);
        number_array.add(2);
        number_array.add(1);
        number_array.add(4);
        int minimal_number = number_array.get(0);
        for (int i = 1; i < number_array.size(); i++){
            if(minimal_number > number_array.get(i)){
                minimal_number = number_array.get(i);
            }
        }
        System.out.println("El elemento mas pequeño del ArrayList es: " + minimal_number);
    }
}
