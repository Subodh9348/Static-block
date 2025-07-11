class Test1 
{
	static int a;
	static {
		a=20;
		int a=10;
			//a=20;
		Test1.a=30; 	
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		System.out.println(a);
	}
}
