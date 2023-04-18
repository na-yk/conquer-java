// 코딩테스트입문
// Lv.0
// 진료순서 정하기

import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];

        // emergency 정렬하여 다른 배열에 저장
        int[] sortedEmer = new int[len];
        System.arraycopy(emergency,0,sortedEmer,0,len);
        Arrays.sort(sortedEmer);
        
        int priority = 0;
        int cur = 0;
        for (int i=0;i<len;i++){
            cur = emergency[i];
            priority = len-searchInt(sortedEmer, cur);  // 진료 우선순위 구하기
            answer[i] = priority;
        }
        
        return answer;
    }
    
    // int형 배열에서는 Arrays.indexOf()가 되지 않는가?
    // 배열 data에서 정수 target의 위치를 찾아 반환하는 함수
    private int searchInt(int[] data, int target){
        int len = data.length;
        int result = 0;
        for(int i=0;i<len;i++){
            if (data[i] == target){
                result = i;
                break;
            }  
        }
        return result;
    }
}