public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] array = {2,1,0,0,2,1,0,1,2,1,0,2};
        array = sort0s1s2s(array);
        SortingPrograms.printArray(array);
    }

    public static int[] sort0s1s2s(int[] array){
        int start = 0;
        int end = array.length-1;
        int mid = 0;

        while(mid<end){
            if(array[mid]==0){
                SortingPrograms.swap(array,start,mid);
                start++;
                mid++;
            }
            if(array[mid]==1){
                mid++;
            }
            if(array[mid]==2){
                SortingPrograms.swap(array,mid,end);
                end--;
            }
        }
    return array;
    }
}
