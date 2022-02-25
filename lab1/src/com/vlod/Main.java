package com.vlod;

import java.util.Scanner;
import java.math.*;

public class Main
{
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        ex6();
    }
    
    public static void ex1()
    {
        System.out.printf("Introdu n\n");
        int n = in.nextInt();
    
        for(int i=0;i<=n;i++)
        {
            if(i % 2 == 0)
            {
                System.out.printf(i + " ");
            }
        }
    }
    
    public static void ex2()
    {
        System.out.println("Introdu numerele");
        int a = in.nextInt();
        int b = in.nextInt();
        
        int m = Math.max(a, b);
        System.out.println("max: " + m);

    }
    
    public static int factorial(int n)
    {
        int nr = 1;
        for(int i=1;i<=n;i++)
        {
            nr *= i;
        }
        return nr;
    }
    
    public static int ex4(int n)
    {
        int nr = 0;
        for(int i=3;i<=n;i++)
        {
            if((i % 3 == 0) || (i % 5 == 0))
            {
                nr += i;
            }
        }
        return nr;
    }
    
    public static void ex5()
    {
        int n = 0;
        System.out.println("Introdu n:");
        n = in.nextInt();
    
        int pare[] = new int[n];
        int impare[] = new int[n];
        int pareContor = 0;
        int impareContor = 0;
        
        for(int i=0; i<n; i++)
        {
            int nr = in.nextInt();
            if(nr % 2 == 0)
            {
                pare[pareContor++] = nr;
            }else
            {
                impare[impareContor++] = nr;
            }
        }
    }
    
    public static void ex6()
    {
        int note[] = new int[100];
        
        int i=0;
        float medie = 0.f;
        for(i=0;i<100;i++)
        {
            int nr = in.nextInt();
            if(nr == -1){break;}
            medie += nr;
            note[i] = nr;
        }
        
        if(i > 0)
        {
            medie /= i;
        }
    
        System.out.println("medie: " + medie);
    }
    
    
}


