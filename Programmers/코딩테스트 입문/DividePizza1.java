// 코딩테스트입문
// Lv.0
// 피자 나눠 먹기(1)

class DividePizza1 {
    public int solution(int n) {
        int answer = 0;
        
        if (n%7 == 0)
            answer = n/7;
        else
            answer = n/7+1;
        
        return answer;
    }
}
