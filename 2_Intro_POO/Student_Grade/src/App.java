import java.util.Locale;
import java.util.Scanner;
import package_1.Student;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
 
        Student student = new Student();
        
        System.out.println("Inform Student data: ");
        student.setName(sc.nextLine());
        student.setGrade1(sc.nextDouble());
        student.setGrade2(sc.nextDouble());
        student.setGrade3(sc.nextDouble());

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        
        sc.close();

    }
}
