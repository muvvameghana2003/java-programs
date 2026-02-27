//Fibonacci Series : (Without using Recursive)
import java.util.*;
class FibonacciSeries
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0;int b=1;
		for(int i=0;i<n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
}

//Fibonacci Series : (With using Recursive)
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }

        in.close();
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
