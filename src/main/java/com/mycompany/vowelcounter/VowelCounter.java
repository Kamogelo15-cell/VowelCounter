/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcounter;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class VowelCounter {

   
    // Function to count vowels in a given sentence
    public static int countVowels(String sentence) {
        // Convert the sentence to lowercase for uniformity
        sentence = sentence.toLowerCase();
        
        // Vowels string for checking
        String vowels = "aeiou";
        int count = 0; // Initialize vowel count
        
        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i); // Get the current character
            
            // Check if the character is a vowel
            if (vowels.indexOf(currentChar) != -1) {
                count++; // Increment the count if it's a vowel
            }
        }
        return count; // Return the total count of vowels
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a sentence
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine(); // Read user input

        // Call the countVowels function and display the result
        int vowelCount = countVowels(userInput);
        System.out.println("Number of vowels in the sentence: " + vowelCount);

        // Close the scanner
        scanner.close();
    }
}