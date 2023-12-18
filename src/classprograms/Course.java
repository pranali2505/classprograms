package classprograms;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Course {
	
	String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents = new ArrayList<>();
    
    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }
    
	public void enroll(Student student){
	      //TODO add the student to the collection
		 enrolledStudents.add(student);	  
	   }

	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
		   
		   enrolledStudents.remove(student);  // Unenroll a student (remove from the collection)
		   System.out.println("After Unrolling :");
	        System.out.println("------------------------------");
	        for (Student students : enrolledStudents) {
	            students.printFullName();
	            students.isApproved();
	            students.changeYearIfApproved();
	            System.out.println(); // Add a newline for better readability
	        } 
		   System.out.println("--------**-------------****--------------*-----");
		   
	   }

	   public int countStudents(){
	       //TODO implement
	       return enrolledStudents.size();
	   }
	   
	   public int bestGrade(){
	       //TODO implement
		   int bestGrade = enrolledStudents.get(0).grade;
	        for (Student student : enrolledStudents) {
	            if (student.grade > bestGrade) {
	                bestGrade = student.grade;
	            }
	        }

	        return bestGrade;
	      
	   }
	   public void enroll(Student[] students) {
		   enrolledStudents.addAll(Arrays.asList(students));
		   System.out.println("List of all the Students :");
	        System.out.println("---------------------------------------");
	        for (Student student : enrolledStudents) {
	            student.printFullName();
	            student.isApproved();
	            student.changeYearIfApproved();
	            System.out.println(); // Add a newline for better readability
	        } 
		   System.out.println("--------**-------------****--------------*-----");
	    }
	   public double calculateAverageGrade() {
	        // Check if there are any enrolled students to avoid division by zero
	        if (enrolledStudents.isEmpty()) {
	            System.out.println("No students enrolled in the course.");
	            return 0.0;
	        }

	        // Calculate the average grade
	        int totalGrade = 0;
	        for (Student student : enrolledStudents) {
	            totalGrade += student.grade;
	        }

	        return (double) totalGrade / enrolledStudents.size();
	    }
	   
	   public void printStudentRanking() {
	        // Check if there are any enrolled students
	        if (enrolledStudents.isEmpty()) {
	            System.out.println("No students enrolled in the course.");
	            return;
	        }

	        // Sort the enrolled students based on their grades (descending order)
	        Collections.sort(enrolledStudents, (s1, s2) -> Integer.compare(s2.grade, s1.grade));

	        // Print the student ranking
	        System.out.println("Student Ranking:");
	        System.out.println("------------------------------------------------------------");
	        for (int i = 0; i < enrolledStudents.size(); i++) {
	            Student student = enrolledStudents.get(i);
	            System.out.println((i + 1) + ". " + student.firstName + " " + student.lastName + ": " + student.grade);
	        }
	        System.out.println("--------------------------------------------------");
	    }
	   
	   public void showAboveAverageStatus() {
	        // Check if there are any enrolled students
	        if (enrolledStudents.isEmpty()) {
	            System.out.println("No students enrolled in the course.");
	            return;
	        }

	        // Calculate the course average
	        double courseAverage = calculateAverageGrade();

	        // Print the above/below average status for each student
	        System.out.println("Above/Below Average Status:");
	        System.out.println("------------------------------------------------------------");
	        for (Student student : enrolledStudents) {
	            System.out.println(student.firstName + " " + student.lastName + ": " +
	                    (student.grade > courseAverage ? "Above" : "Below") + " Average");
	        }
	        System.out.println("-------------------------------------------------");
	    }



}