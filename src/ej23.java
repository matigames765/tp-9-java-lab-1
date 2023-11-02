import java.util.ArrayList;
import java.util.Scanner;
public class ej23 {
    public static void main(String[] args) {
        /*
        23.	Crea un ArrayList de números enteros y elimina todos los elementos
        mayores que un valor específico.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number_array = new ArrayList<>();
        number_array.add(3);
        number_array.add(2);
        number_array.add(1);
        number_array.add(4);
        System.out.print("Ingresa un numero para eliminar los mas grandes que el del array: ");
        int number = sc.nextInt();
        for (int i = 0; i < number_array.size(); i++){
            if (number_array.get(i) > number){
                number_array.remove(i);
            }
        }
        System.out.println("El array queda asi: " + number_array);
    }
}
