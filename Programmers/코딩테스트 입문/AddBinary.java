// 코딩테스트입문
// Lv.0
// 이진수 더하기

class AddBinary {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int dec1 = Integer.parseInt(bin1, 2); // 두 번째 인자는 2진수 문자열을 변환하겠다는 뜻
        int dec2 = Integer.parseInt(bin2, 2);

        int temp = dec1 + dec2;

        answer = Integer.toBinaryString(temp);
        return answer;
    }
}