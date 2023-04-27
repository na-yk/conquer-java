// 코딩테스트 고득점 Kit: 해시
// Lv.2
// 전화번호 목록

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        for(int i=0;i<phone_book.length-1;i++){
            String cur = phone_book[i];
            String next = phone_book[i+1];
            
            if(next.startsWith(cur)){
                answer = false;
                break;
            }
        }
    
        return answer;
    }
}

/*
 * 단순히 이중 for문으로 해결하면, O(n^2)로 효율성에서 탈락
 * phone_book을 정렬하면 뒤에 있는 데이터가 앞에 있는 데이터의 접두사가 될 수 없음
 * 연속한 두 데이터만을 비교하면 시간 복잡도 개선 가능 
 */