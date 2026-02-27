//using the third variable.
import java.util.*;
class swap
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.print(a);
		System.out.print(b);
	}
}

//without using third variable.
import java.util.*;
class swap1
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a+" "+b);
	}
}