package com.neuedu.www.second;

public class case5 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("三位数中的水仙花数为：");
        for(int n=100;n<1000;n++){
            a=n/100;
            b=n%100/10;
            c=n%10;
            if(a*a*a+b*b*b+c*c*c==n){
                System.out.println(n);
            }
        }
    }

}
