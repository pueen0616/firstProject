package com.yedam.format;

import java.text.MessageFormat;

public class MessageFomatExample {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String id ="java";
      String name = "김현동";
      String tel = "010-4524-1972";
    //messageFormat 사용
      String text = "회원  ID : {0} \n회원 이름 : {1} \n회원 전화 : {2}";
      String result1 = MessageFormat.format(text,id,name,tel);
      System.out.println(result1);
      
      String dd ="({0},{1},{2},{3})";
      Object[] arguments = {"java","신용권","010-9233-6276","HI"};
      String result2 = MessageFormat.format(dd, arguments);
      System.out.println(result2);
   }
}