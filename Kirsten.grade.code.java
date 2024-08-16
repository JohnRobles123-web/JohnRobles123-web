package com.mycompany.kirsten.code;
import java.util.Scanner;

public class KirstenCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int subjectnumbers;
        double gradestotal = 0, grade;
        
       
        System.out.print("Enter the number of subjects: ");
        subjectnumbers = scanner.nextInt();
        
        
        int failuresubject = 0;
        String failedSubjects = ""; 

        
        for (int i = 1; i <= subjectnumbers; i++) {
            System.out.print("Enter grade for subject " + i + ": ");
            grade = scanner.nextDouble();
            gradestotal += grade;
            
            
            if (grade < 60) {
                failedSubjects += i + " "; 
                failuresubject++;
            }
        }

      
        double averageGrade = gradestotal / subjectnumbers;

       
        System.out.println("Average Grade: " + averageGrade);

      
        if (averageGrade >= 90) {
            System.out.println("Your grade: Excellent");
        } else if (averageGrade >= 80) {
            System.out.println("Your grade: Good");
        } else if (averageGrade >= 70) {
            System.out.println("Your grade: Average");
        } else if (averageGrade >= 60) {
            System.out.println("Your grade: Pass");
        } else {
            System.out.println("Your grade: Fail");
        }

      
        if (failuresubject > 0) {
            System.out.println("You failed in the following subjects: " + failedSubjects);
        } else {
            System.out.println("Congratulations!");
        }

        
        scanner.close();
    }
}