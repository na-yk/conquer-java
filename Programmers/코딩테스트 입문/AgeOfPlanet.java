// 코딩테스트입문
// Lv.0
// 외계행성의 나이

class AgeOfPlanet {
    public String solution(int age) {
        String answer = "";
        
        String ageStr = age+""; // age를 문자열로 변환
        String alphabet = "abcdefghij"; 
        
        int cur = 0;
        for(int i=0;i<ageStr.length();i++){
            cur = (int)(ageStr.charAt(i)-'0'); // 현재 위치의 문자를 정수로 변환
            answer+=alphabet.charAt(cur);
        }
        
        
        return answer;
    }
}