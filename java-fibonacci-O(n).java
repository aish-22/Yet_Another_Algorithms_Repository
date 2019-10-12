public class Fibonacci {

	static int[] fib(int n) 
	{ 
			
			int f[] = new int[n + 1]; //Array for storing Fibonacci numbers
			int i; 

			
			f[0] = 0; //Set first number in series as 0

			if (n > 0) { 
				f[1] = 1; //Set second number in series as 1

				for (i = 2; i <= n; i++) { 
					
					f[i] = f[i - 1] + f[i - 2]; //Add the previous 2 numbers in the series and store it 
				} 
			} 

		return f;
	} 
	public static void main(String args[]) 
	{ 
		int n = 9; 
		int ar[]=new int[n];
		ar=fib(n); 
		System.out.println("Fibonacci series:"); 
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+"\t"); 
		} 
	}
}
/*Output
 Fibonacci series:
 0	1	1	2	3	5	8	13	21	
 */

