// 연습문제
// Lv.1
// 짝수와 홀수

class Solution {
    public String solution(int num) {
        String answer = "";
        
        if (num%2 == 0)
            answer+="Even";
        else
            answer+="Odd";
            
        return answer;
    }
}