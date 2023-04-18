// 코딩테스트 입문
// Lv.0
// 배열 자르기

class SliceArray {
    public int[] solution(int[] numbers, int num1, int num2) {
        int len = num2-num1+1;
        int[] answer = new int[len];
        
        System.arraycopy(numbers,num1,answer,0,len);
        // numbers[num1]에서 answer[0]으로 len개의 데이터를 복사함
        
        return answer;
    }
}