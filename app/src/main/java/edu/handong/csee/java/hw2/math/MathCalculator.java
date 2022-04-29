package edu.handong.csee.java.hw2.math;

/**
 * Create Math Calculator class
 */

public class  MathCalculator{
    private String name;
    /**
      This is a setName method
    */
    public void setName(String name){
        this.name = name;
    }
    
    /**
      This is a getName method
    */

    public String getName() {
        return name;
    }
    /**
      This is a getMax method
    */
    public int getMax(int a ,int b ){
        if(a>b)
            return a;
        else 
            return b;
    }

    /**
      This is a getNMin method
    */
    public int getMin(int a ,int b ){
        if(a<b)
            return a;
        else 
            return b;
    }

    /**
      This is a getAbs method
    */
    public int getAbs(int a){
        if(a>=0)
            return a;
        return -a;
    }
    /**
      This is a getSum method
    */
    public int getSum(int a, int b){
        int result;
        result = a+b;
        return result;
    }

    /**
      This is a getDiff method
    */
    public int getDiff(int a, int b){
        int result;
        result = a-b;
        return result;
    }
    
    /**
      This is a getProduct method
    */

    public int getProduct(int a, int b){
        int result;
        result = a*b;
        return result;
    }

    /**
      This is a getQuotient method
    */

    public int getQuotient(int a, int b){
        int result;
        result = a/b;
        return result;
    }

    /**
      This is a getName method
    */

    public int getRemainder(int a,int b){
        int result;
        result = a%b;
        return result;
    }

    /**
      This is a getPower method
    */

    public int getPower(int a, int b){
        if(b==0)
          return 1;
        else
          return getPower(a, b-1)*a;
    }

    /**
      This is a getFactorial method
    */

    public int getFactorial(int a){
        if (a == 0)
            return 1;
        else 
            return getFactorial(a-1) * a;
    }
    
    /**
      This is a getGcd method
    */

    public int getGcd(int a,int b){
        if(b == 0) return a;
        return getGcd(b, a % b);
    }

    /**
      This is a getLcm method
    */

    public int getLcm(int a, int b){
        return (a * b) / getGcd(a, b);
    }

    /**
      This is a getSquare method
    */

    public int getSquare(int a){
        int result;
        result = a*a;
        return result;
    }
}
