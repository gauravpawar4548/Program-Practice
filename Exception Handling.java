//Exception Handling

public class ExceptionHandling {
    public static void main(String[] args) {

        int a = 6888;
        int b = 0;
        // int c= a/b;


        try {
            int c = a / b;
            System.out.println("the true the condition");
        } catch (Exception e) {
            System.out.println("code is not executed");
        }
    }
}





//Nested Exception


import java.util.Scanner;
public class NestedException {
    public static void main(String[] args) {

        //
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of index");
        int ind = sc.nextInt();
        try {
            System.out.println("Enter the program");
            try {
                System.out.println(marks[ind]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("sorry this is not execute");
                System.out.println("Exception in level second");
            }
        } catch (Exception e) {
            System.out.println("Exception in first");
        }

        System.out.println("Thanks for using this program");
    }
}





//Specific Exception


import java.sql.SQLOutput;
import java.util.Scanner;

public class SpecificException {
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks[0]=46;
        marks[1]=56;
        marks[2]=67;
        marks[3]=56;


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array index");
        int index = sc.nextInt();

        System.out.println("the endex of array are divide number");
        int number = sc.nextInt();

        try{
            System.out.println("array index marks "+marks[index]);
            System.out.println("divide number and index "+marks[index]/number);
        }
        catch(ArithmeticException e){
            System.out.println("This is Arthmetic Exception");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("this is ArrayOutOfBondsException");
            System.out.println(e);;
        }
        catch(Exception e){
            System.out.println("some other exception are occur ");
            System.out.println(e);
        }
    }




    //Exception Class


import java.util.Scanner;

public class ExceptionClass {
    public static void main(String[] args) {
        int a=8;
        Scanner sc =new Scanner(System.in);
        int b= sc.nextInt();
        if(a<199){
            try{
                throw new MyException();

            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Yes");
            }
            System.out.println("last ");
        }

    }
}

class MyException extends Exception
{
    public String toString(){
        return "I am toString ()";
    }

    public String getMessage(){
        return "I am message ofgetMessage()";
    }

}
