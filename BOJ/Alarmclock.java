// BOJ#2884 알람시계
// 조건문

package basics;

import java.io.*;

public class Alarmclock {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String[] input = str.split(" ");
		
		int h = Integer.parseInt(input[0]); //½Ã
		int m = Integer.parseInt(input[1]);	//ºÐ
		
		if (m<45) {
			if (h == 0) h = 23;
			else h--;
			m = 60-(45-m);
		}else {
			m = m-45;
		}
		
		System.out.printf("%d %d",h,m);
	}
}
