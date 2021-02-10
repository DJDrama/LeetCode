/**
 * https://leetcode.com/problems/goal-parser-interpretation/
 */

public class GoalParserInterpretation {
    // O(n) time complexity (replace)
    // O(n) space complexity (replace)
    String interpret(String command) {
        String res = command;

        res = res.replace("()", "o");
        res = res.replace("(al)", "al");

        return res;
    }
}

class M {
    public static void main(String[] args) {
        GoalParserInterpretation g = new GoalParserInterpretation();
        String command = "G()()()()(al)";
        System.out.println(g.interpret(command));
    }
}