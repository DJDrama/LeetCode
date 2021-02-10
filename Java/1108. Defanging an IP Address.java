/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */

public class DefangingAnIPAddress {
    // O(n) time complexity
    // O(n) space complexity
    String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c - '0');
            } else {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}

class T {
    public static void main(String[] args) {
        DefangingAnIPAddress d = new DefangingAnIPAddress();
        String input = "255.100.50.0";
        System.out.println(d.defangIPaddr(input)); // Output: 255[.]100[.]50[.]0
    }
}