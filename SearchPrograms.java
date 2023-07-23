public class SearchPrograms {
    public static void main(String[] args) {
        int[] array = {34,45,12,50,1,10};
        boolean result = linearSearch(array,2);
        System.out.println("linearSearch "+result);
        array=SortingPrograms.quickSort(array,0,array.length-1);
        result=binarySearch(array,2);
        System.out.println("binarySearch "+result);
    }

    public static boolean linearSearch(int[] array,int elementToFind){
        boolean result=false;
        for(int counter=0;counter<array.length;counter++){
            if(array[counter]==elementToFind){
                result=true;
                break;
            }
        }
    return result;
    }

    public static boolean binarySearch(int[] array,int elementToFind){
        boolean result=false;
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int mid = left+((right-left)/2);
            if(array[mid]==elementToFind){
                result = true;
                break;
            }
            else if(elementToFind<array[mid]){
                right=mid-1;
            }
            else{
                left = mid+1;
            }
        }
    return result;
    }
}
