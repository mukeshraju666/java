package LMS;
class LMS{
    public static void main(String []args){
        String studentName = "Mukesh";
        int studentId = 101;
        int studentAge = 24;
        char studentGender = 'M';
        double quiz = 85;
        double assignment = 90;
        double exam = 95;
        double studentAttendance = 89;
        boolean isTrainer = true;

        // courses 
        String courseName = "Java";
        int courseID = 111;
        float courseDuration = 4;
        int totalCredits = 5;

        // Calculate total score
        double totalScore = quiz + assignment + exam;

          // Calculate Average score
        double averageScore = totalScore/3;

        // Check the student is passed or not 
        boolean isPassed = averageScore >= 50;

        // Increment the Daily Attendance 
         studentAttendance++;

         // Check Student is qualified for attendance 

         boolean isQualified = (studentAttendance > 85) && isPassed;



        System.out.println("Student Name :" + studentName);
        System.out.println("Student ID :" + studentId);
        System.out.println("Student Gender :" + studentGender);
        System.out.println("Trainer Available :" + isTrainer);
        System.out.println("Student CourseName :" + courseName);
        System.out.println("Student CourseID :" + courseID);
        System.out.println("Student CourseDuration :" + courseDuration);
        System.out.println("Student Total Credits :" + totalCredits);
         System.out.println("Student AGE is :" + studentAge);
          System.out.println("Total Score :" + totalScore);
           System.out.println("Average Score :" + averageScore);
            System.out.println("Student is passed/fail : " + isPassed);
             System.out.println("Student Attendance : " +studentAttendance);
              System.out.println("Student is Qualified or not : " + isQualified);


        

    }
}