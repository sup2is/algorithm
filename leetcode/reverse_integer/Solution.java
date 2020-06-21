package reverse_integer;

public class Solution {

    public static int reverse(int x) {

        int value = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        if(x < 0) {
            sb.delete(0, 1);
        }

        sb.reverse();

        try {
            value = Integer.parseInt(sb.toString());
        }catch (NumberFormatException e){
            return 0;
        }

        if(x < 0) {
            value *= -1;
        }

        return value;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));

    }

}
