// 코딩테스트입문
// Lv.0
// n의 배수 고르기

import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n == 0)
                temp.add(numlist[i]);
            else
                continue;
        }
        
        int len = temp.size();
        int[] answer = new int[len];
        for(int i=0;i<len;i++){
            answer[i] = (int)temp.get(i);
        }
        return answer;
    }
}