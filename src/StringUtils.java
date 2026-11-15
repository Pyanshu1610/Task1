public class StringUtils {

    public static String toBitString(int num) {
        String bits = "";
        if (num == 0) {
            bits = "0";
        }
        while (num != 0) {
            bits = (num & 1) + bits;
            num >>>= 1;
        }
        return bits;
    }
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(toBitString(10));   // 1010
    }
}