package apr10th;

public class Sum {
	
	public void add(int x,int y)
	{
		System.out.println("Sum is "+(x+y));
	}
	
	public void add(int x,int y,int z)
	{
		System.out.println("Sum is "+(x+y+z));
	}
	
	public void add(double x,double y)
	{
		System.out.println("Sum is "+(x+y));
	}
	
	public void add(long x,long y)
	{
		System.out.println("Sum is "+(x+y));
	}
	
	public void add(int... a)
	{
		System.out.println(a.length);
		
		int res=0;
		
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
		
		System.out.println("Sum is "+res);
		
	}

}
