class Array
{
void display(int a[])
 {
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
 }
}

public class TestArray2
{
	public static void main(String[]ags)
	{
		 int x[] ={20,30,40,50,60};
		 Array obj = new Array();
		 obj.display(x);
	
	}
}