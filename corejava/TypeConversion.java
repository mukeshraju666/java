package  corejava;
class TypeConversion{
    public static void main(String []args){
        // Type conversion (Wideing)
        int num1 = 34;
        double num2 = num1;
        System.out.println(num2); 

        // Type casting (Narrowing)
        double num3 = 434;
        int num4 = (int) num3;
        System.out.println(num4);


        //Type Conversion (Primitive to Non-Primitive)
        int num5 = 546;
        String str = String.valueOf(num5);
        System.out.println(str);   

        //Some conversions cannot convert ;

        // int num6 = 35;
        // boolean num7 = num6;
        // System.out.println(num7);         
    }
}