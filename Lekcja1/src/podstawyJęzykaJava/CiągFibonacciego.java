package podstawyJęzykaJava;

import java.util.Scanner;

public class CiągFibonacciego
{
    public static void main(String[] args)
    {
        System.out.println("Który wyraz ciągu Fibonacciego chcesz wyznaczyć?");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        long fib[] = new long[100000];
        fib[0] = 1;
        fib[1] = 1;
        long start = System.currentTimeMillis();
        for (int i=2; i<n; i++)
        {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("Wyraz ciągu nr " + n + " to " + fib[n-1]);
        long end = System.currentTimeMillis() - start;
        System.out.println("Czas wykonania w ms: " + end);



    }

}
