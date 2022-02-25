package demo;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    String name;

    void greet() {
        System.out.print("What is your name: ");
        name = in.nextLine();
        System.out.println("Hi " + name);


    }

    void go() {
        greet();
        System.out.println("It works");
    }

    public static void main(String[] args) {
       new Main().go();
    }
}
