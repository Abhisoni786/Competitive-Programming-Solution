import java.util.*;
// Since this is a functional problem you don't have to worry about input, you just have to complete the function convertFive().

// Constraints:
// 1 <= T <= 103
// 1 <= N <= 104

// Example:
// Input
// 2
// 1004
// 121

// Output
// 1554
// 121

// Explanation:
// Testcase 1:  At index 1 and 2 there is 0 so we replace it with 5.
// Testcase 2: There is no ,0 so output will remain same.
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Solution.convertFive(n);
        }

        sc.close();
    }
}// } Driver Code Ends

/* Complete the function below */
class Solution {
    public static void convertFive(int n) {
        // Write your code here.
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb.append('5');
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    
    }
}