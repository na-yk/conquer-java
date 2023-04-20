// 코딩테스트입문
// Lv.0
// 팩토리얼

class Factorial {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=10;i>0;i--){
            if (factorial(i)<=n){
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    private int factorial(int n){
        if (n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}