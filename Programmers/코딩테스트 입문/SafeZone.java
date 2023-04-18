// 코딩테스트입문
// Lv.0
// 안전지대

class SafeZone {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if (board[i][j] == 1){
                    danger(board, n, j, i); // 폭탄 설치지점 주변을 위험지역으로 표시
                }
            }
        }
        
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if (board[i][j] == 0){
                    answer+=1;
                }
            }
        }
        
        return answer;
    }
    
    private void danger(int[][] board, int n, int x, int y){
        int ax=0, ay=0;
        
        int[] dx = {-1,0,1,1,1,0,-1,-1};
        int[] dy = {-1,-1,-1,0,1,1,1,0};
        
        for(int i=0;i<8;i++){
            ax = x+dx[i];
            ay = y+dy[i];
            
            if(ax>=0&&ax<n&&ay>=0&&ay<n)
                if (board[ay][ax]==1) // 폭탄 인접 지점에도 폭탄이 설치되어 있을 때
                    continue;
                else
                    board[ay][ax] = -1;
        }
    }
}