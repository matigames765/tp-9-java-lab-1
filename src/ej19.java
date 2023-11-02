import java.util.ArrayList;
import java.util.Scanner;
public class ej19 {
    public static void main(String[] args) {
        /*
        19.	Comprueba si un ArrayList de enteros contiene un número específico.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number_array = new ArrayList<>();
        number_array.add(3);
        number_array.add(2);
        number_array.add(1);
        number_array.add(4);
        System.out.print("Ingresa el numero que quieras saber si se encuentra en el array list: ");
        int number = sc.nextInt();
        int coincidence = 0;
        for (int num : number_array){
            if (num == number){
                coincidence++;
            }
        }
        if (coincidence > 0){
            System.out.println("El numero se encuentra en el ArrayList");
        }else{
            System.out.println("El numero no se encuentra en el ArrayList");
        }
    }
}
