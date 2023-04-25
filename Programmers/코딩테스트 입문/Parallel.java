// 코딩테스트입문
// Lv.0
// 평행

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[][] pair1 = {{0,1},{0,2},{0,3}};
        int[][] pair2 = {{2,3},{1,3},{1,2}};
        
        int count = 0;
        for(int i=0;i<3;i++){
            int[] cur1 = pair1[i];
            int[] cur2 = pair2[i];
            
            int dx1 = dots[cur1[0]][0] - dots[cur1[1]][0];
            int dy1 = dots[cur1[0]][1] - dots[cur1[1]][1];
            int dx2 = dots[cur2[0]][0] - dots[cur2[1]][0];
            int dy2 = dots[cur2[0]][1] - dots[cur2[1]][1];
            
            float s1 = (float)dy1/dx1;  // 첫 번째 쌍으로 만든 선분의 기울기
            float s2 = (float)dy2/dx2;  // 두 번째 쌍으로 만든 선분의 기울기
            
            if(s1==s2){     // 두 선분의 기울기가 같으면 평행
                answer = 1;
                break;
            } 
        }
        if(answer==0 && count == 3)
                answer = 0;
        
        return answer;
    }
    
}