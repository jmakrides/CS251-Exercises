import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of student in the class: ");
        int noOfStudents = scanner.nextInt();

        int[] grades = new int[noOfStudents];
        int currentStudentGrade;
        for(int i = 0; i < noOfStudents; i++) {
            do {
                System.out.println("Please enter the grade for student (between 0 and 100) " + (i + 1) + ": ");
                currentStudentGrade = scanner.nextInt();
                grades[i] = currentStudentGrade;
            } while (currentStudentGrade < 0 || currentStudentGrade > 100 );
        }

        System.out.println("The grades are: ");
        for (int grade : grades) {
            System.out.println(grade);
        }

        System.out.println("The average is: " + df2.format(getGradesAverage(grades)));
        System.out.println("The median is: " + df2.format(getGradesMedian(grades)));
        System.out.println("The minimum is: " + df2.format(getGradesMinimum(grades)));
        System.out.println("The maximum is: " + df2.format(getGradesMaximum(grades)));
        System.out.println("The standard deviation is: " + df2.format(getGradesStandardDeviation(grades)));
    }

    private static double getGradesAverage(int[] grades) {

        double total = 0.0;
        for (int grade : grades) {
            total = total + grade;
        }
        return total / grades.length;
    }

    private static double getGradesMedian(int[] grades) {

        Arrays.sort(grades);
        double median;
        if (grades.length % 2 == 0) {
            median = ((double) grades[grades.length/2] + (double) grades[grades.length/2 - 1]) / 2;
        }
        else {
            median = (double) grades[grades.length/2];
        }
        return median;
    }

    private static double getGradesMinimum(int[] grades) {

        Arrays.sort(grades);
        return (double) grades[0];
    }

    private static double getGradesMaximum(int[] grades) {

        Arrays.sort(grades);
        return (double) grades[grades.length - 1];
    }

    private static double getGradesStandardDeviation(int[] grades) {

        //Code partially taken from https://www.programiz.com/java-programming/examples/standard-deviation
        double stdDeviation = 0.0;
        for (int i = 0; i < grades.length; i++) {
            stdDeviation = stdDeviation + Math.pow(grades[i] - getGradesAverage(grades), 2);
        }
        return Math.sqrt(stdDeviation/grades.length);
    }

}
