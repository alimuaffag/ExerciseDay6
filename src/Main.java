import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Which question would you like to try? (1–6), or type 0 to exit: ");
            int questionNum = scan.nextInt();

            //I used a switch to build a simple menu system and respond to each option.
            switch (questionNum) {
                case 1:
                    //1.Write a Java program to test if the first and the last element of an array of
                    //integers are same. The length of the array must be greater than or equal to
                    //2 Test Data
                    firstQuestion(scan);
                    break;
                case 2:
                    //Write a Java program to find the numbers greater than the average of the
                    //numbers of a given array.
                    secondQuestion();
                    break;
                case 3:
                    //Write a Java program to get the larger value between first and last
                    //element of an array of integers.
                    thirdQuestion(scan);
                    break;
                case 4:
                    //Write a Java program to swap the first and last elements of an array and
                    //create a new array.
                    forthQuestion(scan);
                    break;
                case 5:
                    //Write a program that places the odd elements of an array before the
                    //even elements.
                    fifthQuestion();
                    break;
                case 6:
                    //Write a program that test the equality of two arrays.
                    sixthQuestion(scan);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Wrong entry, please try again");


            }
        }
    }

    static void firstQuestion(Scanner scan) {
        System.out.println("Enter size of array: ");
        int[] numbers = new int[scan.nextInt()];
        if (numbers.length >= 2) {
            for (int i = 0; i <= numbers.length - 1; i++) {
                System.out.println("Please Enter number: ");
                numbers[i] = scan.nextInt();
            }

            if (numbers[0] == numbers[numbers.length - 1]) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("Array element must be greater than 2");
        }
    }

    static void secondQuestion() {
        double sum = 0;
        double avg = 0;
        double[] numbers = {1, 4, 17, 7, 25, 3, 100};
        for (int i = 0; i <= numbers.length - 1; i++) {
            sum += numbers[i];
        }
        avg = sum / numbers.length - 1;
        System.out.println("The average of the said array is: " + avg);
        System.out.print("The numbers in the said array that are\n" +
                "greater than the average are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > avg) {
                System.out.println(numbers[i]);
            }
        }
    }

    static void thirdQuestion(Scanner scan) {
        System.out.println("Enter size of array: ");
        int size = scan.nextInt();
        int[] number = new int[size];
        int max = 0;
        for (int i = 0; i <= number.length - 1; i++) {
            System.out.println("Enter any number: ");
            number[i] = scan.nextInt();
        }
        for (int maxNumber : number) {
            if (maxNumber >= max) {
                max = maxNumber;
            }
        }
        System.out.println("Larger value between first and last element: : " + max);
    }

    static void forthQuestion(Scanner scan) {
        System.out.println("Enter size of array: ");
        int size = scan.nextInt();
        int[] numbers = new int[size];
        int swap = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.println("Enter any number: ");
            numbers[i] = scan.nextInt();
        }
        System.out.println("Original number is: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        swap = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = numbers[0];
        numbers[0] = swap;
        System.out.println("\nSwaped number is: ");
        for (int swapedNumber : numbers) {
            System.out.print(swapedNumber + " ");
        }
    }

    static void fifthQuestion() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(40);
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(4);
        numbers.add(10);
        numbers.add(7);
        System.out.println("Original Array: " + numbers);

        ArrayList<Integer> oddFirst = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddFirst.add(num);
            }
        }

        for (int num : numbers) {
            if (num % 2 == 0) {
                oddFirst.add(num);
            }
        }
        System.out.println("Odd first Array: " + oddFirst);

//
//        for (int i = 0; i <= numbers.size() - 1; i++) {
//            System.out.print(numbers);
//            System.out.println(" current number is " + numbers.get(i));
//            if (numbers.get(i) % 2 == 0) {
//                System.out.println("swap");
//                numbers.add(numbers.size(), numbers.get(i));
//                numbers.remove(i);
//            }
//        }
//        System.out.println("Odd first Array: " + numbers);
    }

    static void sixthQuestion(Scanner scan) {
        boolean isEqual = false;
        int[] firstNumber = {2, 3, 6, 6, 4};
        ArrayList<Integer> secondNumbers = new ArrayList<>();
        for (int i = 0; i <= firstNumber.length - 1; i++) {
            System.out.println("Please enter number: ");
            secondNumbers.add(i, scan.nextInt());
        }
        for (int i = 0; i <= firstNumber.length - 1; i++) {
            if (firstNumber[i] == secondNumbers.get(i)) {
                isEqual = true;
            } else {
                break;
            }
        }
        System.out.println(isEqual);
    }


}