package classprograms;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
 // Constructors
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public Student(String firstName, String lastName, int registration) {
        this(firstName, lastName, registration, 0, 1);
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0, 1);
    }
    
    //Method
    
    public void printFullName(){
        //TODO implement
    	System.out.println("Registration No. : "+registration);
    	System.out.println("Name : "+firstName+" "+lastName);
    	System.out.println("Grade : "+grade);
    	System.out.println("Year : "+year);
     }

     public void isApproved(){
         //TODO implement: should return true if grade >= 60
    	 if (grade >= 60) {
             System.out.println("Student is approved with grade: " + grade);
         } else {
             System.out.println("Student is not approved with grade: " + grade);
         }
     }

     public int changeYearIfApproved() {
         // Check if the student is approved based on the grade
         if (grade >= 60) {
             // Increment the year and print a congratulatory message
             year++;
             System.out.println("Congratulations! You have been promoted to year " + year);
         } else {
             System.out.println("Sorry, you need a grade of 60 or higher to be promoted.");
         }
         return year;
     }

}
