import java.util.Scanner;


public class ScannerExercise {
    Scanner sc = new Scanner(System.in);

    public void show_Details(){
        String name;
        String course;
        int year_of_birth;
        int age;
        System.out.println("Enter your name:");
        name = sc.next();
        System.out.println("Enter your year of birth:");
        year_of_birth = sc.nextInt();
        System.out.println("Enter your course");
        course = sc.next();

        System.out.println("Hello, "+name+". You are a student studying "+course+" You are "+(2025-year_of_birth)+" years old" +
                " Nice to meet you");
    }
    public static void main(String[] args){
        (new ScannerExercise()).show_Details();
    }
}
