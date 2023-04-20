// 코딩테스트입문
// Lv.0
// 컨트롤 제트

class CtrlZ {
    public int solution(String s) {
        int answer = 0;
        String[] e = s.split(" ");
        int len = e.length;
        
        int before = Integer.parseInt(e[0]);
        for(int i=0;i<len;i++){
            if(!e[i].equals("Z")){
                answer+=Integer.parseInt(e[i]);
                before = Integer.parseInt(e[i]);
            }
            else
                answer-=before;
        }
        return answer;
    }
}