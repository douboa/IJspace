package com.neuedu.www.fourth;

public class SuShu {
    public static boolean fun(int num){
        boolean flag=true;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
