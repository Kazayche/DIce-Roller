import java.util.Random; //import random class

public class DiceRoll {
    public static void main(String[] args) {     
        Random rand = new Random();
        //need this for initalization and creates a random object in order to simulate dice tolld 

        // Roll two dice (each between 1 and 6)
        int die1 = rand.nextInt(6) + 1; //picks through numbers from 1-6 to match an actual dice 
        int die2 = rand.nextInt(6) + 1;

        // Display results
        System.out.println("You rolled:");
        printDie(die1);  //prints out the results and picks the art for the corrosponding value
        printDie(die2); //same logic applied here as well 
        System.out.println("Total: " + (die1 + die2)); //prints out the sum 
    }

    // Simple ASCII art for each die face
    public static void printDie(int n) { 
        //uses static because we are borrowing from static main method and takes the integer from our N values AKA our dice values and sets up drawings for each summation 
        System.out.println(" _______ ");
        // N is the die value which dictates how our dice is gonna look like 
        // used if-else statements
        if (n == 1) {
            System.out.println("|       |");
            System.out.println("|   o   |");
            System.out.println("|_______|");
        } else if (n == 2) {
            System.out.println("| o     |");
            System.out.println("|       |");
            System.out.println("|_____o_|");
        } else if (n == 3) {
            System.out.println("| o     |");
            System.out.println("|   o   |");
            System.out.println("|_____o_|");
        } else if (n == 4) {
            System.out.println("| o   o |");
            System.out.println("|       |");
            System.out.println("|_o___o_|");
        } else if (n == 5) {
            System.out.println("| o   o |");
            System.out.println("|   o   |");
            System.out.println("|_o___o_|");
        } else if (n == 6) {
            System.out.println("| o   o |");
            System.out.println("| o   o |");
            System.out.println("|_o___o_|");
        }

        System.out.println(); //prints out our drawings 
    }
}
