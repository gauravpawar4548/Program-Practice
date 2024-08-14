
import java.util.Arrays;

public class Practices {
    public static void main(String[] args) {



 //Uppercase String

          String s1="pawar";

          String s="";

          for(int i=0;i<s1.length();i++)
          {
              char s2= s1.charAt(i);
              if(s2>='a'&& s2<='z')
              {
                  s2 = (char)(s2-32);
              }
              s=s+s2;
          }
        System.out.print(s);



          //LowerCase String

        String s1="PAWAR";

        String ss = "";

        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                ch=(char)(ch+32);
            }
            ss=ss+ch;
        }
        System.out.print(ss);



        //Remove duplicate character and print length

        String s1= "abcdabcd";
        String s="";
        for(int i=0;i<s1.length();i++) {
            int cnt = 0;
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j))

                    cnt++;
            }
            if (cnt != 0) {
                    s = s + s1.charAt(i);
                }
            }

            System.out.println(s.length());
            System.out.print(s);


            //Array Program

        
        //find the array Odd,Even,Positive,Negative
        
         int []a ={11,22,33,44,55,66,-77,88};
         int even =0;
         int odd=0;
         int pos=0;
         int neg=0;
         for(int i=0;i<a.length;i++)
         {
             if(a[i]%2==0)
             {
                 even++;
             }
             else {
                 odd++;
             }
         }
         for(int i=0;i<a.length;i++)
         {
             if(a[i]>0)
             {
                 pos++;
             }
             else {
                 neg++;
             }
         }
        System.out.println("Even Count "+even);
        System.out.println("odd Count "+odd);
        System.out.println("positive count "+pos);
        System.out.println("negative count "+neg);


        //Replace to 1

        int []a={1,0,2,3,0,0};
        for(int i=0;i<a.length;i++)
        {
            a[i]=1;
            System.out.print(a[i]+" ");
        }


        //Array Element add at index

        int [] a={1,2,3,5,6};
        int index_pos=2;
        int element=4;
        for(int i=a.length-1;i>index_pos;i--)
        {
            a[i]=a[i-1];
        }
        a[index_pos]=element;
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }


        //Reverce Array
        
          int [] a={7,6,5,4,3,2,1};
        for(int i=a.length-1;i>0;i--)
        {
            System.out.print(a[i]);
        }

        



    }
}