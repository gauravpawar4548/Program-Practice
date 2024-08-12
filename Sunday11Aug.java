  
public class Practices {
    public static void main(String[] args) {
     
     //Pattern

//        int end=1;
//        int space =8;
//        int cnt=1;
//        for(int i=1;i<=9;i++) {
//            for(int j=1;j<=9;j++)
//            {
//                if(j<=space)
//                {
//                    System.out.print(" ");
//                }
//                else {
//                    System.out.print(cnt+" ");
//                }
//            }
//            System.out.println();
//            cnt++;
//            space--;
//            end++;
//        }

        //Pattern number

//        int cnt =1;
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i == 1 || j== 1|| i == 4|| j==5)
//                {
//                    System.out.print(cnt);
//
//               }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//



        //Pattern Type Print Symbol
//        int cnt =1;
//        int end =1;
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=end;j++)
//            {
//                System.out.print((char)(cnt+63));
//            }
//            System.out.println();
//            end++;
//        }


        //Pattern A TO Z

//        int cnt=1;
//        for(int i=1;i<=3;i++)
//        {
//            for(int j=1;j<=9;j++)
//            {
//                System.out.print((char)(cnt+64));
//                cnt++;
//            }
//            System.out.println();
//        }


        //Pattern Character

//        int cnt =1;
//        int end =1;
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=end;j++)
//            {
//                System.out.print((char)(cnt+64));
//            }
//            System.out.println();
//            end++;
//            cnt++;
//        }

        //Pattern Character

//         int cnt=1;
//         int space = 4;
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(j<=space) {
//                     System.out.print(" ");
//                 }
//                 else {
//                     System.out.print((char)(cnt+64));
//                 }
//             }
//             System.out.println();
//             cnt++;
//             space--;
//         }


        //Pattern Character

//        int cnt=1;
//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i==1 || j==1 || i==4 || j==5){
//                    System.out.print((char)(cnt+64));
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }




        //Pattern Character

//        int cnt =1;
//        int end=1;
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=end;j++)
//            {
//                System.out.print((char)(cnt+64));
//            }
//            System.out.println();
//            end++;
//        }

//            //Pattern Character

//        int cnt =1;
//        int end =1;
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=end;j++)
//            {
//                System.out.print((char)(cnt+64));
//
//           }
//            System.out.println();
//            end++;
//            cnt++;
//        }



     //Print  Prime number within 20
//        int  num =20;
//        for(int i=1;i<=num;i++) {
//            int  cnt=0;
//            {
//                for(int j=2;j<=i/2;j++)
//                {
//                    if(i %j==0)
//                        cnt++;
//                    break;
//                }
//            }
//            if(cnt==0){
//                System.out.println(i);
//            }
//        }


        //String common Character print

//        String s1="virat p Kohali";
//        String s2="Rohit p Sharma";
//        String s3="Mahendra p Dhoni";
//
//        String common ="";
//
//        for(char c : s1.toCharArray()){
//            if(s1.indexOf(c)!=-1 && s2.indexOf(c)!=-1 && s3.indexOf(c)!=-1)
//                common = common+c;
//        }
//        System.out.println("Common Character for String:  "+common);




    }
}