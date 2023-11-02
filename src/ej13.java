import java.util.ArrayList;
public class ej13 {
    public static void main(String[] args) {
        /*
        13.	Comprueba si dos ArrayLists son iguales (tienen los mismos elementos en el mismo orden).
         */
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array2.add(1);
        array2.add(4);
        array2.add(3);
        int coicidences_counter = 0;
        for (int i = 0; i < array1.size(); i++){
            if (array1.get(i) == array2.get(i)){
                coicidences_counter++;
            }
        }
        if (coicidences_counter == array2.size()){
            System.out.println("Los ArrayList son iguales");
        }else{
            System.out.println("Los ArrayList no son iguales");
        }


    }
}
