// 코딩테스트 고득점 Kit: 완전탐색
// Lv.2
// 전력망을 둘로 나누기

import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = -1;
        int wireNum = wires.length;
        int[] diff = new int[wireNum];
                
        
        for(int i=0;i<wireNum;i++){
            int partA = wires[i][0];
            
            int countA = 0;
            int countB = 0;
            
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            int[] visited = new int[n]; // visited 배열은 Boolean 형태로 만드는 것이 좋을 듯
            ArrayList<int[]> cur = new ArrayList<>(Arrays.asList(wires));
            
            cur.remove(i);  // 연결 하나를 끊은 상태를
            toGraph(cur, graph, n);     // 인접리스트로 변환함
            
            dfs(graph, partA, visited); // 끊은 연결의 한 쪽 노드에서 dfs를 시작함
            countA = countVisited(visited);
            countB = n-countA;  
            
            diff[i] = Math.abs(countA-countB);
        }
        
        Arrays.sort(diff);
        answer = diff[0];
        
        return answer;
    }
    
    // 배열 arr에서 target을 찾아 인덱스를 반환하는 함수
    private int search(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
    

    // wires를 인접리스트 형식으로 변환하는 함수
    private void toGraph(ArrayList<int[]> wires, ArrayList<ArrayList<Integer>> graph, int n){
        int w = wires.size();

        for(int i=1;i<n+1;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<w;j++){
                int[] wire = wires.get(j);
                if (search(wire, i) > -1){  // 현재 wire에 i가 있다면, i의 인접리스트에 i가 아닌 다른 노드를 넣어야 함
                    temp.add(wire[1-search(wire,i)]);   // 한 wire에는 2개의 노드 번호가 있으므로, (1-i의 인덱스)가 다른 노드의 인덱스가 됨
                }
                else
                    continue;
            }
            graph.add(temp);            
        }
        
        return;
    }
    
    // dfs
    private void dfs(ArrayList<ArrayList<Integer>> graph, int v, int[] visited){
        visited[v-1] = 1;
        System.out.println(v);
        for(int i:graph.get(v-1)){
            if(visited[i-1] == 0)
                dfs(graph, i, visited);
        }
    }
    
    // 방문한 노드를 세는 함수
    public int countVisited(int[] arr){
        int count = 0;
        for(int v:arr){
            if (v==1)
                count++;
        }
        return count;
    }
}