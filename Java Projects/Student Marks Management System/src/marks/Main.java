package marks;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        int[] marks = new int[10];
        
        for (int i = 0; i < 10; i++){
            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter marks for " + names[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        
        for (int i = 0; i < 10; i++){
            char grade;
            if (marks[i] >= 75) grade = 'A';
            else if (marks[i] >= 60) grade = 'B';
            else if (marks[i] >= 50) grade = 'C';
            else grade = 'F';
            System.out.println(names[i] + " scored " + marks[i] + " and got grade " + grade);
        }
        sc.close();
    }
    
}