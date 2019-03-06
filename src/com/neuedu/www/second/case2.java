package com.neuedu.www.second;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        int wage;
        Scanner sc=new Scanner(System.in);
        System.out.println("您当月的工资是：");
        wage=sc.nextInt();
        int tax=wage-1100-5000;
        if(tax<=3000){
            double a=tax*0.03;
            System.out.println("您应交"+a+"元的税");
        }else if(tax>3000&&tax<=12000){
            double a=tax*0.1-210;
            System.out.println("您应交"+a+"元的税");
        }else if(tax>12000&&tax<=25000){
            double a=tax*0.2-1410;
            System.out.println("您应交"+a+"元的税");
        }else if(tax>25000&&tax<=35000){
            double a=tax*0.25-2660;
            System.out.println("您应交"+a+"元的税");
        }else if(tax>35000&&tax<=55000){
            double a=tax*0.3-4410;
            System.out.println("您应交"+a+"元的税");
        }else if(tax>55000&&tax<=80000){
            double a=tax*0.35-7160;
            System.out.println("您应交"+a+"元的税");
        }else{
            double a=tax*0.45-15160;
            System.out.println("您应交"+a+"元的税");
        }
    }
}
