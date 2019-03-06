package com.neuedu.www.second;

public class case7 {
    public static void main(String[] args) {
        int lastNum=1;
        for(int i=2;i<=10;i++){
            lastNum=(lastNum+1)*2;
        }
        System.out.println("猴子的第一天摘了"+lastNum+"个桃子");
    }
}
