package com.yedam.classes;

public class Personset {

   String name;
   int age;
   // 생성자
   public Personset() { //매개값없이  생성자를 기본생성자 
      name = "anonymous";
      age = 0;
      
   }
   //매개값이 있는 생성자
   public Personset(String name) {
      this.name = name;
   }
   
 //매개값이 있는 생성자
   public Personset(String name,int age) {
      this.name = name;
      this.age = age;
   }
   
   public String introduce() {
      return "이름은 " + name+" 나이는 "+age;
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
@Override
public int hashCode() {
   // TODO Auto-generated method stub
   return this.age;
}
@Override
public boolean equals(Object obj) {
   // TODO Auto-generated method stub
   Personset p = (Personset)obj;
   return this.age==(p.getAge());//위에꺼는 나이랑 이름이 같을떄 같은값
//   return this.name.equals(p.getName()); 밑에꺼 사용하면 이름이랑 나이가 같을떄 
}
   
}