package com.neuedu.www.second;

public class case4 {
    public static void main(String[] args) {
        int sum=0;
       for(int i=101;i<=200;i++){
           boolean flag=true;
           for(int j=2;j<i;j++){
               if(i%j==0){
                   flag=false;
                   break;
               }

           }
           if(flag==true){
               sum++;
               System.out.print(i+"\t");
//               System.out.println(i);
               if(sum%10==0){
                   System.out.println();
               }
           }
       }
    }
}
