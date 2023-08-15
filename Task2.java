import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no.of Subjects:");
         int no_of_subjects=sc.nextInt();
         int total_marks=0;
         int[] marks=new int[no_of_subjects];
         for(int i=0;i<no_of_subjects;i++){
            System.out.print("Enter Marks for subject "+(i+1)+":");
            marks[i]=sc.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                return;
            }
            total_marks+=marks[i];
            }
        double avgPercentage = (double) total_marks / (no_of_subjects * 100) * 100;
        System.out.println("Total Marks: " + total_marks);
        System.out.println("Average Percentage: " + avgPercentage + "%");

        char grade;
        if (avgPercentage >= 90) {
            grade = 'A';
        } else if (avgPercentage >= 80) {
            grade = 'B';
        } else if (avgPercentage >= 70) {
            grade = 'C';
        } else if (avgPercentage >= 60) {
            grade = 'D';
        } else if (avgPercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        sc.close();  
    }
    
}
