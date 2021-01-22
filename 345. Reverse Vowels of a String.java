/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowelsOfAString {
    // O(n) time complexity (n=s.length)
    // O(n) space complexity (n=s.length)
    String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;

        char[] arr = s.toCharArray();

        while (l < r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);
            if (isVowel(cl) && isVowel(cr)) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } else if (isVowel(cl)) {
                r--;
            } else if (isVowel(cr)) {
                l++;
            } else {
                l++;
                r--;
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

class M {
    public static void main(String[] args) {
        ReverseVowelsOfAString r = new ReverseVowelsOfAString();
        String input = "leetcode";
        System.out.println(r.reverseVowels(input));
    }
}
