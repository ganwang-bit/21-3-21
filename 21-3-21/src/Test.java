//import java.util.Arrays;
//public class Test {
//    public static int arrmax(int[] arr){
//        int max=arr[0];
//        for (int i = 1; i <arr.length ; i++) {
//            if(arr[i]>max)
//                max=arr[i];
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int[] arr={1,2,4,5,6,7,10,645,956,212,1548};
//        System.out.println(arrmax(arr));
//        int[] arr2=new int[10];
//        Arrays.fill(arr2,0);
//        System.out.println(Arrays.toString(arr2));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.binarySearch(arr,7));
//
//    }
//}
import java.util.*;
public class Test {
    public static void main(String[] args){
//        int a=10;
//        int b=a;
//        System.out.println(a);
//        b=20;
//        System.out.println(a);
        int[][] arr={{1,2,3},{2,1,4},{5,4,8}};
        int[][] arr2=arr.clone();
        System.out.println(arr[0][0]);
        arr2[0][0]=10;
        System.out.println(arr[0][0]);
        System.out.println(Arrays.deepToString(arr));
    }
}