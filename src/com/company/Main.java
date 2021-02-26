package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Lab1 ob1 = new Lab1();
        ob1.pare(n);
        System.out.println();
        System.out.println(ob1.maxim(15, 74));
        System.out.println(ob1.factorial(3));
        System.out.println(ob1.multipli(n));
        ob1.vectori(12);
        System.out.println(ob1.note());
        System.out.println(ob1.fibo(10));
    }



}