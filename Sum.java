//PROGRAM 3
import java.io.*;
import java.lang.*;
class Sum1
{
public void intSum(int x,int y)
   {
    int i,k=0;
    for(i=x;i<=y;i++)
    {
     if(i%13==0||i%15==0||i%17==0)
     { 
		 if(i%30==0)
        k=i;
        k=k+i;
      
     }
    
    }
     System.out.println(k);
}
}
 class Sum
 {
  public static void main(String args[])
  {
   Sum1 b=new Sum1();
   b.intSum(10,15);
  }
 }
