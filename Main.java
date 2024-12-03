import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      
      boolean condition = false;
      // Statement inside a WHILE LOOP BODY will repeat 
      // until the condition is FALSE
      while (condition) {
         // STATEMENTS (instructions to be repeated)
         System.out.println("I'm tired");
         // While condition is false, the loop body won't execute
         // If we had set our condition to true, we'd have an INFINITE LOOP!
      }

      // THREE STEPS TO WRITE A LOOP
      // 1. Initialize the LOOP CONTROL variable
      int count = 1;
      // 2. Test the CONDITION in the loop header
      // here, the condition is "count<=10"
      // but it could also just be a boolean value
      while(count<=10) {
         // Execute statements in the loop body
         System.out.println(count);
         // 3. CHANGE your loop control variable
         count++; // equivalebt to count = count + 1;
      }

      // FOR LOOPS are "shortcuts" for looping when you know
      // how many times the loop should run
      for (int i = 0; i < 13; i++) {
         // LOOP BODY (process to be repeated)
         System.out.println("For loop, i = " +i);
      }

      // You can change the variable by anything!
      // What does this loop do? -->
      // How many times does it loop? -->
      for (int i = 8; i <=22; i+=2) {
         System.out.println ("For loop #2, i = " +i);
      }
      
      // BACKWARDS looping
      // You must change all 3 loop control parts!!
      for (int i = 12; i >=1; i--) {
         System.out.println(i + " bottles of coke on the wall");
         System.out.println(i + " bottles of coke");
         System.out.println("Take one down, pass it around");
         System.out.println((i - 1) + " bottles of coke on the wall");
         // check if on the last bottle (final iteration)
         if (i ==1) {
            System.out.println("They're all gone...");
         }
      }
 
      // *** LOOPS & STRINGS
      // WHILE loop -> find & replace characters
      String s = "Jackson dropped all of the chargers!";
      int i = 0; // loop counter (here, represents INDEX in String)
      // test condition: while 'a' is still in String s   
      while (s.indexOf("a") >= 0) {
         // get the first index of a
         i = s.indexOf("a");
         // replace character at that index
         String letter = s.substring(i, i+1);
         System.out.println("There is an " + letter + " at index " + i);
         // get the first part of the string
         String firstPart = s.substring(0, i);
         // get the last part of the string
         String lastPart = s.substring(i+1, s.length());
         // re-assign the string to a new version of it, with 'a' replaced
         s = firstPart + "@" + lastPart;
      }
      System.out.println("String after find & replace: " + s);
       
      // FOR loop --> reverse all characters of a String
      // use a FOR loop when you want to visit every 
      // Loop BACKWARDS as we build a new string
      int finalIndex = s.length() - 1;
      String reversedS = "";
      for (int index = finalIndex; index >= 0; index--) {
         // System.out.println("Current index: " + index);
         // System.out.println("Letter at index: " + s.substring(index, index+1));
         // Build our reversed version of String s
         // Convatenate with the letter at current index
         reversedS = reversedS + s.substring(index, index+1);
      }
      System.out.println("Reversed: " + reversedS);

      // NESTED LOOPS
      // outer loops (runs 3 times)
      for (int row = 1; row <= 10; row++) {
         // Inner loop (runs 5 times for each outer loops)
         for (int col = 1; col <= 8; col++) {
            // statement in ths loops body executes 15 total times
            System.out.print("🟪");
         }
         // after cols are printed, next line
         System.out.println();
      }
      
      
      // GUESSING GAME
      Scanner scan = new Scanner(System.in);
      // Choose a random number from 0-100
      int num = (int) (Math.random() * 100);
      
      // Ask the user to guess a number from 0 to 100
      System.out.println("Guess a number from 0 to 101");
      // Get the first guess using scan.nextInt();
      int guess = scan.nextInt();
      // This is an example of a SENTINEL while loop (like a "flag" to stop looping)
      // Loop while the guess does not equal the random number,
      while (guess != num) {     
         if (guess < num) {
            System.out.println("Too low!");
         } 
         else if (guess > num) {
            System.out.println("Too high!");
         }

      // Get a new guess (save it into the same variable)
      System.out.println("Guess again");
      guess =  scan.nextInt(); // LOOP CHANGE
      }

      // AFTER LOOP ENDS (meaning guess == num)
      System.out.println("You got it!");

   }
}
