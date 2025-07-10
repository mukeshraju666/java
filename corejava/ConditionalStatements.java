package corejava;
class ConditionalStatements{
    public static void main(String[] args){
        
        // Given Number is Positive or Negative
        int num = -46;
        if (num > 0){
            System.out.println("Given Number is Positive");
        }else if(num < 0){
           System.out.println("Given Number is negative");
        }else{
            System.out.println("Enter only Numbers");
        }
    }
}