/**
 * https://leetcode.com/problems/detect-capital/
 */

class Solution {
    // O(n) time complexity
    // O(1) time complexity
    public boolean detectCapitalUse(String word) {
        return isAllUpper(word) || isAllLower(word) || isFirstUpper(word);
    }

    private boolean isAllUpper(String word) {
        for (char c : word.toCharArray()) {
            if (!Character.isUpperCase(c))
                return false;
        }
        return true;
    }

    private boolean isAllLower(String word) {
        for (char c : word.toCharArray()) {
            if (!Character.isLowerCase(c))
                return false;
        }
        return true;
    }

    private boolean isFirstUpper(String word) {
        if (Character.isUpperCase(word.charAt(0))) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}