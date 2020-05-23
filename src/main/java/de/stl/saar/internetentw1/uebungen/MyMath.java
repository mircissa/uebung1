package de.stl.saar.internetentw1.uebungen;
 
import org.apache.commons.math3.util.ArithmeticUtils;

public class MyMath
{
    public static void main(String[] args) {
        add(Integer.getInteger(args[0]),Integer.getInteger(args[1]));
    }

  public static int add(int a, int b)
  {
		return ArithmeticUtils.addAndCheck(a,b);
  }
  
  public void main (String[] args[])
  {
	  System.out.println(add(5,6));
  }
}