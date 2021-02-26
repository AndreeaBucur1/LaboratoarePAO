package com.company;

import java.util.Scanner;

public class Lab1 {

    public void pare(int n) {
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }

    public int maxim(int a, int b) {
        return a > b ? a : b;
    }

    public int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public int multipli(int n) {
        int s = 0;
        for (int i = 3; i <= n; i+=3) {
            if (i % 3 == 0 )
                s += i;
        }
        for (int i = 5; i <= n; i+=5) {
            if (i % 5 == 0 && i % 3 != 0 )
                s += i;
        }
        return s;
    }

    public void vectori(int n){
        int[] pare = new int[n];
        int[] impare = new int[n];
        Scanner sc = new Scanner(System.in);
        int p = 0,i = 0;
        for(int j = 1; j <= n; j++){
            int nr = sc.nextInt();
            if(nr % 2 == 0){
                pare[p++] = nr;
            }
            else{
                impare[i++] = nr;
            }
        }
        for (int j = 0; j < p; j++) {
            System.out.print(pare[j] + " ");

        }
        System.out.println();
        for (int j = 0; j < i; j++) {
            System.out.print(impare[j] + " ");

        }

    }


    public float note(){
        int s = 0, n = 0;
        int []note = new int[25];
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        while(val != -1){
            note[n++] = val;
            s += val;
            val = sc.nextInt();
        }
        System.out.println(s + " " + n);
        return ((float) s)/n;
    }

    public int fibo(int n){
        int f1 = 1, f2 = 1;
        int f3=1;
        for(int i = 3; i <= n; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}