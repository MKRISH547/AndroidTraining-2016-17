//PROGRAM 2 
import java.io.*;
import java.lang.*;
class Sample1
{
public void intRange(int x,int y)
   {
    boolean a = (x>=10&&x<=20 || y>=10&&y<=20);
    System.out.println(a);
   }
 }
 class Sample
 {
  public static void main(String args[])
  {
   Sample1 b=new Sample1();
   b.intRange(20,30);
  }
 }
