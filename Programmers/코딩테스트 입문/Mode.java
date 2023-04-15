// 코딩테스트 입문
// Lv.0
// 최빈값 구하기


class Mode {
    public int solution(int[] array) {
        int answer = 0;
        int len = array.length;
        int[][] ec = new int[len][2]; //값, 수
        
        // ec라는 2차원 배열에 [값,빈도] 형식으로 저장함
        for(int i = 0; i < array.length ; i++){
            ec[i][0] = array[i];
            for (int j=0; j < array.length;j++){
                if (array[i] == array[j]){
                    ec[i][1]+=1;
                }
            }    
        }
        
        // 최빈값을 구함
        int[] max = ec[0];
        for(int i=0;i<ec.length;i++){
            if(ec[i][0] == max[0])
                continue;
            else if(ec[i][1] > max[1])
                max = ec[i];
        }
        
    
        int flag = 0; // 최빈값이 둘 이상이면 1, 하나면 0
        for(int i=0;i<ec.length;i++){
            if(ec[i][0] != max[0] && ec[i][1] == max[1]) // 값이 다르고 최빈값이 같은 원소가 있다면
                flag = 1; // flag를 1로 바꿈
        }
        
        if(flag==1)
            answer = -1;    
        else
            answer = max[0];
        
        return answer;
    }
}