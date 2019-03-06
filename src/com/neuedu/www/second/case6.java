package com.neuedu.www.second;

public class case6 {
//    public static final int MONTH =25;

    public static void main(String[] args) {
        int f1=1,f2=1;
        int f;
        for(int i=3;i<25;i++){
            f=f2;
            f2=f1+f2;
            f1=f;
            System.out.println("第"+i+"个月的兔子的对数：");
            System.out.println(""+f2);
        }
    }
}
