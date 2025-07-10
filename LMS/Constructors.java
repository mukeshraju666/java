package LMS;
public class Constructors{
     
     String Name;
     int x;
     int y;

     public Constructors(){
        x = 500;
        y = 500;
        Name = "mukesh";
     }
     public int addNumbers() {
        return x+y;
     }
      public Constructors(int x, int y, String Name){
        this.x=x;
        this.y=y;
        this.Name=Name;
      }

     public int differnce(){
        return x-y;
     }
     public String display(){
          return Name;
     }

    public static void main(String[]args){
        Constructors obj = new Constructors();

        System.out.println("sum of x+y :"+obj.addNumbers());
        System.out.println("sum of x-y :"+obj.differnce());
         System.out.println("Name display :"+obj.display());

         Constructors obj1 = new Constructors(10,20,"Raju");
          System.out.println("sum of x+y :"+obj1.addNumbers());
          System.out.println("Name display :"+obj1.display());
          


    }
}