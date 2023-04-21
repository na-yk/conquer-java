// 코딩테스트 입문
// Lv.0
// 암호 해독

class DecryptCipher {
    public String solution(String cipher, int code) {
        String answer = "";
        int len = cipher.length()/code;
        for(int i=1;i<=len;i++){
            // Java에서 문자열은 불변->특정 인덱스만 수정하는 것은 불가능함
            // 새로운 문자열을 만들어줌
            answer+=cipher.charAt(i*code-1);
        }
        return answer;
    }
}
