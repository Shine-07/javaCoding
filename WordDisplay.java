//Problem Two

import java.util.Scanner;
public class WordDisplay {

    public static void main(String[] args) {

        String[] words = {"zero", "one", "two", "three", "four", "five", "six"};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer from 0 to 6: ");

        int num = input.nextInt();

        System.out.println("The corresponding word is: " + words[num]);

    }
    }