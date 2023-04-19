// 코딩테스트입문
// Lv.0
// 개미 군단

class AntsArmy {
    public int solution(int hp) {
        int answer = 0;
        int[] antHp = {5, 3, 1};
        
        int curAnt = 0;
        for(int i=0;i<3;i++){
            curAnt = antHp[i];
            answer+=(hp/curAnt);
            hp = hp%curAnt;
            
        }
        return answer;
    }
}
