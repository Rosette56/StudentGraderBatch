
package studentgraderbatch;
 import java.util.Scanner;

public class StudentGraderBatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            System.out.print("Enter score for student " + (count + 1) + ": ");
            int score = input.nextInt();

            int grade;
            String remark;

            if (score >= 80 && score <= 100) {
                grade = 1;
                remark = "Distinction";
            } else if (score >= 75) {
                grade = 2;
                remark = "Distinction";
            } else if (score >= 66) {
                grade = 3;
                remark = "Credit";
            } else if (score >= 55) {
                grade = 4;
                remark = "Credit";
            } else if (score >= 45) {
                grade = 5;
                remark = "Pass";
            } else if (score >= 30) {
                grade = 6;
                remark = "Pass";
            } else if (score >= 0) {
                grade = 9;
                remark = "Fail";
            } else {
                System.out.println("Invalid score entered.");
                continue; // Skip this iteration
            }

            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade);
            System.out.println("Remark: " + remark);
            System.out.println("-----------------------------");

            count++;
        }
    }
}

