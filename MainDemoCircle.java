class Circle
{
	private float r;
	Circle (float a)
	{
		this.r=a;
	}
	public void setRadius(float b)
	{
		this.r=b;
	}
	public float getRadius()
	{
		return this.r;
	}
	
	float getcircumference()
	{
		float c= 2*3.14f*r;
		return c;
	}
	float getArea()
	{
		float a= 3.14f*r*r;
		return a;
	}
}

public class MainDemoCircle
{
public static void main (String[] args)
		{
			Circle c = new Circle(10.4f);
			c.setRadius(15.5f);
			System.out.println(c.getRadius());
			System.out.println(c.getcircumference());
			System.out.println(c.getArea());
		}
}