// 코딩테스트 입문
// Lv.0
// 공 던지기

class ThrowingBall {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int len = numbers.length;
        
        // 오른쪽 두 칸 옆 사람이 누구인지 저장
        int[] rights = new int[len];
        for (int i=0;i<len;i++){
            if (i == (len-1))
                rights[i] = 2;
            else if (i == (len-2))
                rights[i] = 1;
            else rights[i] = numbers[i]+2;
        }
        
    
        int cur = numbers[0];   // 현재 공을 가지고 있는 사람
        for(int i=0;i<k-1;i++){
            cur = rights[cur-1];
        }
        answer = cur;
        
        return answer;
    }
}