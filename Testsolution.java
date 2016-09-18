import java.io.*;
import java.lang.*;
 class solution1
 {
	public void samelast(int x,int y)
	{
	boolean a = (x%10==y%10);
	System.out.println(a);	  
    }
  }
  class Testsolution
  {
	   public static void main(String args[])throws IOException
	    {
			 solution1 b=new solution1();
			 b.samelast(25,37);
		}	   
  }	  
