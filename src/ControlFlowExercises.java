import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 5;
//        while (i < 15) {
//            System.out.println(i);
//            i++;
//            }

//            int count = 0;
//         do{
//             if(count%2 == 0){
//                 System.out.println(count);
//             }
//             count++;
//         }while(count <= 100);

//         int count2 = 100;
//         do {
//             if(count2%5 == 0){
//             System.out.println(count2);
//             }
//             count2 -= 5;
//         }while(count2 >= -10);

//         long count3 = 2;
//         do {
//             System.out.println(count3);
//             count3 *= count3;
//         }while(count3 < 1000000);

//////////////QUESTION 2////////////////
//        int n = 100;

//        for (int i=1; i<=n; i++)
//        {
//            if (i%15==0)
//                System.out.println("FizzBuzz");

//            else if (i%5==0)
//                System.out.println("Buzz");

//            else if (i%3==0)
//                System.out.println("Fizz");

//            else
//                System.out.println(i);
//        }

//////////////QUESTION 3////////////////
//        Scanner sorina = new Scanner(System.in);
//        int userInput = 0;
//        String playAgain = "y";

//        while(playAgain.equalsIgnoreCase("y")){
//            System.out.print("What number would you like to go to?");
//            userInput = sorina.nextInt();
//            System.out.println("Here is your table! \n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------  | ------");
//            for(int i = 1; i <= userInput; i++){
//                System.out.printf("%s    | %s    | %s    \n", i, i*i, i*i*i);
//            }
//            System.out.println("Would you like to play again?");
//            playAgain = sorina.next();
//        }
//////////////////QUESTION 4///////////////////////
        Scanner grades = new Scanner(System.in);
        int x = 0;

        while(true) {
            System.out.println("Please enter your score to recieve your corresponding letter grade? ");
            x = grades.nextInt();

            if (x >= 0 && x <= 100)
                break;

            System.out.println("Please enter a number from 0 - 100!\n");
        }

        if (x <= 100 && x >= 96) {
            System.out.println("A+");
        }
        else if (x <= 95 && x >= 92) {
            System.out.println("A");
        }
        else if (x <= 91 && x >= 90) {
            System.out.println("A-");
        }
        else if (x <= 89 && x >= 50) {
            System.out.println("B+");
        }
        else if (x <= 49 && x >= 0) {
            System.out.println("B");
        }
    }
}
