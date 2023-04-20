// 코딩테스트입문
// Lv.0
// 문자열 정렬하기(1)

import java.util.Arrays;

class SortString1 {
    public int[] solution(String my_string) {
        
        // my_string에서 숫자만 뽑아 문자열로 만들기
        String nums = "";
        char cur = ' ';
        for(int i=0;i<my_string.length();i++){
            cur = my_string.charAt(i);
            if(cur>='0' && cur<='9')
                nums+=cur;
        }
        
        int len = nums.length();
        
        int[] answer = new int[len];
        char[] numsArr = nums.toCharArray();   // 문자열을 char형 배열로 변환
        
        for(int i=0;i<len;i++){
            answer[i] = numsArr[i]-'0';
        }
        Arrays.sort(answer);
        
        return answer;
    }
}