import java.util.*;
import java.io.*;

public class Solution {
    public static int[][] pairSum(int[] A, int s) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == s) {
                    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(A[i], A[j]));
                    Collections.sort(list2);
                    list.add(list2);
                }
            }
        }

        int[][] res = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i).get(0);
            res[i][1] = list.get(i).get(1);
        }
        Arrays.sort(res, (a, b) -> Integer.compare(a[0], b[0]));

        return res;

    }

    // Driver Code
    public static void main(String[] args) throws IOException {

       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[][] res = pairSum(A, s);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

       sc.close();
        


    }
}
