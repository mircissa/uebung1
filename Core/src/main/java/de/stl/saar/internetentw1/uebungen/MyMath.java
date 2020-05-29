package de.stl.saar.internetentw1.uebungen;
 
import com.sun.xml.bind.v2.TODO;
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


    public void test(){
        //TEST_ME
    }

    public void todo(){
        //TODO
    }

    public void refactorize(){
        //REFACTORIZE_ME
    }




}