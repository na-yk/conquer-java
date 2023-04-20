// 코딩테스트입문
// Lv.0
// 모음 제거

class RemoveVowels {
    public String solution(String my_string) {
        String answer = my_string;
        String[] vowels = {"a", "e", "i", "o", "u"};
        
        for(int i=0;i < 5;i++){
            // 해당 모음의 자리를 ""(공백)으로 대체함
            answer = answer.replace(vowels[i],"");
            
        }
        
        return answer;
    }
}