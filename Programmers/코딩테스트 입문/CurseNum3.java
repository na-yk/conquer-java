// 코딩테스트입문
// Lv.0
// 저주의 숫자 3

class CurseNum3 {
    public int solution(int n) {
        int answer = 0;
        
        int[] nums = new int[100];
        int num = 0;
        for(int i=0;i<100;i++){
            num++;
            while(num%3==0||(num+"").contains("3")){
                num++;
            }
            nums[i]=num;
            
        }
        
        answer = nums[n-1];
        return answer;
    }
}