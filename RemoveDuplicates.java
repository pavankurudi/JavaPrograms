import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {34,45,12,34,45};
        array = removeDuplicate(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static int[] removeDuplicate(int[] array){
        Set<Integer> integer = new LinkedHashSet<>();
        for(int i=0;i<array.length;i++){
            integer.add(array[i]);
        }
        Object[] arr = integer.toArray();
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = (int)arr[i];
        }
    return temp;
    }
}
