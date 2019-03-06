package com.neuedu.www.second;

import java.util.Scanner;

public class case3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入成绩:");
        int a=sc.nextInt();
        int b=a/10;
        switch(b){
            case 9:
                System.out.println("A");
                break;
        }
    }
}
