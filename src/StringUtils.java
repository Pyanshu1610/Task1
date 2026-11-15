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

    public static void main(String[] args) {
        System.out.println(toBitString(10));   // 1010
    }
}