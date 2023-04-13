// BOJ#11021 A+B -7
// 반복문
package BOJ;
import java.io.*;

public class AplusB7 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0;i<t;i++) {
			String[] str = (br.readLine()).split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			System.out.printf("Case #%d: %d%n",i+1,a+b);
			
		}
	}

}
