import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */

public class KidsWithTheGreatestNumberOfCandies {
    // O(n) time complexity (2 linear : 2n --> O(n))
    // O(n) space complexity
    List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList();
        int max = 0;
        for (int candy : candies)
            max = Math.max(max, candy);
        for (int candy : candies)
            res.add(candy + extraCandies >= max);
        return res;
    }
}

class T {
    public static void main(String[] args) {
        KidsWithTheGreatestNumberOfCandies k = new KidsWithTheGreatestNumberOfCandies();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> res = k.kidsWithCandies(candies, extraCandies);
        for (Boolean v : res) {
            System.out.print(v + " "); // true,true,true,false,true
        }
    }
}