package demo;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    String name;
    int age;

    int askAboutAge(int age) {
        System.out.print("How old are you? ");
        age = in.nextInt();
        return age;
    }

    void hello() {
        System.out.print("What is your name: ");
        name = in.nextLine();
        System.out.println("Hi " + name);
    }

    void go() {
        hello();
        int yourAge;
        yourAge = age;
        System.out.println("You are " + yourAge + " old");
        System.out.println("It works");

    }

    public static void main(String[] args) {
       new Main().go();
    }
}
