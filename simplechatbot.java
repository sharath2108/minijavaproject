import java.util.Scanner;

public class SimpleChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("🤖 Hello! I'm ChatBot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("hi") || userInput.contains("hello")) {
                System.out.println("Bot: Hey there!");
            } else if (userInput.contains("how are you")) {
                System.out.println("Bot: I'm just a bot, but I'm doing fine. Thanks!");
            } else if (userInput.contains("your name")) {
                System.out.println("Bot: I'm SimpleChatBot.");
            } else if (userInput.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a great day 😊");
                break;
            } else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        scanner.close();
    }
}
