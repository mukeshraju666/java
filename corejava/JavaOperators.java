package  corejava;
class JavaOperators{
    public static void main(String [] args){
        // Assignment Operators
        int num1 = 34;
        int num2 = num1;

        System.out.println("+ Operator is: " + (num2+num1));
        System.out.println("- Operator is: " + (num2-num1));
        System.out.println("* Operator is: " + (num2*num1));
        System.out.println("/ Operator is: " + (num2/num1));
        System.out.println("% Operator is: " + (num2%num1));

        //Increment operator
         System.out.println("Num2 is : " + (++num2));// --> it is pre increment
        System.out.println("Num2 is : " + num2++); // --> it is post increment
         System.out.println("Num2 is : " + num2);
           System.out.println("----");
         

         // Decrement operator
          System.out.println("Num2 is : " + (--num2));// --> it is pre decrement
        System.out.println("Num2 is : " + num2--); // --> it is post decrement
         System.out.println("Num2 is : " + num2);

         
    }
}