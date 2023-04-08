// 코딩테스트 입문
// Lv.0
// 중간값 구하기

import java.util.*;

class MedianVal {
    public int solution(int[] array) {

        Arrays.sort(array);
        int len = array.length;
        int mid = len/2;

        System.out.println(mid);
        int answer = array[mid];
        return answer;
    }
}