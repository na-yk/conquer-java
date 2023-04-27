// 코딩테스트 고득점 Kit: 완전탐색
// Lv.2
// 피로도

import java.util.ArrayList;
import java.util.stream.IntStream;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        int dungeonsNum = dungeons.length;
        int[] arr = IntStream.range(0, dungeonsNum).toArray();  // {0,1,2,...,dungeonsNum-1}의 배열로 초기화함
        
        for(int i=dungeonsNum;i>0;i--){
            int r = i;
            ArrayList<int[]> pResult = new ArrayList<>();
            permutation(arr, 0, dungeonsNum, r, pResult);
            
            for(int j=0;j<pResult.size();j++){
                int[] order = pResult.get(j);

                if(checkDungeons(order, dungeons, k)){
                    answer = r;
                    break;
                }
                else
                    continue;
            }
            if(answer>-1)
                break;
        }
        return answer;
    }
    
    // 던전 탐험 순서를 순열로 만드는 함수
    private void permutation(int[] arr, int depth, int n, int r, ArrayList<int[]> result){
        if (depth == r){
            int[] temp = new int[r];
            
            System.arraycopy(arr,0,temp,0,r);
            result.add(temp);
            
            return;
        }
        else if(depth<r){
            for(int i=depth;i<n;i++){
                swap(arr, i, depth);
                permutation(arr, depth+1, n, r, result);
                swap(arr, i, depth);
            }
        }
    }
    
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    // 해당 순서로 탐험을 완료할 수 있는지 확인하는 함수
    private boolean checkDungeons(int[] order, int[][] dungeons, int k){
        for(int i = 0; i<order.length;i++){
            int cur = order[i];
            int need = dungeons[cur][0];
            int cost = dungeons[cur][1];
            
            if(k >= need){
                k-=cost;
            }
            else
                return false;
        }
        
        if(k>=0)    // 마지막 순서를 돌았는데 피로도가 0 미만이면 탐험 실패
            return true;
        else
            return false;
    }
}