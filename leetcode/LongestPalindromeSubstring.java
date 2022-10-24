package leetcode;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        String s = "geekkeegfor";
        System.out.println(longestPalindromeSubstring(s));
    }

    static String longestPalindromeSubstring(String s) {
        int maxLength = 1;
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            int right = windowEnd;
            while(right < s.length() && s.charAt(right) == s.charAt(windowEnd)) {
                right++;
            }
            int left = windowEnd - 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            int currLength = right - left - 1;
            if(currLength > maxLength) {
                maxLength = currLength;
                windowStart = left + 1;
            }
        }
        return s.substring(windowStart, windowStart + maxLength);
    }

}
