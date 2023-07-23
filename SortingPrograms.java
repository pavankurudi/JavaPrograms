import java.util.Random;

public class SortingPrograms {
    public static void main(String[] args) {
        int[] array={12,34,1,56,7,9,100,1};
        //printArray(bubbleSort(array));
        printArray(quickSort(array,0, array.length-1    ));
    }
    public static void swap(int[] array,int elementA,int elementB){
        int temp = array[elementA];
        array[elementA]=array[elementB];
        array[elementB]=temp;
    }

    public static void printArray(int[] array){
        for (int counter=0;counter<array.length;counter++){
            System.out.println(array[counter]);
        }
    }
    public static int[] bubbleSort(int[] array){
        for(int counterA=0;counterA<array.length;counterA++){
            for(int counterB=0;counterB<array.length-counterA-1;counterB++){
                if(array[counterB]>array[counterB+1]){
                    swap(array,counterB,counterB+1);
                }
            }
        }
        return array;
    }

    public static int[] quickSort(int[] array,int lowIndex,int highIndex){
        if(lowIndex>highIndex){
            return array;
        }
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer<rightPointer){
            while (array[leftPointer]<=pivot && leftPointer<rightPointer){
                leftPointer++;
            }
            while (array[rightPointer]>=pivot && leftPointer<rightPointer){
                rightPointer--;
            }
        swap(array,leftPointer,rightPointer);
        }
        swap(array,leftPointer,highIndex);
        quickSort(array,lowIndex,leftPointer-1);
        quickSort(array,leftPointer+1,highIndex);
    return array;
    }


}
