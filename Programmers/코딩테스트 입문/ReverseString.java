// 코딩테스트입문
// Lv.0
// 문자열 뒤집기

class ReverseString {
    public String solution(String my_string) {
        String answer = "";
        int len = my_string.length();
        
        for (int i=len-1;i>=0;i--){
            answer+=my_string.charAt(i);    // string.charAt(index): string에서 해당 index에 있는 문자(char)를 반환함
        }
        return answer;
    }
}
