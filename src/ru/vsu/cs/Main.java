package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int x1 = readVariables("x1");
        int x2 = readVariables("x2");
        int x3 = readVariables("x3");

        int mid = Mid(x1, x2, x3);

        System.out.println(mid);
    }

    public static int readVariables(String name)
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

        return (min);
    }

    public static int Max(int x1, int x2, int x3)
    {
        int max = Math.max(Math.max(x1,x2), x3);

        return max;
    }
}

