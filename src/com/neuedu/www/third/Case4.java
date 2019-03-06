package com.neuedu.www.third;

import java.util.Random;

public class Case4 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);
        }
        System.out.println("未排序之前：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("排序之后：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
