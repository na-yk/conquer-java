// 코딩테스트입문
// Lv.0
// 배열 뒤집기

class ReverseArray {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        
        for(int i=0;i<len;i++){
            answer[i] = num_list[len-1-i];
        }
        return answer;
    }
}