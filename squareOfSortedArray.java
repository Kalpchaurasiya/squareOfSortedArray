import java.util.*;
import java.lang.Math;
class squareOfSortedArray{
    static int[] SquareArray(int[] arr){
        int n = arr.length;
        int left=0; int right = n-1;
        int[] ans = new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[right])< Math.abs(arr[left])){
                ans[k++] = arr[left]*arr[left];
                left ++;
            }
            else{
                ans[k++] = arr[right]*arr[right];
                right --;
            }
        }
        return ans;
    }
static void reverseArray(int[] arr){
    int i=0; int j= arr.length-1;
    while(i<j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    
}
static void PrintArray(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

public static void main(String[] args){
    int[] arr = {-10,-3,-2,1,4,5};
    System.out.println("before");
    PrintArray(arr);
    int[] ans = SquareArray(arr);
    System.out.println();
    System.out.println("after");
    reverseArray(ans);
    PrintArray(ans);
}
}