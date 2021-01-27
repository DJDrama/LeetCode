/**
 * https://leetcode.com/problems/decode-xored-array/
 */
public class DecodeXORedArray {
    // O(n) time complexity (encoded.length)
    // O(n) space complexity (encoded.length+1)
    int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;

        for (int i = 1; i < res.length; i++) {
            res[i] = res[i - 1] ^ encoded[i - 1];
        }
        return res;
    }
}

class M {
    public static void main(String[] args) {
        int[] encoded = {1, 2, 3};
        int first = 1;
        DecodeXORedArray d = new DecodeXORedArray();
        int[] res = d.decode(encoded, first);
        for (int r : res)
            System.out.print(r + " "); // Ouput: 1 0 2 1
    }
}
