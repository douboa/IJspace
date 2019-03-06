package com.neuedu.www.third;

import java.util.Random;

public class Case3 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);

        }
        int Min=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Min){
                Min=arr[i];
                index=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println("最小值："+Min);
        System.out.println("下标为"+index);
    }
}
