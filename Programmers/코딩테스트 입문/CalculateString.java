// 코딩테스트입문
// Lv.0
// 문자열 계산하기

class CalculateString {
    public int solution(String my_string) {
        int answer = 0;
        String[] exp = my_string.split(" ");
        
        answer+=Integer.parseInt(exp[0]);
        int sign = 1;
        for(int i=1;i<exp.length;i++){
            if(exp[i].equals("+"))
                sign = 1;
            else if(exp[i].equals("-"))
                sign = -1;
            else
                answer+=Integer.parseInt(exp[i])*sign;
        }
        return answer;
    }
}