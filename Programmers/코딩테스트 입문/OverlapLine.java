// 코딩테스트입문
// Lv.0
// 겹치는 선분의 길이

class OverlapLine {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] line = new int[201];
        
        int cur = 0;
        for(int i=0;i<3;i++){
            cur = 0;
            for (int j=lines[i][0];j<lines[i][1];j++){
                cur = j+100;
                line[cur]++;
                if (line[cur]==2)
                    answer++;
            }
        }
        return answer;
}
