import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a name");
        String inputName = scanner.nextLine();

        boolean isExist = false;
        for ( int i=0; i < students.length; i++){
            if (students[i].equals(inputName)){
                System.out.println("Position of the students in the list " + inputName + " is " + i);
                isExist = true;
                break;
            }
        }
if (!isExist){
    System.out.println("Not found" + inputName + " in the list.");
}
    }
}
