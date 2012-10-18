package skillport.javasix.generics;

public class Sum<T extends Number> {
	
	private T[] nums;
	
	public Sum(T[] nums){
		this.nums = nums;
	}
	
	public double sumTotal () {
		double sum = 0.0;
		
		for (T elem : nums) {
			sum += elem.doubleValue();
		}
		
		return sum;
	}
	
	public static String compare (Sum<?> obj1, Sum<?> obj2){
		
		if (obj1.sumTotal() > obj2.sumTotal())
			return "o1 more than o2";
		else 
			return "o2 more than o1 or equal"; 
		
	}
	
	public static void main (String ...strings) {
		
		Integer[] intArr = {1,2,3};
		Float[] floatArr = {1.2f,4.2f,5.45f};
		
		Sum<Integer> sum1 = new Sum<Integer>(intArr);
		Sum<Float> sum2 = new Sum<Float>(floatArr);
		
		System.out.println(sum1.sumTotal());
		System.out.println(sum2.sumTotal());
		System.out.println(compare(sum1, sum2));
	}

}
