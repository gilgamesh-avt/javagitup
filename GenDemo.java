package Generic;

public class GenDemo <T,N>
{
	T var1;
	N var2;
	
	
	public GenDemo(T ob1,N ob2)
	{
		var1=ob1;
		var2=ob2;
	}
	
	public T getvar1()
	{
		return var1;
	}
	
	public N getvar2()
	{
		return var2;
	}
	void showType()
	{
		System.out.println("Type of T is :"+var1.getClass().getName());
		System.out.println("Type of N is :"+var2.getClass().getName());
		System.out.println("*******************************");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			GenDemo<Integer,String> iob=new GenDemo<Integer,String>(501,"Salman");
			iob.showType();
			int v=iob.getvar1();
			String s=iob.getvar2();
			System.out.println("value1:"+" "+ v+ "value2:"+ " "+s);
	}

}
