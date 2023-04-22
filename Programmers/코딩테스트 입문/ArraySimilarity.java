// 코딩테스트입문
// Lv.0
// 배열의 유사도

import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        // Arrays.binarySearch는 배열이 정렬된 상태에서 사용 가능
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        for(int i=0;i<s1.length;i++){
            String cur = s1[i];
            if(Arrays.binarySearch(s2,cur) >= 0)
                answer+=1;
            else
                continue;
        }
        return answer;
    }
    
}
