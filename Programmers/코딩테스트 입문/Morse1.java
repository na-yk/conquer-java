// 코딩테스트 입문
// Lv.0
// 모스부호(1)


import java.util.HashMap;

class Morse1 {
    public String solution(String letter) {
        String answer = "";
        
        HashMap m = new HashMap();
        m.put(".-","a");m.put("-...","b");m.put("-.-.","c");m.put("-..","d");m.put(".","e");m.put("..-.","f");m.put("--.","g");m.put("....","h");m.put("..","i");m.put(".---","j");m.put("-.-","k");m.put(".-..","l");m.put("--","m");m.put("-.","n");m.put("---","o");m.put(".--.","p");m.put("--.-","q");m.put(".-.","r");m.put("...","s");m.put("-","t");m.put("..-","u");m.put("...-","v");m.put(".--","w");m.put("-..-","x");m.put("-.--","y");m.put("--..","z");
       
        String[] letters = letter.split(" ");
        for(int i=0;i<letters.length;i++){
            answer+=m.get(letters[i]);
        }
        
        return answer;
    }
}