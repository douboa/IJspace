package com.neuedu.www.first;
import java.util.Scanner;
public class NumberType01 {
    public static void main(String[] args) {
        int a=34;
        int b=5;
        /*int c=(a++)+b+(++a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
//       boolean b1=a+3>45||b++<6&&a++>1;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
         n=sc.nextInt();
        if(n>=45){
            System.out.println("睡觉");
        }else{
            System.out.println("吃饭");
        }

    }
}
