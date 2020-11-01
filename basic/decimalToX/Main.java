package decimalToX;

public class Main {

    public static void main(String[] args) {

        int value = 125;

        String binary = decimalToX(value, 2);
        System.out.println(binary);
        String octal = decimalToX(value, 8);
        System.out.println(octal);
        String hexadecimal = decimalToX(value, 16);
        System.out.println(hexadecimal);


        System.out.println(xToDecimal(binary, 2));
        System.out.println(xToDecimal(octal, 8));
        System.out.println(xToDecimal(hexadecimal, 16));

    }

    private static String decimalToX(int value, int target) {
        StringBuilder sb = new StringBuilder();
        while (value > target) {
            int mod = value % target;
            value /= target;

            if(mod >= 10) {
                mod -= 10;
                sb.append((char) (mod + 'A'));
            } else {
                sb.append(mod);
            }
        }
        sb.append(value);
        return sb.reverse().toString();
    }


    private static int xToDecimal(String value, int target) {

        int l = value.length() - 1;
        int ans = 0;

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if(c >= 'A') {
                ans += (c - 55) * Math.pow(target, l--);
            }else {
                ans += (c - '0') * Math.pow(target, l--);
            }
        }
        return ans;
    }

}
