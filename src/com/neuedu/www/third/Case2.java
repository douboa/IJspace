package com.neuedu.www.third;

import java.util.Random;

public class Case2 {
    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5,6};
//        System.out.println("请输入五个数字");
        Random ran = new Random();
        int[] arr = new int[5];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100);
        }
       for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
       }
    }
}
