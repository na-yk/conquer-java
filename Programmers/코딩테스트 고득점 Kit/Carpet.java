// 코딩테스트 고득점 Kit: 완전탐색
// Lv.2
// 카펫

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int width = 0, height = 0;
        // 세로 길이가 가로 길이보다 짧아야 하므로 세로 길이를 기준으로 함
        for(int i=1;i<yellow+1;i++){
            height = i;
            if(yellow%i!=0)
                continue;
            else
                width = yellow/i;
            
            // brown은 yellow의 테두리를 감싸는 형태
            int temp = width*2 + height*2 + 4;

            if(temp == brown){
                answer[0] = width+2;
                answer[1] = height+2;
                break;  // break하지 않으면 세로 길이가 가로 길이보다 길어짐
            }
        }
        return answer;
    }
}
