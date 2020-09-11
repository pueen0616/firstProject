package com.yedam.lambda;
import java.util.*;
public class BaseBall {
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      boolean run=true;
      int []num=new int[3];
      Scanner scn=new Scanner(System.in);
      int []numarray=new int[3];
      for(int i=0;i<3;i++) {
         num[i]=(int)(Math.random()*9+1);
         for(int j=0;j<i;j++) {
            if(num[i]==num[j]) {
               i--;
            }
         }
      }
      
      for(int i=0;i<3;i++)
      {
         System.out.println(num[i]);
      }
      int input=0;
      int cnt1=0,cnt2=0,cnt3=0;
      while(run) {
         System.out.println("숫자야구 쑤따뜨");
         for(int i=0;i<3;i++) {
            System.out.println("값을 입력하시오");
            input=scn.nextInt();
            numarray[i]=input;
            
         }
         cnt3++;
         for(int i=0;i<3;i++) {
            if(num[i]==numarray[i]) {
               System.out.println("쓰뚜라이크");
               cnt1++;
            }
            for(int j=0;j<3;j++) {
               if((num[i]==numarray[j])&&(i!=j)) {
                  System.out.println("뽀올~");
                  cnt2++;
               }
            }
            
         }
         System.out.println("스뚜라이크:"+cnt1+"뽀올:"+cnt2+"시도횟수:"+cnt3);
         if(cnt1==3)
         {
            System.out.println(cnt3+"번만에 성공하셧슴다");
            break;
            }
         cnt1=0;
         cnt2=0;
      }
   }

}