// 코딩테스트입문
// Lv.0
// 자릿수 더하기

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String nStr = String.valueOf(n);
        for(int i=0;i<nStr.length();i++){
            char cur = nStr.charAt(i);
            answer+=(cur-'0');
        }
        return answer;
    }
}