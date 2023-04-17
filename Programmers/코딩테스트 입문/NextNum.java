// 코딩테스트 입문
// Lv.0
// 다음에 올 숫자

class NextNum {
    public int solution(int[] common) {
        int answer = 0;
        int last = common.length - 1;  // 마지막 원소의 인덱스
        
        if(common[1]-common[0] == common[2]-common[1]){
            int d = common[2]-common[1]; // 공차
            answer = common[last] + d;
        }
        else{   // 문제 조건에 공차수열 아니면 공비수열이라고 제시되어 있음
            int r = common[2]/common[1]; // 공비
            answer = common[last] * r;
        }
        
        return answer;
    }
}