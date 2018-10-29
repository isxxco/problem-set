/**
 * INSTRUCTIONS.
 * 
 * The following exercises are, perhaps, more mathematically inclined than previous
 * problem sets. While they might be challenging, they are certainy doable.
 * 
 * You can (and should!) solve each of them using only the operators, conditional control
 * structures, and iterative control strucurs we've covered. You are not permitted to use
 * recursive code in your solutions.
 * 
 * Please be mindful of the expected outputs, as your code will be tested against that
 * directly. If you're unsure, please ask for clarification.
 * 
 * This problem set is worth 25 points and is due no later than 11:59pm on October 28, 2018.
 */

public class ProblemSet3_5 {
	
	public static void main(String[] args) {
		ProblemSet3_5 ps = new ProblemSet3_5();
		
		// test your solutions here
		
		ps.primes(1, 1000000);
		ps.leapYears(26);
		ps.multiples(3, 5, 100);
	}
	
	/**
	 * How many prime numbers are there between @start and @end, where @start and @end
	 * are positive integers in the range [1, @Integer.MAX_VALUE]?
	 * 
	 * Print your solution in the following formats: "There is X prime number."
	 *                                               "There are X prime numbers."
	 * 
	 * @param start
	 * @param end
	 */
	
	public void primes(int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++)  {
		    if (isPrime(i) == true) {
		        count ++;
		    }
		}
		if (count == 1)    {
		    System.out.println("There is 1 prime number.");
		}   else {
		    System.out.println("There are " + count + " prime numbers.");
		}
	}
	public boolean isPrime(int n)   {
	    boolean prime = true;
	    if (n <= 1) {
		    prime = false;
		}   else if (n == 2)    {
		    prime = true;
		}
	    for (int i = 2; i <= Math.sqrt(n); i ++)    {
	        if (n % i == 0) {
	            prime = false;
	            break;
	        }
	    }
	    return prime;
	}
	
	/**
	 * What are the next @count leap years?
	  
	 * Print your solution in the following formats: "The next leap year is X."
	 *                                               "The next 2 leap years are X and Y."
	 *                                               "THe next N leap years are A, ..., X, Y, and Z."
	 * 
	 * @param count
	 */
	
	public void leapYears(int count) {
	    if (count <= 0) {
	        System.out.println("I don't know how to calculate the next " + count + " leap years.");
	    }   else if (count == 1) {
	        System.out.println("The next leap year is 2020");
	    }   else if (count == 2)    {
	        System.out.println("The next 2 leap years are 2020 and 2024.");
	    }   else    {
	        int i = 1;
	        int leap = 2016;
	        System.out.print("The next " + count  + " leap years are ");
	        while (i <= count)  {
	            leap = leap + 4;
	            if (leap % 100 == 0 && leap % 400 != 0) {
                    leap = leap + 4;
	            }  
	            if (i < count)  {
	                System.out.print(leap);
	                System.out.print(", ");
	            }   else if (i == count)   {
	                System.out.println("and " + leap + ".");
	            }
	            i++;
	        }
	    }
	}

	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	public void palindromicNumbers(int number) {
	    int r = 0;
	    int remainder;
	    int original = number;
	    for (int i = number; number != 0; number /= 10) {
	            remainder = number % 10;
	            r = r * 10 + remainder;
	        }
	    if (original == r)  {
	        System.out.println(original + " is a palindromic number.");
	    }   else    {
	        System.out.println(original + " is not a palindromic number.");
	    }
	}
	
	/**
	 * What is the @nth Fibonacci number, where @n is a positive integer?
	 * 
	 * Print your solution in the following formats: "The 21st Fibonacci number is X."
	 *                                               "The 22nd Fibonacci number is X."
	 *                                               "The 23rd Fibonacci number is X."
	 *                                               "The 24th Fibonacci number is X."
	 *                                               
	 * @param n
	 */
	
	public void fibonacci(int n) {
        if (n ==  1)    {
            System.out.println("The 1st Fibonacci number is 1.");
        }   else if (n == 2)    {
            System.out.println("The 2nd Fibonacci number is 1.");
        }
        else    {
        if (n % 10 == 1) {
            System.out.println("The " + n + "st Fibonacci number is" + fib(n) + ".");
        }   else if (n % 10 == 2)    {
                System.out.println("The " + n + "nd Fibonacci number is " + fib(n)+ ".");
        }   else if (n % 10 == 3)   {
                System.out.println("The " + n + "rd Fibonacci number is " + fib(n) + ".");
        }   else {
                System.out.println("The " + n + "th Fibonacci number is " + fib(n) + ".");
        }
        }
	}
	public static long fib(int n)    {
	    long f[] = new long[n + 1];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++)    {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum is X."
	 * 
	 * @param limit
	 */
	
	public void multiples(int x, int y, int limit) {
		long sumx = 0;
		for (int i = 0; i < limit; i ++)   {
		    if (i % x == 0 || i % y == 0) {
    		     sumx += i; 
		    }   
		}
		System.out.println("The sum of all multiples of " + x + " and " + y +  " less than " + limit + " is " + (sumx) + ".");
	}
}
