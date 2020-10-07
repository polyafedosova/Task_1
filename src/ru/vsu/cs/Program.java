package ru.vsu.cs;

import java.util.Scanner;

public class Program {

    public static void Main(String[] args)
    {
        int x1 = ReadVariables("x1");
        int x2 = ReadVariables("x2");
        int x3 = ReadVariables("x3");

        int mid = Mid(x1, x2, x3);

        System.out.println(mid);
    }

    public static int ReadVariables(String name)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input %s: ", name);
        return scanner.nextInt();
    }

    public static int Mid(int x1, int x2, int x3)
    {
        int min = Min(x1, x2, x3);
        int max = Max(x1, x2, x3);

        int mid = x1 + x2 + x3 - (min + max);

        return mid;
    }

    public static int Min(int x1, int x2, int x3)
    {
        int min = Math.min(Math.min(x1,x2), x3);

        return min;
    }

    public static int Max(int x1, int x2, int x3)
    {
        int max = Math.max(Math.max(x1,x2), x3);

        return max;
    }
}

