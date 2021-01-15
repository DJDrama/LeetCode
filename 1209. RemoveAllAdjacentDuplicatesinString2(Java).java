/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
 **/

public class RemoveAllAdjacentDuplicatesinString2 {
    // O(n) time complexity
    // O(n) space complexity
    String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int[] count = new int[sb.length()];

        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                count[i] = 1;
            } else {
                count[i] = count[i - 1] + 1;
                if (count[i] == k) {
                    sb.delete(i - k + 1, i + 1);
                    i -= k;
                }
            }
        }
        return sb.toString();
    }
}

class Main {
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesinString2 r = new RemoveAllAdjacentDuplicatesinString2();

        String s = "deeedbbcccbdaa";
        int k = 3;

        System.out.println(r.removeDuplicates(s, k)); // Output: "aa"
    }
}
