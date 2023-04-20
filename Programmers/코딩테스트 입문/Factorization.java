// 코딩테스트입문
// Lv.0
// 소인수분해

import java.util.ArrayList;

class Factorization {
    public int[] solution(int n) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        // 소인수분해
        int i = 2;
        while(n!=1){
            if(n%i==0){
                primes.add(i);
                while(n%i==0){
                    n/=i;
                } 
            }             
            i++;
        }
        
        // ArrayList를 int형 배열로 변경
        int len = primes.size();
        System.out.println(primes);
        int[] answer = new int[len];
        for(int j=0;j<len;j++){
            answer[j] = (int)primes.get(j);
        }
        
        return answer;
    }
}