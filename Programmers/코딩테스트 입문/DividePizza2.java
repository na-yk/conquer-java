// 코딩테스트입문
// Lv.0
// 피자 나눠 먹기(2)

class DividePizza2 {
    // n과 6의 최소공배수를 구해야 함
    public int solution(int n) {
        int answer = 0;
        int gcd = 0;
        
        // 최소공배수를 구하는 법
        int min = (6 < n) ? 6 : n;
        for (int i=1; i<=min; i++){
            if (6%i == 0 && n%i == 0)
                gcd = i;
        }
        
        // 최소공배수에서 6(조각)을 나눠야 함
        answer = ((6 * n) / gcd) / 6;
        
        return answer;
    }
}


