// 코딩테스트입문
// Lv.0
// 다항식 더하기

class PolynomialAdd {
    public String solution(String polynomial) {
        String answer = "";
        String[] exp = polynomial.split(" ");
        
        int coe = 0; //계수
        int con = 0; //상수
        for(int i=0;i<exp.length;i++){
            if(exp[i].equals("+"))
                continue;
            else if(exp[i].endsWith("x")){
                String temp = exp[i].substring(0,exp[i].indexOf('x'));
                if (temp.equals(""))
                    coe++;
                else
                    coe+=Integer.parseInt(temp);
            }
            else{
                con+=Integer.parseInt(exp[i]);
            }
        }
        
        if (coe == 1)
            answer+="x";
        else if(coe>1){
            answer+=(coe+"");
            answer+="x";
        }
        
        if (con > 0){
            if (answer.endsWith("x"))
                answer+=" + ";
            answer+=(con+"");
        }
            
        
        return answer;
    }
}