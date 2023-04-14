// BOJ#15552 빠른 A+B
// 반복문

package basics;

import java.io.*;

public class FastAplusB {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

		int t = Integer.parseInt(br.readLine());
		
		for (int i=0;i<t;i++) {
			String[] str = (br.readLine()).split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			bw.write((a+b)+"\n");

		}
		bw.flush();

	}

}
