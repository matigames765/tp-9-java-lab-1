import java.util.ArrayList;
public class ej16 {
    public static void main(String[] args) {
        /*
        16.	Crea un ArrayList de cadenas y concatena todas las cadenas en una sola.
         */
        ArrayList<String> string_array = new ArrayList<>();
        string_array.add("hola");
        string_array.add("tenis");
        string_array.add("jugar");
        string_array.add("matias");
        String concatenated_string = "";
        for (String str : string_array){
            concatenated_string += str;
        }
        System.out.println("Todos los strings concaytenados del ArrayList quedan:");
        System.out.println(concatenated_string);
    }
}
