public class Sort0s1s {
    public static void main(String[] args) {
        int[] array = {0,1,1,1,0,0,0};
        array = sort0s1s(array);
        SortingPrograms.printArray(array);
    }

    public static int[] sort0s1s(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start<end){
            if(array[start]==0){
                start++;
            }
            if(array[end]!=0){
                end--;
            }
            if(array[start]!=0 && array[end]==0){
                SortingPrograms.swap(array,start,end);
                start++;
                end--;
            }
        }
    return array;
    }
}
