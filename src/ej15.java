import java.util.ArrayList;
public class ej15 {
    public static void main(String[] args) {
        /*
        15.	Crea un ArrayList de números enteros y suma todos los elementos.
         */
        ArrayList<Integer> number_array = new ArrayList<>();
        number_array.add(3);
        number_array.add(2);
        number_array.add(1);
        number_array.add(4);
        int addition = 0;
        for (int number : number_array){
            addition += number;
        }
        System.out.println("La suma de todos los elementos del ArrayList es " + addition);
    }
}
