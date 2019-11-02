package functions;

import java.math.BigInteger;

public class PowerFunction {

    /*
    Time Complexity: O(LogN)
    Space Complexity: O(1)
    */


 public static BigInteger power(Integer x,  Integer y)
    {
        BigInteger calculated;
        if( y == 0)
            return BigInteger.ONE;
        calculated = power(x, y/2);
        if (y%2 == 0)
            return calculated.multiply(calculated);
        else
            return BigInteger.valueOf(x).multiply(calculated).multiply(calculated);
    }

 public static void main(String args[]){

     // test case with large power
     Integer x = 2;
     Integer y = 1000000;

    BigInteger power =  PowerFunction.power(x,y);
    System.out.println("power("+x+","+y+")=" + power);
 }

}
