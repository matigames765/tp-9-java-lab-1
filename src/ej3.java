import java.util.ArrayList;
public class ej3 {
    public static void main(String[] args) {
        /*
        3.	Imprime todos los elementos de un ArrayList de enteros.
         */
        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(1);
        int_list.add(2);
        int_list.add(3);
        for (int number : int_list){
            System.out.println(number);
        }

    }
}
