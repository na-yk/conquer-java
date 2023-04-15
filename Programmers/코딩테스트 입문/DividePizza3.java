// 코딩테스트입문
// Lv.0
// 피자 나눠 먹기(3)

class DividePizza3 {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if (slice >= n)
            answer = 1;
        else if (n%slice == 0)
            answer = n/slice;
        else
            answer = n/slice + 1;
        
        return answer;
    }
}
