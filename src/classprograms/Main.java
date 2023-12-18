package classprograms;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        // Create a list to store students

        // Create and add some initial students to the list
        Student student1 = new Student("Pranali", "Rawal", 201808, 55, 1);
        Student student2 = new Student("Pooja", "Tajane", 201805, 80, 1);
        Student student3 = new Student("Omkar", "Sawant", 202377, 93, 1);

        
        Course course = new Course("Java Programming", "Prof. Annamalai", 2023);


        course.enroll(student1);
        course.enroll(student2);
        course.enroll(student3);
        

        // Enroll additional students

        Student[] additionalStudents = {
                new Student("Shivani", "Patil", 202301, 61, 1),
                new Student("Disha", "Patel", 202355, 90, 1)
        };
       
        course.enroll(additionalStudents);
        
        
        
     // Unenroll a student (remove from the collection)
        course.unEnroll(student2);
        System.out.println();
        System.out.println("Number of enrolled students : "+course.countStudents());
        System.out.println("Best grade of course : "+course.bestGrade());
        System.out.println("Average grade for the course : "+course.calculateAverageGrade());
        course.printStudentRanking();
        course.showAboveAverageStatus();
        

	}

}
