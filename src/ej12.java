import java.util.ArrayList;
import java.util.Scanner;
public class ej12 {
    public static void main(String[] args) {
        /*
        12.	Busca un elemento específico en un ArrayList de cadenas y devuelve su índice.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> string_array = new ArrayList<>();
        string_array.add("hola");
        string_array.add("tenis");
        string_array.add("jugar");
        string_array.add("matias");
        System.out.print("Ingrese el elemento a buscar: ");
        String look_for = sc.nextLine();
        for (int i = 0; i < string_array.size(); i++){
            if (string_array.get(i).equals(look_for)){
                System.out.println("Indice del elemento: " + i);
            }
        }
    }
}
