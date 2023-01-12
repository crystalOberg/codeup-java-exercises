import java.util.Scanner;

public class HighLow {

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 2;
        System.out.println(getInteger(1, 10));

    }


    public static int getInteger(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        Scanner scanner = new Scanner(System.in);
        int userInput;
        userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }
        return getInteger(min, max);
        }
    class ArithmeticSample {
        public static void main(String[] args) {
            int x = 5 * 4 % 3;
            System.out.println(x);
        }}
    }




