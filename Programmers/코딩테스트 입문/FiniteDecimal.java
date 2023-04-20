// 코딩테스트입문
// Lv.0
// 유한소수 판별하기

import java.util.ArrayList;

class Solution {
    public int FiniteDecimal(int a, int b) {
        int answer = 1;
        
        // 기약분수 만들기
        for(int j=1;j<a+1;j++){
            if(a%j==0 && b%j==0){
                a/=j;
                b/=j;
            }
        }
        
        // 분모의 소인수를 ArrayList에 저장하기
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int i = 2;
        while(b>1){
            while(b%i==0){
                while(!primes.contains(i)){
                    primes.add(i);
                }
                b/=i;
            }
            i++;
        }

        // 분모의 소인수 중 2나 5가 아닌 수가 있는지 확인하기
        for(int j=0;j<primes.size();j++){
            int cur = (int)primes.get(j);

            if (cur!=2 && cur!=5)
                answer = 2;
        }
        return answer;
    }
}