// 코딩테스트입문
// Lv.0
// 짝수 홀수 개수

class EvenOddNum {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int len = num_list.length;
        int even = 0, odd = 0;
        
        for(int i=0;i<len;i++){
            if (num_list[i]%2 == 0) //짝수인 경우
                even+=1;
            else
                odd+=1;
        }
        
        answer[0] = even;
        answer[1] = odd;
        
        return answer;
    }
}