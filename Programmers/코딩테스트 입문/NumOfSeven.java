// 코딩테스트입문
// Lv.0
// 7의 개수

import java.util.Arrays;

class NumOfSeven {
    public int solution(int[] array) {
        int answer = 0;

        // 정규표현식을 사용해서 ['[', ']', ' ', ','] 안에 있는 문자열은 제거함
        String arrStr = Arrays.toString(array).replaceAll("[\\[\\] ,]", "");
        System.out.println(arrStr);
        
        // 해당 문자열에서 7의 개수 세기
        for(int i=0;i<arrStr.length();i++){
            if(arrStr.charAt(i)=='7')
                answer++;
        }
        return answer;
    }
}