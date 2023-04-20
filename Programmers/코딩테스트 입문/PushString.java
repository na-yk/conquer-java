// 코딩테스트입문
// Lv.0
// 문자열 밀기

class PushString {
    public int solution(String A, String B) {
        int answer = -1;
        int len = A.length();
        
        for(int i=0;i<len;i++){
            if(compare(A, B, i)){
                answer = i;
                break;
            }
            else
                continue;
        }
        return answer;
    }
    
    // A를 n만큼 민 결과가 B와 같은지 확인하는 함수
    private Boolean compare(String A, String B, int n){
        int len = A.length();
        int[] index = new int[len];
        
        // n이 0보다 클 때
        if (n>0){
            // B의 문자의 A에서의 인덱스를 배열에 저장함 
            for(int i=0;i<len;i++){
                index[i] = len-n+i;
                if (index[i]>len-1)
                    index[i] = i-n;
            }
            // A와 B의 각 자리를 비교함
            for(int i=0;i<len;i++){
                if ((B.charAt(i))==(A.charAt(index[i])))
                    continue;
                else
                    return false;
            }
        }
        else   // n이 0이면
            return A.equals(B);     // A와 B가 일치하는지만 확인하면 됨
        
        return true;
    }
}