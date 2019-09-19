package com.mathseries;

import java.util.Arrays;

public class Series {
    public static int nSum(int n){
        int sum = 0;
        for(int i = 0; i <= n;i++){
            sum += i;
        }
        return sum;
    }

    public static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2;i< (f.length);i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static int factorial(int n){
        int factorial = 1;
        if(n == 0 || n == 1) return factorial;
        for(int i = 2; i<=n;i++){
            factorial *= i;
        }
        return factorial;
    }
}
