package util;

import java.util.Scanner;

public class input {
    private Scanner scanner;
    private boolean prompt;

    public input() {

        this.scanner = new Scanner(System.in);
    }

    public void clear() {
    this.scanner.nextLine();
}
    public String getString() {
        System.out.println("Please input string...");
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public int yesNo() {
        System.out.println("Yes or No?");
        String input = this.scanner.nextLine();
        input = input.toLowerCase();
        switch (input) {
            case ("no"):
                return false;
            case ("yes"):
                return true;
        }


    public int getInt(int min, int max) {
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = this.scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }

    public int getInt(String prompt, int min, int max) {
        int input;
        do {
            System.out.println(prompt);
            input = this.scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
            System.out.println("Input acceptable");
            return input;
        }

        public int getIntegerSecret(int min, int max) {
            int input;
            do {
                System.out.println("Enter a number between " + min + " and " + (max - 1) + ".");
                input = this.scanner.nextInt();
                if (input < min || input > max) {
                    System.out.println("Input invalid");
                }
            } while (input < min || input > max);
            System.out.println("Input acceptable");
            return input;
        }

        public int getInt () {
            System.out.println("Input number...");
            while (true) {
                try {
                    int userInput = Integer.valueOf(this.scanner.nextLine());
                    System.out.println("Input acceptable");
                    return userInput;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input not an integer. Try agan.");
                }
            }
        }

        public double getDouble(double min, double max){
            double input;
            do {
                System.out.println("Enter a number between " + min + " and " + max + ".");
                input = this.scanner.nextDouble();
                if (input < min || input > max) {
                    System.out.println("Input invalid");
                }
            } while (input < min || input > max);
            System.out.println("Input acceptable");
            return input;
        }

        public double getDouble() {
            System.out.println("Input number...");
            while (true) {
                try {
                    double userInput = Double.valueOf(getString());
                    System.out.println("Input acceptable");
                    return userInput;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid. Input not a double. Try again.");
                }
            }
        }

        public long getHex() {
            System.out.println("Input hexadecimal number");
            while (true) {
                try {
                    long hex = Long.valueOf(scanner.next(), 16);
                    System.out.println("Input acceptable");
                    return hex;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid. Input not a hexadecimal. Try again.");
                }
            }
        }

        public long getBinary () {
            System.out.println("Input binary number");
            while (true) {
                try {
                    long bin = Long.valueOf(scanner.nextLine(), 2);
                    System.out.println("Input acceptable");
                    return bin;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid. Input not in binary. Try again.");
                }
            }
        }
    }
