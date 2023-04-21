// 코딩테스트입문
// Lv.0
// 대문자와 소문자

class UpperLower {
    public String solution(String my_string) {
        String answer = "";
        int len = my_string.length();
        
        for(int i=0;i<len;i++){
            char cur = my_string.charAt(i);
            if(isUpper(cur)){
                int temp = cur-'A'+'a'; // ASCII 이용해서 계산
                answer+=((char)temp);   // 해당 코드를 문자로 변환
            }
            else{
                int temp = cur-'a'+'A';
                answer+=((char)temp);
            }
        }
        return answer;
    }
    
    // char형 변수 c가 대문자인지 소문자인지 판별하는 함수
    private Boolean isUpper(char c){    
        if(c >= 'a' && c<='z')
            return false;
        else if(c >= 'A' && c <= 'Z')
            return true;
        
        return false;
    }
}