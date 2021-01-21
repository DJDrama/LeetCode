import java.util.Stack;

/**
 * https://leetcode.com/problems/basic-calculator/
 **/

public class BasicCalculator {

    // O(n) time complexity (n=length of the string)
    // O(n) space complexity (n=length of the string)
    public int calculate(String s) {
        Stack<Integer> stack = new Stack();
        int res = 0;
        int op = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                op = 10 * op + (ch - '0');
            } else if (ch == '+') {
                res += sign * op;
                sign = 1;
                op = 0;
            } else if (ch == '-') {
                res += sign * op;
                sign = -1;
                op = 0;
            } else if (ch == '(') {
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
            } else if (ch == ')') {
                res += sign * op;
                res *= stack.pop();
                res += stack.pop();
                op = 0;
            }
        }

        // + sign*op is for the last digit
        return res + sign * op;
    }
}

class Main {
    public static void main(String[] args) {
        BasicCalculator b = new BasicCalculator();
        String s = "1 + 1";
        System.out.println(b.calculate(s)); // output: 2

        s = " 2-1 + 2";
        System.out.println(b.calculate(s)); // output: 3

        s = "3-(1+2)";
        System.out.println(b.calculate(s)); // output: 0

        s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(b.calculate(s)); // output: 23
    }
}
