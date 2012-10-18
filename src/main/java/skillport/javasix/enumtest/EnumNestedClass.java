package skillport.javasix.enumtest;

import static java.lang.System.out;

public class EnumNestedClass {
	public static enum ComplexEnum {
		FIRST(1), THIRD(3), TENTH(10);
		
		private int index = 0;
		
		private ComplexEnum (int index) {
			this.index = index;
		}
		
		public int getIndex() {
			return index;
		}
		
		public void print () {
			System.out.println(index);
		}
	}
	
	public static void main (String ... args) {
		ComplexEnum ce = ComplexEnum.THIRD;
		ce.print();
		
		for (ComplexEnum c : ce.values()) {
			switch (c) {
				case FIRST:
				case THIRD:
					System.out.println("1 or 3");
					break;
				default:
					System.out.println("10!");
			}
			System.out.println(c);
		}
		
		out.println(ce.valueOf("FIRST"));
		out.println(ce.valueOf("FIRST").index);
		out.println(ComplexEnum.THIRD);
	}
}
