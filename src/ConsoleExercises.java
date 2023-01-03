import java.util.Scanner;

    public class ConsoleExercises {
        public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f. %n", pi);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int userInput = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//        Scanner scanner3 = new Scanner(System.in);

//        System.out.println("Please enter 3 words: ");

//        String word1 = scanner1.next();
//        String word2 = scanner1.next();
//        String word3 = scanner1.next();

//        System.out.printf("%s %n %s %n %s", word1, word2, word3);
//        System.out.println("");
//        scanner1.nextLine();

//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner1.nextLine();
//       System.out.print("your sentence is: %s %n", userSentence);

//        System.out.println("Enter the length of the room: ");
//        String lengthInput = scanner1.nextLine();

//        System.out.println("Enter the width of the room: ");
//        System widthInput = scanner1.nextLine();

        System.out.println("Enter the length and width of the room: ");
        String widthInput = scanner1.nextLine();
        scanner1.useDelimiter("\n");
        float userBonusLength = scanner1.nextFloat();

        System.out.printf("length: %s and width: %s %n", userBonusLength, widthInput);

//        int length = Integer.parseInt(lengthInput);
//        int width = Integer.parseInt(widthInput);

//        float length = Float.parseFloat(lengthInput);
        float width = Float.parseFloat(widthInput);

//        int area = width*length;
//        int perimeter = (length*2) + (width*2);

        float area = width*userBonusLength;
        float perimeter = (userBonusLength*2) + (width*2);

        float volume = (userBonusLength*width*20);

        System.out.printf("Area of the room: %s %n", perimeter);

        System.out.printf("Perimeter of the room: %s %n", volume);

    }
}