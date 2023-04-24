// 코딩테스트입문
// Lv.0
// 옹알이(1)

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int len = babbling.length;
        
        for(int i=0;i<len;i++){
            if(isBabbling(babbling[i]))
                answer+=1;
            else
                continue;
        }
        return answer;
    }
    
    // 머쓱이가 발음할 수 있는 옹알이인지 확인하는 함수
    private boolean isBabbling(String str){
        String[] samples = {"aya", "ye", "woo", "ma"};
        String babbling = str;
        for(int i=0;i<4;i++){
            String temp = str.replace(samples[i],"*");
            babbling = babbling.replace(samples[i],"*");
            if(countStar(temp)>1)
                return false;
            else
                continue;
        }
        if(countStar(babbling) == babbling.length())
            return true;
        else
            return false;
        
    }
    
    // 문자열에서 "*"의 수를 세서 반환하는 함수
    private int countStar(String str){
        int len = str.length();
        int count = 0;
        for(int i=0;i<len;i++){
            if(str.charAt(i) == '*')
                count++;
        }
        return count;
    }
}