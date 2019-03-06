package com.neuedu.www.second;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
      /*  int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份数字");
        year=sc.nextInt();
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }*/
      int a;
      Scanner scanner=new Scanner(System.in);
      System.out.println("请输入一个数字");
      a=scanner.nextInt();
      if(a%3==0) {
          if (a % 7 != 0) {
              System.out.println("能被3整除但不能被7整除");
          } else {
              System.out.println("能被3整除也能被7整除");
          }
      }
      else {
          if (a % 7 != 0) {
              System.out.println("不能被3整除也不能被7整除");
          } else {
              System.out.println("不能被3整除但能被7整除");
          }
      }
    }
}
