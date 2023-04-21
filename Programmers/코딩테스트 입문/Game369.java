// 코딩테스트 입문
// Lv.0
// 369 게임

class Game369 {
    public int solution(int order) {
        int answer = 0;
        String sample = "369";

        
        String orderStr = String.valueOf(order);     // order를 String형으로 변환
        for(int i=0;i<orderStr.length();i++){
            char cur = orderStr.charAt(i);
            if (sample.contains(String.valueOf(cur))) // 현재 문자가 369에 속한 문자일 때
                answer+=1;
        }
        return answer;
    }
}