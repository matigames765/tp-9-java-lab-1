import java.util.ArrayList;
public class ej21 {
    public static void main(String[] args) {
        /*
        21.	Encuentra el promedio de todos los elementos en un ArrayList de números enteros.
         */
        ArrayList<Integer> number_array = new ArrayList<>();
        number_array.add(3);
        number_array.add(2);
        number_array.add(1);
        number_array.add(4);
        double addition = 0.0;
        for (int number : number_array){
            addition += number;
        }
        System.out.println("El promedio de los elementos del ArrayList es " + addition / number_array.size());
    }
}
