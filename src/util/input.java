package util;

import java.util.Scanner;

public class input {
    private final Scanner scanner;

    public input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Please input string:");
        return scanner.nextLine();
    }

    public boolean yesNo() {

    }

    public static void main(String[] args) {
        Input in = new Input();
        String userString = in.getString();
        System.out.printf("User input: %s%n", userString);
    }
}
