import java.util.ArrayList;

import java.util.ArrayList;
public class ej18 {
    public static void main(String[] args) {
        /*
        18.	Crea un ArrayList de enteros y encuentra la suma de los elementos en índices pares.
         */
        ArrayList<Integer> number_array = new ArrayList<>();
        number_array.add(3);
        number_array.add(2);
        number_array.add(1);
        number_array.add(4);
        int addition = 0;
        for (int i = 0; i < number_array.size(); i++){
            if(i % 2 == 0){
                addition += number_array.get(i);
            }
        }
        System.out.println("La suma de los elementos del array de indice par es " + addition);
    }
}
