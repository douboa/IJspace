package com.neuedu.www.third;

import java.util.Random;

public class Case5 {
    public static void main(String[] args) {
        int array[]=new int[5];//定义一个数组
        Random random=new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);//给数组随机赋100以内的值
        }
        System.out.println("排序前：");//排序前提示
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");//遍历这个数组，产看排序前已经赋的值
        }
        System.out.println();
        //进行简单选择排序
        for(int i=0;i<array.length-1;i++){//趟数，也相当于遍历一下这个数组的下标,应该比较的那个数的下标,最小值应该在的下标
            int j=i;//实际最小值所在的下标
            for(int k=i+1;k<array.length;k++){//k作为比较的值，筛选出最小值
                if(array[j]>array[k]){//如果前面的数字比后面的大，
                    j=k;//则实际存放最小值得下标就要发生变化
                }
            }
            if(!(j==i)){//当最小值应该坐在的位置与实际最小值所在的位置不一样时，需要调换两个最表上的数字
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;//调换两个数字，使得最小值处于i的位置，即将进入下一次循环，并在第十八条语句中重新将实际存放最小值j等于到应该存放最小值的位置
            }

        }



        System.out.println("排序之后：");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();



    }
}
