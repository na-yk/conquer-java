// 코딩테스트입문
// Lv.0
// 연속된 수의 합

class SumOfNums {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int start = 0;
        if (num%2==0){
            int temp = total/(num/2);   // temp = start + end
            start = (temp-(num-1))/2;   // start = end-(num-1)
        }
        else{
            int mid = total/num; // 연속된 수의 중간값
            start = mid-(num/2);
        }
        
        for(int i=0;i<num;i++)
            answer[i] = start+i;
        
        return answer;
    }
}