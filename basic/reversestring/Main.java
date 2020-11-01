package reversestring;

public class Main {

    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet";
        System.out.println(str);
        str = reverseString(str);
        System.out.println(str);
    }

    private static String reverseString(String str) {

        int start = 0;
        int end = str.length() - 1;
        char[] chars = str.toCharArray();

        while (start < end) {
            swap(start, end, chars);
            start ++;
            end --;
        }

        return new String(chars);

    }

    private static void swap(int start, int end, char[] chars) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }
}
