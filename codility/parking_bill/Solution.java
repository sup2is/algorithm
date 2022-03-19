// parking_bill: https://app.codility.com/programmers/trainings/5/parking_bill/start/ Complete

import java.util.*;
import java.time.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String E, String L) {

        int eSec = LocalTime.parse(E).toSecondOfDay();
        int lSec = LocalTime.parse(L).toSecondOfDay();
        int fare = 0;

        int differ = lSec - eSec;
        
        if (differ <= 3600) {
            return 2 + 3;
        }

        int hour = (differ / 3600);
        
        if (differ % 3600 != 0) {
            hour ++;
        }

        for(int i = 0; i < hour; i ++) {
            if (i == 0) {
                fare += 3;
            } else {
                fare += 4;
            }
        }

        return fare + 2;
    }
}
