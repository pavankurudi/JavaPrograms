public class Merge2Arrays {
    public static void main(String[] args) {
        int[] arrA = {1,3,5,7};
        int[] arrB = {8};
        int[] arrC = new int[arrA.length+arrB.length];
        arrC = mergeArrays(arrA,arrB,arrC);
        for(int i=0;i< arrC.length;i++){
            System.out.println(arrC[i]);
        }
    }

    public static int[] mergeArrays(int[]A,int[]B,int[]C){
        int x=0,y=0,z=0;
        int len1 = A.length;
        int len2 = B.length;

        while(x<len1 && y<len2){
            if(A[x]<B[y]){
               C[z++] = A[x++];
            }
            else{
                C[z++] = B[y++];
            }
        }
        while(x<len1){
            C[z++] = A[x++];
        }
        while(y<len2){
            C[z++] = B[y++];
        }
        return C;
    }
}
