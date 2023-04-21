// 코딩테스트입문
// Lv.0
// 직사각형 넓이 구하기

import java.util.Arrays;

class RectangularArea {
    public int solution(int[][] dots) {
        int answer = 0;
        int len = dots.length;
        int[] x = new int[len];     // x좌표만 모은 배열
        int[] y = new int[len];     // y좌표만 모은 배열
        for(int i=0;i<len;i++){
            x[i] = dots[i][0];  
            y[i] = dots[i][1];
        }

        // 직사각형이므로 x좌표와 y좌표만 모으면 값이 두 종류밖에 없을 것
        int[] xMinMax = minmax(x);
        int[] yMinMax = minmax(y);
        int width = xMinMax[1]-xMinMax[0];
        int height = yMinMax[1]-yMinMax[0];
        
        answer = width * height;
        return answer;
    }
    
    // 배열에서 최솟값과 최댓값을 배열에 담아 반환하는 함수
    public int[] minmax(int[] arr){
        int[] result = {0,0};
        Arrays.sort(arr);
        
        result[0] = arr[0];
        result[1] = arr[3];
        
        return result;
    }
}