package skillport.javasix.javalang;

import java.util.Arrays;

public class CopyArrays {
	
	public static void main (String ...strings){
		int[] i = {1,2,3,4,5,6,7};
		int[] b = Arrays.copyOf(i, 12);
		
		for (int j : b){
			System.out.println(j);
		}
	}

}
