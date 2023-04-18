// 코딩테스트 입문
// Lv.0
// 양꼬치

class LambSkewers {
    public int solution(int n, int k) {
        int answer = 0;
        
        int service = n/10;  // 서비스로 받을 수 있는 음료수의 수
        int beverage = k-service;   // 값을 치러야 하는 음료수의 수
        
        answer = n * 12000 + beverage * 2000; // 총 지불해야 하는 금액
        
        return answer;
    }
}