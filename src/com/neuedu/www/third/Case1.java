package com.neuedu.www.third;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
       System.out.println("请输入一个数字：");
       Scanner sc=new Scanner(System.in);
       int a =sc.nextInt();
       while(true){

           System.out.println("请重新输入：");
           int b=sc.nextInt();
           if(b==1){
               System.out.println("登录");
               break;
           }
           if(b==2){
               System.out.println("注册");
               break;
           }
           if(b==3){
               System.out.println("再见");
               break;
           }
       }
       if(a==1){
           System.out.println("登录");
       }
        if(a==2){
            System.out.println("注册");
        }
        if(a==3){
            System.out.println("再见");
        }
    }
}
