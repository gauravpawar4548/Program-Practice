


public class Finallyblockk {
    public static void main(String[] args) {

        //try catch and finally block
        try {
            int a=50;int b=0;
            int c=a/b;
            System.out.println(c);
        }catch(Exception e)
        {
            System.out.println(e);
        }finally{
            System.out.println("I am finally block");
        }


        //try and finally block
        try{
            System.out.println(50/0);
        }
        finally{
            System.out.println("i am in finally block");
        }

    }
    }




//Finally Block

public class FinallyBlock {

   public static int greek() {

//not exception
       try {
           int a = 9;
           int b = 0;
           int c = a+b;
           return c;
       } catch (Exception e) {
           System.out.println(e);

           return -1;
       }
       finally {
           System.out.println("this is end of the");
       }
       //return -1;
   }

    public static void main(String[] args) {
        int d = greek();
        System.out.println(d);

        try {
            System.out.println(50/5);
        }
        finally {
            System.out.println("Yes i am allowed");
        }
        int a=8;int b=9;
        while(true)
        {
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;

            }
            finally {
                System.out.println("Yes i am finally b"+b);

        }
            b--;
        }
    }
}

