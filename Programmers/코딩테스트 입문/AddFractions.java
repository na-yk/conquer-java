// 코딩테스트 입문
// Lv.0
// 분수의 덧셈
class AddFractions {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int new_denom = denom1 * denom2;
        int new_numer = numer1 * denom2 + numer2 * denom1;

        System.out.println(n);
        for (int i=n+1;i>1;i--){
            if (new_numer%i == 0 && new_denom%i == 0){
                new_numer = new_numer/i;
                new_denom = new_denom/i;
            }
        }

        int[] answer = {new_numer, new_denom};

        return answer;
    }
}

