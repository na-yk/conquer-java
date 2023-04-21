// 코딩테스트 입문
// Lv.0
// 캐릭터의 좌표

class LocOfCharacter {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        String[] key = {"left", "up", "right", "down"};
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        
        // board값에 따른 x축과 y축의 경계
        int bx = board[0]/2;
        int by = board[1]/2;
        
        int x = 0, y = 0;   // 실제 좌표
        int ax = 0, ay = 0; // 움직인 이후의 좌표 임시 저장
        for(int i=0;i<keyinput.length;i++){
            for(int j=0;j<4;j++){
                if (keyinput[i].equals(key[j])){
                    ax+=dx[j];
                    ay+=dy[j];
                    break;
                }
            }
            
            if(Math.abs(ax)<=bx && Math.abs(ay)<=by){   // 움직인 이후의 좌표가 경계 범위 이내이면 움직임 적용
                x = ax;
                y = ay;
            }
            else{   // 움직인 이후의 좌표가 경계 범위 바깥이면 움직이지 않음
                ax = x;
                ay = y;
            }
            
            System.out.println(String.format("%d, %d",x, y)); // String.format으로 포맷스트링 가능
        }
        
        answer[0] = x;
        answer[1] = y;
        
        
        return answer;
    }
}