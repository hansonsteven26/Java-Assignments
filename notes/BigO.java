package notes;

public class BigO {
    public static void main(String[] args) {

        // O(1)
        // No loops at all, the program will run as fast as your processor
        // the size of the data does not determine how fast the program will run
        // The fastest notation

        // O(log n)
        // You have a loop, but you are shortening the size of that loop
        // so you don't have to loop as much
        // your program will run faster because your loop will not have as much
        // of a block on the program being shortened

        // O(n)
        // You have a loop (of any kind)
        // Your program will run as fast as the size of the data set
        // So the larger the data set, the longer it will take the program to run

        // O(n^2) (n squared)
        // Nested loopage. Not ideal, but sometimes necessary
        // When you have a situation where you need to have a loop inside of
        // another loop, you get this notation
        // Sometimes it's unavoidable, like with 2D Arrays,
        // or sometimes when comparing an array against itself
        // Don't be bummed for having 1 nested loop, be bummed for >1
    }
}
