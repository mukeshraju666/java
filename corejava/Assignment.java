package corejava;
public class Assignment{
    //default values for  the undeclared variables
     static String Name;
     static int a;
     static boolean b;
     static double d;
     static float z;

    public static void main(String[]args){
        int x,y;
        x = 3;
        y = 5;
        // sum of two numbers
        System.out.println("sum of two integers is :"+(x+y));

        // Differnce of two numbers
        System.out.println("The differnce of two integers is :"+(x-y));

        // Product of two numbers
        System.out.println("Product of two numbers is :"+(x*y));

        //Division of two numbers 
        System.out.println("Division of two numbers is :"+(x/y));
        
        // declaring a default variables
        System.out.println(Name);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(z);
    }
}