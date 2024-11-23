import java.util.Random;
import java.util.Scanner;
/*
 * MIT License
 * Copyright (c) 2024 Purohit1999
 */
public class EnhancedQuoteGenerator {
    // An array of inspiring and impressive quotes
    private static final String[] quotes = {
            "Be yourself; everyone else is already taken. - Oscar Wilde",
            "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe. - Albert Einstein",
            "You only live once, but if you do it right, once is enough. - Mae West",
            "The only way to do great work is to love what you do. - Steve Jobs",
            "In three words I can sum up everything I've learned about life: it goes on. - Robert Frost",
            "The best revenge is massive success. - Frank Sinatra",
            "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
            "Life is what happens when you're busy making other plans. - John Lennon",
            "Don't count the days, make the days count. - Muhammad Ali",
            "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
            "You miss 100% of the shots you don't take. - Wayne Gretzky",
            "Whether you think you can or you think you can't, you're right. - Henry Ford",
            "Act as if what you do makes a difference. It does. - William James",
            "Believe you can and you're halfway there. - Theodore Roosevelt",
            "If you want to lift yourself up, lift up someone else. - Booker T. Washington",
            "It always seems impossible until it’s done. - Nelson Mandela",
            "Your time is limited, so don’t waste it living someone else’s life. - Steve Jobs",
            "Happiness is not something ready-made. It comes from your own actions. - Dalai Lama"
    };

    public static void main(String[] args) {
        Random random = new Random(); // To generate random numbers
        Scanner scanner = new Scanner(System.in); // To take user input

        System.out.println("Welcome to the Random Quote Generator!");
        boolean continueGenerating = true;

        // Main loop to allow user interaction
        while (continueGenerating) {
            // Generate a random index and retrieve a quote
            int randomIndex = random.nextInt(quotes.length);
            String randomQuote = quotes[randomIndex];

            // Display the random quote
            System.out.println("\nHere is your random quote:");
            System.out.println("----------------------------------");
            System.out.println(randomQuote);
            System.out.println("----------------------------------");

            // Ask the user if they want another quote or to exit
            System.out.println("\nWould you like another quote? (yes/no)");
            String userResponse = scanner.nextLine().trim().toLowerCase();

            // Check user response
            if (userResponse.equals("no")) {
                continueGenerating = false;
                System.out.println("Thank you for using the Random Quote Generator. Have a great day!");
            } else if (!userResponse.equals("yes")) {
                System.out.println("Invalid input. Exiting program. Goodbye!");
                break;
            }
        }

        scanner.close(); // Close the scanner to free resources
    }
}
