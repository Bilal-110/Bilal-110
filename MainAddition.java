class Addition 
{
	private int x,y;
	public int getter_x()
	{
		return this.x;
	}
	public void setter_x(int a)
	{
		this.x=a;
	
	}	
	public int getter_y(int b)
	{
		return this.y;
	}
public void setter_y(int b)
	{
		this.y=b;
	
	}	
	void add()
	{
		System.out.println(x+y);
	}
}
public class MainAddition
{
	public static void main (String[] args)
		{
			Addition a = new Addition();
			a.setter_x(10);
			a.setter_y(20);
			a.add();
		}
}
