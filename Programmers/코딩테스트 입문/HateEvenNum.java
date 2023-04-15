// 코딩테스트입문
// Lv.0
// 짝수가 싫어요

import java.util.*;

class HateEvenNum {
    public int[] solution(int n) {
        // answer 길이를 결정하기
        int len = 0;
        if (n%2 == 0)
            len = n/2;
        else
            len = n/2+1;
        
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++){
            answer[i] = i*2+1;
        }
        
        return answer;
    }
}