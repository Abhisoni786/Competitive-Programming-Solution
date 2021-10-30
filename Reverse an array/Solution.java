import java.util.*;

public class Solution {
    public void reverseArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
    }
    public String reverseString(String s) {
        char a[] = s.toCharArray();
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }

        return new String(a);
    }

    public static void moveArray(int[] a, int n){

        for (int i = 0; i <n;i++){
            if(a[i]>0){
                System.out.println("FALSE");
            }else {System.out.println("TRUE "+a[i]); }
        }
    }

    public static void main(String[] args) {
        int[] ar = new int[] { 1, 2, 3 ,5};
        Solution s = new Solution();

        String a = "abcd";

        String result = s.reverseString(a);
        System.out.println(result);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        
        moveArray(arr, n);

        

    }
}

