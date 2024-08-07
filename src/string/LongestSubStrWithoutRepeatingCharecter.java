package string;

public class LongestSubStrWithoutRepeatingCharecter {

    public static int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; // for ASCII characters
        int ans = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // Update the start if the current character was seen and its previous position is within the current substring
            start = Math.max(start, lastIndex[currentChar]);

            // Update the answer
            ans = Math.max(ans, end - start + 1);

            // Store the next index for current character
            lastIndex[currentChar] = end + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Expected output: 3
    }
}
