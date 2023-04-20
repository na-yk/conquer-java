// 코딩테스트입문
// Lv.0
// 배열 회전 시키기

class RotateArray {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        
        if (direction.equals("right")){
            answer[0] = numbers[len-1];
            System.arraycopy(numbers, 0, answer, 1, len-1);
        }
        else if(direction.equals("left")){
            answer[len-1] = numbers[0];
            System.arraycopy(numbers, 1, answer, 0, len-1);
        }
        
        
        return answer;
    }
}