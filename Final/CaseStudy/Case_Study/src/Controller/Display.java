package Controller;

import java.util.Scanner;

public class Display {

    private static Display display;
    private Display(){};

    public static Display load(){
        if (display == null){
            display = new Display();
        }
        return display;
    }


    public static void loadProgram() {
        System.out.println("-------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome");
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("3.Exit");
        String choice = scanner.nextLine();
//        scanner.nextLine();
        switch (choice) {
            case "1":
                Login.login();
                break;
            case "2":
                Register.register();
                break;
            case "3":
                System.out.println("Good Bye");
                return;
            default:
                System.out.println("Erorr");
                loadProgram();

        }
    }
}
