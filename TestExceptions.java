/************************************
 Matthew Whalley
 Lab #3
 September 28, 2016
 *************************************/
 
 public class TestExceptions{
 
   public static void main(String[] args){
      
      int[] myArr = new int[10];
      int x,y,z;
      x = 0;
      y = 10;
      try{
         z = y/x;
         myArr[10] = 0;
      }catch(Exception e){
         System.out.println(e);
      }
   }
 }