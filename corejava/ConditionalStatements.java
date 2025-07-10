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


        //Check the person is Eligible for Vote or Not;

        int age = 8;
        if(age >= 18){
            System.out.println("You can vote");
        }else if(age < 18){
            System.out.println("NO You are not eligible");
        }else {
            System.out.println("Enter Numbers(AGE) only");
        }
    }
}