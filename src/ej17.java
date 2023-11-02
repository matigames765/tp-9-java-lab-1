import java.util.ArrayList;
import java.util.Collections;
public class ej17 {
    public static void main(String[] args) {
        /*
        17.	Elimina todos los elementos duplicados de un ArrayList de cadenas.

       */
        ArrayList<String> string_array = new ArrayList<>();
        ArrayList<String> elements_array = new ArrayList<>();
        string_array.add("hola");
        string_array.add("tenis");
        string_array.add("jugar");
        string_array.add("matias");
        string_array.add("tenis");
        string_array.add("hola");
        for (int i = 0; i < string_array.size(); i++){
            if (Collections.frequency(string_array,string_array.get(i)) > 1){
                String str = string_array.get(i);
                for (int j = 0; j < string_array.size(); j++){
                    if (str.equals(string_array.get(j))){
                        string_array.remove(j);
                    }
                }
            }
        }
        System.out.println("El ArrayList sin elementos duplicados queda:");
        System.out.println(string_array);
    }
}
