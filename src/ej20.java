import java.util.ArrayList;
public class ej20 {
    public static void main(String[] args) {
        /*
        20.	Encuentra el elemento en un ArrayList de cadenas que tiene la longitud más larga.
         */
        ArrayList<String> string_array = new ArrayList<>();
        string_array.add("hola");
        string_array.add("tenis");
        string_array.add("jugar");
        string_array.add("matias");
        String bigger_length = string_array.get(0);
        for (String str : string_array){
            if (bigger_length.length() < str.length()){
                bigger_length = str;
            }
        }
        System.out.println("La cadena de longitud mas larga del ArrayList es " + bigger_length);
    }
}
