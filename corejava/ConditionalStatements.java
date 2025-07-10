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

        // Check the given number is in Range or Not;
        // Range is 20 to 30;

        int numRange = 5;
        if(numRange >=20 && numRange<=30){
            System.out.println("Given number is in Range");
        }else{
            System.out.println("Not in Range");
        }


        // Check the Grade Systems

        int score = 1;
        if(score >= 90){
            System.out.println("GRADE A");
        }else if (score >=75){
            System.out.println("GRADE B");
        }else if (score >=50){
            System.out.println("GRADE C");
        }else{
            System.out.println("FAIL");
        }
    }
}