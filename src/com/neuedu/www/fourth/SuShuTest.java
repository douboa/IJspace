package com.neuedu.www.fourth;

import java.util.Scanner;

public class SuShuTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num=scanner.nextInt();
        boolean fl=new SuShu().fun(num);
        if(fl){
            System.out.println("这是一个素数");
        }else{
            System.out.println("这不是一个素数");
        }
    }
}
