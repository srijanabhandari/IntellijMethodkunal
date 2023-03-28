import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int num1 , num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 number");


        num1 =sc.nextInt();

        System.out.println("Enter the second number ");
        num2 =sc.nextInt();

         int result = m1(num1,num2);
       System.out.println(result);



       m2(num1, num2);


       // int result = m3(3,6);
        //System.out.println(result);




    }
    static int m1(int num1, int num2) {
        //System.out.println("Enter the number");


        return num1 + num2;


    }



    static void m2(int num1, int num2) {
        //System.out.println("Enter the number");

        int sum= num1 + num2;

        System.out.println(sum);
    }

    static int m3(int a , int b){
        int sum = a + b;
        return sum;

    }
    }
    //5, 3, 7,5,11,2,3, 5,19 = sort, remove dublicate,


