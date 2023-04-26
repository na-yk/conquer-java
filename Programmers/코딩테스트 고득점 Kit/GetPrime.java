// 코딩테스트 고득점 Kit: 완전탐색
// Lv.2
// 소수 찾기

import java.util.ArrayList;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        int len = numbers.length();
        
        char[] numArr = numbers.toCharArray();
        
        ArrayList<Integer> numPer = new ArrayList<>();  // numbers로 만든 모든 순열 저장하는 리스트
        for(int i=1;i<=len;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            permutation(numArr, len, i, 0, temp);
            numPer.addAll(temp);
        }
        
        ArrayList<Integer> result = new ArrayList<>(); // 순열 중 소수인 것을 저장할 리스트
        for(int i=0;i<numPer.size();i++){
            int cur = (int)numPer.get(i);
            if (result.contains(cur))   // 중복 체크
                continue;
            else if(isPrime(cur))
                result.add(cur);
            else
                continue;
        }

        answer = result.size();
        return answer;
    }
    
    // num이 소수인지 판단하는 함수
    private boolean isPrime(int num){
        int count = 0;
        if(num==0 || num==1)
            return false;
        for(int i=1;i<num;i++){
            if(num%i==0)
                count+=1;
            if(count>=2)
                return false;
        }
        
        return true;
    }
    
    // arr의 n개의 요소에서 r개를 가지고 만들 수 있는 모든 순열을 resultList에 담아 반환하는 함수
    private void permutation(char[] arr, int n, int r, int depth, ArrayList<Integer> resultList){        
        if (depth == r){
            char[] temp = new char[r];
            System.arraycopy(arr, 0, temp, 0, r);
            String cur = new String(temp);
            resultList.add(Integer.parseInt(cur));
            return;
        }
        else if(depth<r){
            // depth-1 위치에 있는 요소는 고정, 다음 요소들 중 두 개를 골라 자리를 바꿈 
            for(int i=depth;i<n;i++){
                swap(arr, depth, i);
                permutation(arr, n, r, depth+1, resultList);
                swap(arr, depth, i);
            }
        }
    }

    
    private void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}