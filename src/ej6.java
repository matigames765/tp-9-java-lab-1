import java.util.ArrayList;

public class ej6 {
    public static void main(String[] args) {
        /*
        6.	Comprueba si un ArrayList de números enteros está vacío.
         */
        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(5);
        int_list.add(6);
        int_list.add(7);
        if (int_list.isEmpty()){
            System.out.println("El array de enteros esta vacio");
        }else{
            System.out.println("El array de enteros no esta vacio");
        }
    }
}
