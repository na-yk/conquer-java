// 코딩테스트 고득점 Kit: DFS/BFS
// Lv.2
// 게임 맵 최단거리

import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int width = maps[0].length;
        int height = maps.length;
        
        boolean[][] visited = new boolean[height][width];
        bfs(maps, 0, 0, visited);
        
        if(visited[height-1][width-1])  // 상대팀 진영을 방문했다면
            answer = maps[height-1][width-1];   // 해당 위치에 거리가 저장되어 있음
        else                            // 방문하지 못했다면
            answer = -1;                // -1 반환

        return answer;
    }
    
    // BFS로 최단 경로를 구할 수 있음
    private void bfs(int[][] maps, int sx, int sy, boolean[][] visited){

        int width = maps[0].length;
        int height = maps.length;
        if(maps[sx][sy] == 0 || visited[sx][sy] == true){
            return;
        }
        
        Deque<int[]> deque = new LinkedList<>();
        deque.add(new int[] {sx,sy});
        visited[sy][sx] = true;
        
        int[] dx = {0,1,0,-1};
        int[] dy = {-1, 0, 1, 0};
        
        while(!deque.isEmpty()){
            int[] v = deque.remove();
            int vx = v[0];
            int vy = v[1];
            
            for(int i=0;i<4;i++){
                int ax = vx + dx[i];
                int ay = vy + dy[i];
                if(ax >= 0&&ax<=width-1&&ay>=0&&ay<=height-1){
                    if(maps[ay][ax]>0 && visited[ay][ax] == false){
                        deque.add(new int[] {ax,ay});
                        maps[ay][ax]+=maps[vy][vx]; // maps[ay][ax]까지의 거리를 해당 위치에 저장함
                        visited[ay][ax] = true;
                    }
                }  
            }
        }
        return;
    }
}
