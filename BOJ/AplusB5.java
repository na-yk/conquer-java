//BOJ#10952 A+B -5
//반복문

package basics;

import java.io.*;

public class AplusB5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		while(!(str = br.readLine()).equals("0 0")) {

			String[] nums = str.split(" ");
			
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			
			System.out.println(a+b);
		}
		
	}

}
