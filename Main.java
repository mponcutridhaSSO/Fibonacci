package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Jumlah Deret Fibonacci ");
        fib[0] = 0;
        fib[1] = 1;
        
        int n = scan.nextInt();
        long fib[] = new long[n];

        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
    }
}
