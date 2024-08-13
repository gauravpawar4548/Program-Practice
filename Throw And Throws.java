//Throw And Throws 

import static org.apache.coyote.http11.Constants.a;

class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius cannot negative";
    }

    public String getMessage(){
        return "Radius cannot be the negative";
    }
}
public class ThrowException {
    public static double area (int r) throws NegativeRadiusException {
        if(0<r)
        {
            throw new NegativeRadiusException();
        }
        double result =Math.PI * r *r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }

    public static void main(String[] args) {
        try{

        int a=6;int b=0;
        int c = a/b;
        System.out.println(c);

       double area = area(6);

            System.out.println(area);

        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("exception ");
            }

        System.out.println("end of the code ");




    }
}
