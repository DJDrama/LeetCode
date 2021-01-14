/**
 * https://leetcode.com/problems/custom-sort-string/
 **/

public class CustomSortString_Java {
    // O(S.length + T.length) time complexity
    // O(T.length) space complexity
    String customSortString(String S, String T) {
        int[] arr = new int[26];

        for (char c : T.toCharArray()) {
            arr[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            for (int i = 0; i < arr[c - 'a']; i++) {
                sb.append(c);
            }
            arr[c - 'a'] = 0;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < arr[c - 'a']; i++)
                sb.append(c);
        }
        return sb.toString();
    }
}

class Main {
    public static void main(String[] args) {
        CustomSortString_Java c = new CustomSortString_Java();

        String S = "cba";
        String T = "abcd";

        System.out.println(c.customSortString(S, T));
    }
}
