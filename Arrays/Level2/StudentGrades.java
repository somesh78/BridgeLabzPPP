package Arrays.Level2;

import java.util.Scanner;

public class StudentGrades {
    
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; 
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks of student " + (i + 1) + " (Physics, Chemistry, Maths):");

            System.out.print("Physics: ");
            int phy = sc.nextInt();

            System.out.print("Chemistry: ");
            int chem = sc.nextInt();

            System.out.print("Maths: ");
            int math = sc.nextInt();

            if (phy < 0 || chem < 0 || math < 0) {
                System.out.println("❌ Marks cannot be negative. Please re-enter.");
                i--; 
                continue;
            }

            marks[i][0] = phy;
            marks[i][1] = chem;
            marks[i][2] = math;

            int total = phy + chem + math;
            double percentage = total / 3.0;
            percentages[i] = percentage;

            grades[i] = calculateGrade(percentage);
        }

        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f%%\t\t%s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    percentages[i], grades[i]);
        }

        sc.close();
    }
}