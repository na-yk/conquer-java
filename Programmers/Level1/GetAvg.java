// 연습문제
// Lv.1
// 평균 구하기

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        int len = arr.length;
        double avg = (double)sum(arr) / len;
        
        answer = avg;
        
        return answer;
    }
    
    private int sum(int[] arr){
        int result = 0;
        
        for(int n: arr){
            result+=n;
        }
        
        return result;
    }
}