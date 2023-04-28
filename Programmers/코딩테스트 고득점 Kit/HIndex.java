// 코딩테스트 고득점 Kit: 정렬
// Lv.2
// H-Index

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = -1;
        
        int n = citations.length;
        Arrays.sort(citations);
                
        for(int i=n-1;i>=0;i--){
            int cur = citations[i];
            
            // cur보다 작은 값 중 최댓값의 인덱스를 저장함
            int lessMax = 0;	
            for(int j=i-1;j>=0;j--){
                if (citations[j]<cur){
                    lessMax = j;
                }
            }
            
            // 0~lessMax 인덱스에 있는 값들의 합
            int[] lessH = Arrays.copyOfRange(citations, 0, lessMax+1);
            int totalLessH = total(lessH);
            
            // citations 안에 있는 값에 대해 H-Index 조건 판단
            if(totalLessH<=cur && n-i >=cur){
                answer = cur;
                // citations 안에 있지 않은 값에 대해 H-Index 조건 판단
                if (i<n-1){
                    for(int j=citations[i+1]-1;j>cur;j--){
                        if(totalLessH<=j && n-i-1 >=j){
                            answer = j;
                            break;
                        }
                    }
                }
                break;
            }
        }
        
        // citations 최솟값보다도 H-Index가 작은 경우 판단
        if(answer<0){
            for(int j=citations[0]-1;j>=0;j--){
                if(n >=j){
                    answer = j;
                    return answer;
                }
            }
        }
        return answer;
    }
    
    // 배열에 있는 수를 모두 더하는 함수
    private int total(int[] arr){
        int result = 0;
        for(int num:arr){
            result+=num;
        }
        
        return result;
    }
}