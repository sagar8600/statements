package statements;

public class fibonassis {
	public static void main(String args[])
	{
		int n1=11,n2=12,n3,i,count=20;
		System.out.println(n1+" "+n2);
		for(i=13;i<count;++i)
		{
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
	}

}
