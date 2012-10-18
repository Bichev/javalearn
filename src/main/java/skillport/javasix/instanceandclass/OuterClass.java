package skillport.javasix.instanceandclass;

public class OuterClass {

	private int i = 111;
	static int f;
	final static int a;
	
	static {
		a = 543;
	}
	
	InnerClass class1;
	
	public OuterClass () {
		class1 = new InnerClass();
	}
	
	class InnerClass extends NewVars {
		
		public InnerClass (){
			System.out.println(i);			
		}
	}
	
	static class InnerStaticClass {
		void aMethod(){
			int f2 = f;
			// access only to class (static) variables 
//			int b = a;
		}
	}
	
	public static void main (String ...strings){
		//firstly instantiate Outer Class
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
		
		//without instantiating
		InnerStaticClass innerStaticClass = new InnerStaticClass();
		OuterClass.InnerStaticClass innerStaticClass2 = new OuterClass.InnerStaticClass();
		
		class InnerClassInsideMethod{
			void someMethod(){
				int  c = a;
				int ff = f;

				//can not refer to non-final
//				for (String string : strings){
//				}
				
			}
		}
	}
}
