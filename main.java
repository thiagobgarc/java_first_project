import java.util.Scanner; // import user input package

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Initialize user input w/ Scanner

    String[] programLanguages = {"1. Javascript", "2. Java", "3. Python", "4. Go"}; // an array of Programming languages 
    int[] programNumbers = {1, 2, 3, 4}; // An array of numbers in correspondence of language

    System.out.println("What is your favorite programming language?: ");
    // For loop to display array
    // Did this because adding it directly caused weird string bug
    for (String nameProgram: programLanguages){ 
      System.out.println(nameProgram+ " ");
    }

   int chooseLanguages = 0; //Having this as scanner.nextInt outside the errorHandler will cause error bug if input is not a string
    // Which is why it is changed to an integer at 0
 
    try { // try
      chooseLanguages = scanner.nextInt(); // chooseLanguages input to scanner.nextInt() method
    } catch (java.util.InputMismatchException e) { // Catch imported java package
      System.out.println("Invalid input try again"); // Print error message
      scanner.close(); // close scanner
      return; // quit program early
    }

    boolean notFound = true;
    for (int numbers : programNumbers) {
      if (chooseLanguages == numbers) {
        notFound = false;
        break;
      }
    }

        switch (chooseLanguages) {
      case 1: System.out.println("That is not mine :/ ");
            break;
      case 2: System.out.println("REALLY? Mine, too! :D");
            break;
      case 3: System.out.println("Ehhh... It's alright.");
            break;
      case 4: System.out.println("A CLOSE SECOND :)");
            break;
      default: 
        break;
        }
    scanner.close();
  }
}
