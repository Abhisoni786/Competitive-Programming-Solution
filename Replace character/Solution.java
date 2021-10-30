import java.util.*;

public class Solution {
    public static String replaceCharacter(String input, char c1, char c2) {
      
        StringBuffer s = new StringBuffer();
        for (char c : input.toCharArray()) {

            if (c == c1) {
                s.append(c2);
            } else {
                s.append(c);
            }

        }

        return s.toString();

    }

    // Driver Code
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c1 = in.next().charAt(0);
        char c2 = in.next().charAt(0);
        String result = replaceCharacter(s, c1, c2);
        System.out.println(result);
    
        in.close();

    }
}
