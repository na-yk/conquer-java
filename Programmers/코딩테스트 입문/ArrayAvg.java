// 코딩테스트입문
// Lv.0
// 배열의 평균값

class ArrayAvg {
    public double solution(int[] numbers) {
        double answer = 0;

        int sum = 0;
        int len = numbers.length;

        for (int i = 0; i < len ; i++){
            sum += numbers[i];
        }

        answer = sum/(double)len;

        return answer;
    }
}