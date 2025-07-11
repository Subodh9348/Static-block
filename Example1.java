class Example1 
{
	/*static int a=10;
	static{
		System.out.println("sb1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1();
	}
		static{
			System.out.println("sb2");
		}
		static int b=20;
		static void m1(){
			System.out.println("sm");
		}.........*/
		/*..............................................
		static int a=10;
		static int b=20;
		static {
			a=15;
			System.out.println("static block 1");
		}
		public static void main (String[]args){
			System.out.println("main method");
		}
		static void m1(){
			System.out.println("static method");	
		}................................................*/
		/*................................................
		static int a=10;
		static{
			System.out.println("Static block..");
		}
		public static void main(String[]args){
			System.out.println("main..");
			System.out.println("a:"+a);
		}................................................*/
	/*......................................................	
		int x=10;
	{
		System.out.println("Non-Static block1");
	}
	Example1(){
		System.out.println("Non Parameterized constructor..");
	}
	Example1(int x){
		System.out.println("interface Parameterized constructor"+x);
	}
	{
		System.out.println("Non-Static Block 2");
	}
	int y=20;
	{
		System.out.println("Non-Static block 3:");
	}
	public static void main(String[]args){
		Example1 e1= new Example1();
		Example1 e2= new Example1(10);
	}
	............................................................*/
	
	static int a=m1();
	static int m1(){
		System.out.println("Static variable :a"+a);	
		return 10;
		
	}
	static{
		System.out.println("Static block 1");	
	}
	static int b=m2();
	static int m2(){
		System.out.println("Static variable :b");
		return 10;
	}
	
	static {
		System.out.println("Static block 2");
			
	}
	static void m4(){
		System.out.println("Static method...");	
	}
	public static void main(String[]args){
		System.out.println("Main method...");
		m4();
	}
	static int c=m3();
	static int m3(){
		System.out.println("Static variable :c");	
		return 40;
	}
	static {
		System.out.println("Static block 3..");	
	}
	
		
		
	
}
