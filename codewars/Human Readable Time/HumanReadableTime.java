//Human Readable Time: https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java Complete

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hour = seconds / 3600;
        seconds %= 3600;

        int minute = seconds / 60;
        seconds %= 60;

        return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", seconds);
    }
}
