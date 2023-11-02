import java.util.ArrayList;
public class ej4 {
    public static void main(String[] args) {
        /*
        4.	Encuentra la longitud (número de elementos) de un ArrayList de caracteres.
         */
        ArrayList<Character> character_list = new ArrayList<>();
        character_list.add('a');
        character_list.add('b');
        character_list.add('c');
        character_list.add('d');
        System.out.println("La longitud del ArrayList de caracteres es " + character_list.size());
    }
}
