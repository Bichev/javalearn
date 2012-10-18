package skillport.javasix.exceptions;

public class ThrowsException {

	public void checkArgement (int x, int y)
		throws ArithmeticException, ArrayIndexOutOfBoundsException {
		if (y==0)
			throw new ArithmeticException("y argement was 0");
		if (x>5)
			throw new ArrayIndexOutOfBoundsException("x was more");
		
		boolean wasError = false;
		int[] intArray = new int[5];
		for (int i=0; i < intArray.length - 1; i++){
			intArray[i] = i + 8;
		}
		for (int i = 0; i <= x-1; i++) {
			System.out.println(intArray[i]/y);
		}
	}
	
}
