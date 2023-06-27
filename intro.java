import java.util.*;
class intro {
    public static void main(String[] args) {
        //Input Class
        Scanner sc = new Scanner(System.in);
        //Print function in java
        System.out.println("Hello World");
        //variable declaration
        //datatype var_name;
        String s;
        System.out.println("Please Enter Your name");
        //use to take input from user
        s = sc.next();
        System.out.println("Your name is "+s);
        //variable declare
        //we can put whole number values in integer datatype -ve or +ve
        int a,b,c;
//        int b;
//        int c;
        //variable intialization
//        a=10;
//        b=20;
//        c=30;
        System.out.println("Enter value of a");
        a = sc.nextInt();
        char ch;
        //character input
        ch = sc.next().charAt(0);
        System.out.println(ch);
        float d=10.39f;
        double e=100;
    }
}

