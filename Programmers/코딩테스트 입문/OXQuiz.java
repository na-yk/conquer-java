// 코딩테스트입문
// Lv.0
// OX 퀴즈

class OXQuiz {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] answer = new String[len];
        
        int a=0, b=0, c=0;
        String[] exp = new String[5];
        
        for (int i=0;i<len;i++){
            exp = quiz[i].split(" ");
            a = Integer.parseInt(exp[0]);
            b = Integer.parseInt(exp[2]);
            c = Integer.parseInt(exp[4]);
            
            if(((exp[1].equals("+"))?a+b:a-b) == c){
                answer[i] = "O";
            }
            else
                answer[i] = "X";
        }
        
        return answer;
    }
}
