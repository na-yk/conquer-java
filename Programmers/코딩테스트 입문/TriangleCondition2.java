// 코딩테스트입문
// Lv.0
// 삼각형의 완성조건(2)

class TriangleCondition2 {
    public int solution(int[] sides) {
        int answer = 0;
        int max = (sides[0]<=sides[1])?sides[1]:sides[0];
        int min = (sides[0]<sides[1])?sides[0]:sides[1];
        
        // 주어지지 않은 수가 가장 큰 변의 길이일 때
        answer = answer+(sides[0]+sides[1]-max);
        
        // 주어진 수 중 더 큰 수가 가장 큰 변의 길이일 때
        int count = 0;
        for(int i=max-min+1;i<max;i++){
            count++;
        }
        answer = answer+count;

        return answer;
    }
}