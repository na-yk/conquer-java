// 코딩테스트 입문
// Lv.0
// 숨어있는 숫자의 덧셈(1)

class AddHiddenNums1 {
    public int solution(String my_string) {
        int answer = 0;
        
        String nums = "";
        char cur = ' ';
        for(int i=0;i<my_string.length();i++){
            cur = my_string.charAt(i);
            if(cur>='0' && cur<='9')
                nums+=cur;
        }
        
        char[] numsArr = nums.toCharArray();
        for(int i=0;i<numsArr.length;i++){
            answer += (numsArr[i]-'0');
        }
        return answer;
    }
}