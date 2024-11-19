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

   }
}
