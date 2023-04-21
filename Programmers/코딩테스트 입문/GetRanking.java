// 코딩테스트입문
// Lv.0
// 등수 구하기

import java.util.Arrays;

class GetRanking {
    public int[] solution(int[][] score) {
        int len = score.length;
        float[] avg = new float[len]; 
        int[] answer = new int[len];
        
        // 평균점수만 저장하는 배열 만들기
        for(int i=0;i<len;i++){
            avg[i] = (float)(score[i][0] + score[i][1])/2;
        }
        
        // 평균점수를 정렬해서 저장할 배열 만들기
        // avg 배열을 그대로 정렬하지 않는 이유 -> index를 알아야 하기 때문
        float[] avgSort = new float[len];
        System.arraycopy(avg,0,avgSort,0,len);
        Arrays.sort(avgSort);
        
        for(int i=0;i<len;i++){
            int rank = len-getIndex(avgSort,avg[i]); // 점수가 높을수록 등수가 높기 때문에
            answer[i] = rank;
        }
        
        return answer;
    }
    
    // 배열 arr에서 target 값의 index를 구하는 함수
    private int getIndex(float[] arr, float target){
        int len = arr.length;
        int result = -1;
        for(int i=0;i<len;i++){
            if(arr[i] == target){
                result = i;
            }
        }
        
        return result;
    }
}