// Q1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);

        Collections.shuffle(myArray);

        System.out.println(myArray);
    }
}


// Q2. Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(romanNumeral.charAt(i));

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        System.out.println("The integer equivalent is: " + result);
    }
}

// Q3. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
// from a-z) 

import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        boolean isPangram = checkPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram!");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean checkPangram(String input) {
        HashSet<Character> alphabetSet = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26;
    }
}
