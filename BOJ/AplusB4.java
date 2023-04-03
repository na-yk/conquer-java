//BOJ#10951 A+B -4
//반복문 - EOF

package basics;

import java.io.*;

public class AplusB4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str ="";
		
		while ((str = br.readLine()) != null){
			
			
			String[] nums = str.split(" ");
			
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
				
			System.out.println(a+b);

		}
		
	}

}
