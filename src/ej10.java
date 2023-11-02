import java.util.ArrayList;
public class ej10 {
    public static void main(String[] args) {
        /*
        10.	Combina dos ArrayLists de enteros en uno solo
         */
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> combinated_array = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array2.add(4);
        array2.add(5);
        array2.add(6);
        for (int i = 0; i <= 1; i++){
            for (int j = 0; j <= 2; j++){
                if (i == 0){
                    combinated_array.add(array1.get(j));
                }else{
                    combinated_array.add(array2.get(j));
                }
            }
        }
        System.out.println("El arreglo combinado queda: " + combinated_array);
    }
}
