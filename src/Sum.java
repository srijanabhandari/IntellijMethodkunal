import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // int result = m1();
       // System.out.println(result);

      //  m2();
       int result = m3(3,6);
        System.out.println(result);




    }
    static int m1() {
        //System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 number");


         int num1 = sc.nextInt();

        System.out.println("Enter the second number ");
        int num2 = sc.nextInt();

        return num1 + num2;
    }



    static void m2() {
        //System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 number");


        int num1 = sc.nextInt();

        System.out.println("Enter the second number ");
        int num2 = sc.nextInt();

        int sum= num1 + num2;
        System.out.println(sum);
    }

    static int m3(int a , int b){
        int sum = a + b;
        return sum;

    }
    }

