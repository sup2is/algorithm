//로또의 최고 순위와 최저 순위: https://programmers.co.kr/learn/courses/30/lessons/77484 Complete

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int correctCnt = 0;
        int zeroCnt = 0;
        
        boolean[] myNums = new boolean[46];
        
        for(int l : lottos) {
            myNums[l] = true;
            if(l == 0) {
                zeroCnt ++;
            }
        }
        
        for(int w : win_nums) {
            if(myNums[w]) {
                correctCnt ++;
            }
        }
        
        int max = getRank(correctCnt + zeroCnt);
        int min = getRank(correctCnt);
        
        return new int[]{max, min};
    }
    
    public int getRank(int i) {
        switch (i) {
            case 6: 
                return 1;
            case 5: 
                return 2;
            case 4: 
                return 3;
            case 3: 
                return 4;
            case 2: 
                return 5;
            default :
                return 6;
        }
    }
}
