import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class gfgPattern {
    public static void main(String[] args) {
            int arr[]={1,2,0,4,3,0,5,0};
            int count=0;
//            int first=0, second= arr.length-1;
//         for(int i= arr.length-1; i>=0; --i){
//             System.out.print(arr[i]+" ");
//         }
        Stack<Integer> sc=new Stack<>();
        for(int i=0; i<arr.length; i++){
            sc.add(arr[i]);
        }
        while (!sc.isEmpty()){
            System.out.print(sc.pop());
        }
    }
}
