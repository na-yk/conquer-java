// 코딩테스트 입문
// Lv.0
// 한 번만 등장한 문자

import java.util.Arrays;

class OneTimeChar {
    public String solution(String s) {
        String temp = "";   // s에서 하나만 있는 문자를 저장할 문자열 변수
        
        int len = s.length();
        for(int i=0;i<len;i++){
            char cur = s.charAt(i);
            if(isOnly(s, cur)) temp+=cur;   // s에 cur이 하나만 있다면 cur을 추가
            else continue;
        }
        
        char[] answerArr = temp.toCharArray(); // temp 문자열을 char형 배열로 변환
        Arrays.sort(answerArr);     // 정렬
        String answer = new String(answerArr);  // 정렬된 배열을 다시 문자열로 변환
        return answer;
    }

    // 문자열 s에서 target이 한 번만 있는지 확인하는 함수
    private Boolean isOnly(String s, char target){
        int len = s.length();
        int count = 0;
        for(int i=0;i<len;i++){
            char cur = s.charAt(i);
            if (cur==target){
                count++;
            }
        }
        
        if(count>1) return false;
        else return true;
    }
}