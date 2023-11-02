import java.util.ArrayList;
import java.util.Scanner;
public class ej24 {
    public static void main(String[] args) {
        /*
        24.	Encuentra la cantidad de veces que un elemento específico aparece en un
        ArrayList de cadenas.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> string_array = new ArrayList<>();
        string_array.add("hola");
        string_array.add("tenis");
        string_array.add("jugar");
        string_array.add("matias");
        string_array.add("tenis");
        string_array.add("hola");
        System.out.print("Ingresa una cadena que quieras saber cuantas veces se encuentra en el array: ");
        String str = sc.nextLine();
        int coincidences = 0;
        for (String cad : string_array){
            if (cad.equals(str)){
                coincidences++;
            }
        }
        System.out.println("La cadena se encuentra " + coincidences + " vez/veces");
    }
}
