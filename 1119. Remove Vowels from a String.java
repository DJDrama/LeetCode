/**
 * https://leetcode.com/problems/remove-vowels-from-a-string/
 */

public class RemoveVowelsFromAString {
    // O(n) time complexity (n=s.length)
    // O(n) space complexity (n=s.length)
    String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}

class M {
    public static void main(String[] args) {
        RemoveVowelsFromAString r = new RemoveVowelsFromAString();
        String input = "leetcodeisacommunityforcoders";
        System.out.println(r.removeVowels(input)); // output: ltcdscmmntyfrcdrs
    }
}
